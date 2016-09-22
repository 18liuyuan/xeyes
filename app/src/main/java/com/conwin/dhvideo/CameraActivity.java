package com.conwin.dhvideo;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.conwin.gimoutils.ACache;

import org.json.JSONException;
import org.json.JSONObject;

public class CameraActivity extends AppCompatActivity implements View.OnClickListener {

    ACache mACache;
    int mCameraId;
    JSONObject mCameraInfo;
    DhNetSdk mDhNetSdk;
    DhPlayerSdk mDhPlayerSdk;

    MyRealStreamCalllBack mRealStreamCalllBack;
    MsgHandler mMsgHandler;
    int mChannel;
   // SurfaceView mSurfaceView;
    VideoPlayer mVideoPlayer;
    //IPlaySDK.PLAYInputData
    TextView mTvFullScreen;



    interface MSG_DEF{
        int LOGIN_SUCCESS = 0;
        int LOGIN_FAILURE = 1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        mMsgHandler = new MsgHandler();
        TextView tvTitle = (TextView)findViewById(R.id.tv_tb_title);
        tvTitle.setText("视频");
        mTvFullScreen = (TextView)findViewById(R.id.tv_fullscreen);
        mTvFullScreen.setOnClickListener(this);
       // mSurfaceView = (SurfaceView) findViewById(R.id.sv_screen);
        mVideoPlayer = (VideoPlayer) findViewById(R.id.video_player);
//        INetSDK.LoadLibrarys();
//        INetSDK.LoadLibrarys();
//        INetSDK.LoadLibrarys();
        mACache = ACache.get(this, "dhvideo");
        mDhNetSdk = new DhNetSdk();
        mDhPlayerSdk = new DhPlayerSdk();
        mRealStreamCalllBack = new MyRealStreamCalllBack();
        Bundle b = this.getIntent().getExtras();
        mCameraId = b.getInt("chId");
        try {
            mCameraInfo = mACache.getAsJSONArray("cameraList").getJSONObject(mCameraId);
            tvTitle.setText(mCameraInfo.getString("name"));

            TextView tvInfo = (TextView) findViewById(R.id.tv_info);
            StringBuilder info = new StringBuilder();
            info.append("名称:");
            info.append(mCameraInfo.get("name"));
            info.append("\r\n");

            info.append("IP:");
            info.append(mCameraInfo.get("ip"));
            info.append("\r\n");


            info.append("端口:");
            info.append(mCameraInfo.get("port"));
            info.append("\r\n");



            tvInfo.setText(info.toString());


        } catch (JSONException e) {
            e.printStackTrace();
        }

        ImageView ivLeft = (ImageView) findViewById(R.id.iv_tb_left);
        ivLeft.setImageResource(R.drawable.go_back);
        ivLeft.setVisibility(View.VISIBLE);
        ivLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



        mDhPlayerSdk.initPlayer();
        mDhPlayerSdk.setSaveThumbEnable(true, ""+mCameraId);
        startRealPlay();
    }

    @Override
    protected void onDestroy() {

        mDhNetSdk.stopRealPlay();
        mDhNetSdk.logout();


        mDhPlayerSdk.stopPlayer();
        mDhPlayerSdk.uninitPlayer();



        super.onDestroy();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_fullscreen:
                switchFullScreen();
                break;
        }
    }

    void switchFullScreen(){
        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {

            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        } else if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
    }

    boolean startRealPlay(){
        String ip ;
        int port ;
        String user ;
        String pwd ;
        int channel;

        try {
             ip = mCameraInfo.getString("ip");
             port = mCameraInfo.getInt("port");
             user = mCameraInfo.getString("user");
             pwd = mCameraInfo.getString("pwd");
             channel = mCameraInfo.getInt("channel");
        } catch (JSONException e) {

            e.printStackTrace();
            return  false;
        }
        mVideoPlayer.setLoadingTitle("正在连接设备");
        mVideoPlayer.showLoadding(true);

        mDhPlayerSdk.startPlayer(mVideoPlayer.getSurfaceView());
        mChannel = channel;
        mDhNetSdk.login(ip, port, user, pwd, new DhNetSdk.LoginResultCallBack() {
            @Override
            public void OnLoginResult(long lResult) {
                Message msg = Message.obtain();
                if (lResult == 0){
                    msg.what = MSG_DEF.LOGIN_FAILURE;
                } else {
                    msg.what = MSG_DEF.LOGIN_SUCCESS;
                }
                mMsgHandler.sendMessage(msg);
            }
        });



      return true;
    }





    //抓图
    boolean capPicture(){
        return  false;
    }

    //保存camera缩略图
    boolean saveCameraThumbPic(){
        return false;
    }

    private class MyRealStreamCalllBack implements DhNetSdk.RealStreamCalllBack {

        @Override
        public void invoke(long lRealHandle, int dwDataType, byte[] pBuffer, int dwBufSize, int param) {
            mDhPlayerSdk.inputData(pBuffer, pBuffer.length);
        }
    }

    class MsgHandler extends Handler {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == MSG_DEF.LOGIN_SUCCESS){

                boolean bRet =  mDhNetSdk.realPlay(mChannel, mRealStreamCalllBack );
                if (bRet){

                } else {
                    Toast.makeText(CameraActivity.this, "播放失败", Toast.LENGTH_SHORT).show();
                }
                mVideoPlayer.showLoadding(false);
            } else if (msg.what == MSG_DEF.LOGIN_FAILURE){
                Toast.makeText(CameraActivity.this, "登录失败", Toast.LENGTH_SHORT).show();
                mVideoPlayer.showLoadding(false);
            }

        }
    }

}
