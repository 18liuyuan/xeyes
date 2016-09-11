package com.conwin.dhvideo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.conwin.gimoutils.ACache;

import org.json.JSONException;
import org.json.JSONObject;

public class CameraActivity extends AppCompatActivity {

    ACache mACache;
    int mCameraId;
    JSONObject mCameraInfo;
    DhNetSdk mDhNetSdk;
    DhPlayerSdk mDhPlayerSdk;

    MyRealStreamCalllBack mRealStreamCalllBack;
    //IPlaySDK.PLAYInputData
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        TextView tvTitle = (TextView)findViewById(R.id.tv_tb_title);
        tvTitle.setText("视频");
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


        if(mDhNetSdk.mLoginHandle == 0){
            long lRet = 0;
            lRet = mDhNetSdk.login(ip, port, user, pwd );
            String loginResult = "";
            if (lRet == 0){
                loginResult = "登录失败";
                Toast.makeText(CameraActivity.this, loginResult, Toast.LENGTH_SHORT).show();
                return false;
            } else {
               // loginResult = "登录成功";
               // Toast.makeText(CameraActivity.this, loginResult, Toast.LENGTH_SHORT).show();
            }

        }

        SurfaceView sv = (SurfaceView) findViewById(R.id.sv_screen);
        mDhPlayerSdk.startPlayer(sv);
       boolean bRet =  mDhNetSdk.realPlay(channel, mRealStreamCalllBack );
        return bRet;
    }


    private class MyRealStreamCalllBack implements DhNetSdk.RealStreamCalllBack {

        @Override
        public void invoke(long lRealHandle, int dwDataType, byte[] pBuffer, int dwBufSize, int param) {
            mDhPlayerSdk.inputData(pBuffer, pBuffer.length);
        }
    }

    //抓图
    boolean capPicture(){
        return  false;
    }

    //保存camera缩略图
    boolean saveCameraThumbPic(){
        return false;
    }
}
