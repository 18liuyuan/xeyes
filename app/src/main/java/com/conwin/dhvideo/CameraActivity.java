package com.conwin.dhvideo;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.conwin.gimoutils.ACache;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import org.json.JSONException;
import org.json.JSONObject;

public class CameraActivity extends AppCompatActivity implements View.OnClickListener {

    ACache mACache;
    int mCameraId;
    JSONObject mCameraInfo;
    DhNetSdk mDhNetSdk;
    DhPlayerSdk mDhPlayerSdk;
    DhPlayerSdk mDhPlayerTalkSdk;

    MyRealStreamCalllBack mRealStreamCalllBack;
    MyAudioStreamCallBack mAudioStreamCalllBack;
    MyAudioRecordCallBack mAudioRecordCalllBack;
    MsgHandler mMsgHandler;
    int mChannel;
    // SurfaceView mSurfaceView;
    VideoPlayer mVideoPlayer;
    //IPlaySDK.PLAYInputData
    ImageView mIvFullScreen;
    ImageView mIvAudio;
    ImageView mIvTalk;
    ImageView mIvCamera;
    View mViewTitleBar;
    View mViewExtend;
    RelativeLayout mPlayerControl1;
    RelativeLayout mPlayerControl2;
    CameraEventListAdapter mCameraEventListAdapter;
    PullToRefreshListView mLvCameraEvent;

    boolean mAudioOn = false;
    boolean mTalkOn = false;

    interface MSG_DEF {
        int LOGIN_SUCCESS = 0;
        int LOGIN_FAILURE = 1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        mMsgHandler = new MsgHandler();
        TextView tvTitle = (TextView) findViewById(R.id.tv_tb_title);
        tvTitle.setText("视频");
        mIvFullScreen = (ImageView) findViewById(R.id.iv_full_screen);
        mIvAudio = (ImageView) findViewById(R.id.iv_audio);
        mIvTalk = (ImageView) findViewById(R.id.iv_talk);
        mIvCamera = (ImageView) findViewById(R.id.iv_camera);
        mLvCameraEvent = (PullToRefreshListView) findViewById(R.id.lv_event);

        mIvFullScreen.setOnClickListener(this);
        mIvAudio.setOnClickListener(this);
        mIvTalk.setOnClickListener(this);
        mIvCamera.setOnClickListener(this);
        // mSurfaceView = (SurfaceView) findViewById(R.id.sv_screen);
        mVideoPlayer = (VideoPlayer) findViewById(R.id.video_player);
//        INetSDK.LoadLibrarys();
//        INetSDK.LoadLibrarys();
//        INetSDK.LoadLibrarys();
        mACache = ACache.get(this, "dhvideo");
        mDhNetSdk = new DhNetSdk();
        mDhPlayerSdk = new DhPlayerSdk();
        mDhPlayerTalkSdk = new DhPlayerSdk();
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


        mViewTitleBar = findViewById(R.id.ll_title_bar);
        mViewExtend = findViewById(R.id.ll_extend);
        mPlayerControl1 = (RelativeLayout) findViewById(R.id.ll_player_ctrl1);
        mPlayerControl1.setOnClickListener(this);
        mPlayerControl2 = (RelativeLayout) findViewById(R.id.ll_player_ctrl2);
        mPlayerControl2.setOnClickListener(this);

        mVideoPlayer.setOnClickListener(this);

        mLvCameraEvent.setMode(PullToRefreshBase.Mode.BOTH);
        mLvCameraEvent.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {

            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
                //  FreshCameraListTask task = new FreshCameraListTask();
                //  task.execute("start");
                mLvCameraEvent.onRefreshComplete();
            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
                //   FreshCameraListTask task = new FreshCameraListTask();
                //   task.execute("start");
                mLvCameraEvent.onRefreshComplete();
            }
        });

        mLvCameraEvent.setOnPullEventListener(new PullToRefreshBase.OnPullEventListener<ListView>() {
            @Override
            public void onPullEvent(PullToRefreshBase<ListView> refreshView, PullToRefreshBase.State state, PullToRefreshBase.Mode direction) {

            }
        });

//        LayoutTransition transition=new LayoutTransition();
//        transition.getDuration(2000);
//        transition.setAnimator(LayoutTransition.APPEARING, AnimatorInflater.loadAnimator(getApplicationContext(), R.animator.smooth_appear_from_top));
//        transition.setAnimator(LayoutTransition.CHANGE_APPEARING, transition.getAnimator(LayoutTransition.CHANGE_APPEARING));
//        transition.setAnimator(LayoutTransition.DISAPPEARING, transition.getAnimator(LayoutTransition.DISAPPEARING));
//        transition.setAnimator(LayoutTransition.CHANGE_DISAPPEARING,transition.getAnimator(LayoutTransition.CHANGE_DISAPPEARING));
//        mPlayerControl1.setLayoutTransition(transition);

        mCameraEventListAdapter = new CameraEventListAdapter(this);
        mLvCameraEvent.setAdapter(mCameraEventListAdapter);

        mDhPlayerSdk.initPlayer();
        mDhPlayerTalkSdk.initTalkPlayer();
        mDhPlayerSdk.setSaveThumbEnable(true, "" + mCameraId);
        startRealPlay();
    }

    @Override
    protected void onDestroy() {

        mDhNetSdk.stopRealPlay();
        mDhNetSdk.logout();


        mDhPlayerSdk.stopPlayer();
        mDhPlayerSdk.unInitPlayer();
        mDhPlayerTalkSdk.unInitTalkPlayer();

        super.onDestroy();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_full_screen:
                switchFullScreen();
                break;
            case R.id.iv_audio:
                if (mTalkOn) {
                    Toast.makeText(this, "请先关闭对讲", Toast.LENGTH_SHORT).show();
                } else if (mAudioOn) {
                    mDhPlayerSdk.closeAudio();
                    mIvAudio.setImageResource(R.drawable.audio_off);
                    mAudioOn = false;
                } else {
                    int nRet = mDhPlayerSdk.openAudio();
                    if (nRet == 0) {
                        mIvAudio.setImageResource(R.drawable.audio_on);
                        mAudioOn = true;
                    } else {
                        Toast.makeText(this, "开启声音失败", Toast.LENGTH_SHORT).show();
                    }
                }
                break;
            case R.id.iv_talk:
                if (mAudioOn) {
                    Toast.makeText(this, "请先关闭声音", Toast.LENGTH_SHORT).show();
                } else if (mTalkOn) {
                    mDhNetSdk.stopTalk();
                    mIvTalk.setImageResource(R.drawable.talk_off);
                    mTalkOn = false;
                } else {
                    int nRet = mDhNetSdk.startTalk(new MyAudioStreamCallBack());
                    if (nRet == 0) {
                        mIvTalk.setImageResource(R.drawable.talk_on);
                        mTalkOn = true;
                        mDhPlayerSdk.startAudioRecord(new MyAudioRecordCallBack());
                    } else {
                        Toast.makeText(this, "开启对讲失败", Toast.LENGTH_SHORT).show();
                    }
                }
                break;
            case R.id.iv_camera:
                String curTimeStr = GlobalFunction.getCurrentTimeString("yyyy_MM_dd_HH_mm_ss");
                String saveFile = GlobalFunction.getStoreFile()+"/"+GlobalDefine.DIRS.CAMERA_CAPTURE+"/"+curTimeStr+".jpg";
                boolean bRet = mDhPlayerSdk.capturePic(saveFile);
                if (bRet){
                    Toast.makeText(this, "图片已保存到"+GlobalDefine.DIRS.CAMERA_CAPTURE, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "抓图失败", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.video_player:
                if (mPlayerControl1.getVisibility() == View.GONE) {
                    mPlayerControl1.setVisibility(View.VISIBLE);
                    mPlayerControl2.setVisibility(View.VISIBLE);

                    mPlayerControl1.setAnimation(AnimationUtils.loadAnimation(this, R.anim.smooth_appear_from_top));
                    mPlayerControl2.setAnimation(AnimationUtils.loadAnimation(this, R.anim.smooth_appear_from_bottom));
                } else {
                    mPlayerControl1.setVisibility(View.GONE);
                    mPlayerControl2.setVisibility(View.GONE);
                    mPlayerControl1.setAnimation(AnimationUtils.loadAnimation(this, R.anim.smooth_disappear_to_top));
                    mPlayerControl2.setAnimation(AnimationUtils.loadAnimation(this, R.anim.smooth_disappear_to_bottom));
                }

                break;
        }
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            mViewExtend.setVisibility(View.GONE);
            mViewTitleBar.setVisibility(View.GONE);
            WindowManager.LayoutParams attrs = getWindow().getAttributes();
            attrs.flags |= WindowManager.LayoutParams.FLAG_FULLSCREEN;
            getWindow().setAttributes(attrs);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

            mVideoPlayer.setScreenOrientation(2);


        } else if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            mViewExtend.setVisibility(View.VISIBLE);
            mViewTitleBar.setVisibility(View.VISIBLE);
            WindowManager.LayoutParams attrs = getWindow().getAttributes();
            attrs.flags &= (~WindowManager.LayoutParams.FLAG_FULLSCREEN);
            getWindow().setAttributes(attrs);
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

            mVideoPlayer.setScreenOrientation(1);

        }
    }

    void switchFullScreen() {
        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {

            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        } else if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
    }

    boolean startRealPlay() {
        String ip;
        int port;
        String user;
        String pwd;
        int channel;

        try {
            ip = mCameraInfo.getString("ip");
            port = mCameraInfo.getInt("port");
            user = mCameraInfo.getString("user");
            pwd = mCameraInfo.getString("pwd");
            channel = mCameraInfo.getInt("channel");
        } catch (JSONException e) {

            e.printStackTrace();
            return false;
        }
        mVideoPlayer.setLoadingTitle("正在连接设备");
        mVideoPlayer.showLoadding(true);

        mDhPlayerSdk.startPlayer(mVideoPlayer.getSurfaceView());
        mChannel = channel;
        mDhNetSdk.login(ip, port, user, pwd, new DhNetSdk.LoginResultCallBack() {
            @Override
            public void OnLoginResult(long lResult) {
                Message msg = Message.obtain();
                if (lResult == 0) {
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
    boolean capPicture() {
        return false;
    }

    //保存camera缩略图
    boolean saveCameraThumbPic() {
        return false;
    }

    private class MyRealStreamCalllBack implements DhNetSdk.RealStreamCalllBack {

        @Override
        public void invoke(long lRealHandle, int dwDataType, byte[] pBuffer, int dwBufSize, int param) {
            mDhPlayerSdk.inputData(pBuffer, pBuffer.length);
        }
    }

    private class MyAudioStreamCallBack implements DhNetSdk.AudioStreamCallBack {

        @Override
        public void invoke(long lTalkHandle, byte[] pDataBuf, byte byAudioFlag) {
            mDhPlayerTalkSdk.inputTalkData(pDataBuf, pDataBuf.length);
        }
    }

    private class MyAudioRecordCallBack implements DhPlayerSdk.AudioRecordCallBack {

        @Override
        public void invoke(byte[] bytes, int i, long l) {
            byte[] encodeData = mDhPlayerSdk.AudioEncode(bytes);
            mDhNetSdk.sendTalkDataToDevice(encodeData);
        }
    }

    class MsgHandler extends Handler {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == MSG_DEF.LOGIN_SUCCESS) {

                boolean bRet = mDhNetSdk.realPlay(mChannel, mRealStreamCalllBack);
                if (bRet) {

                } else {
                    Toast.makeText(CameraActivity.this, "播放失败", Toast.LENGTH_SHORT).show();
                }
                mVideoPlayer.showLoadding(false);
            } else if (msg.what == MSG_DEF.LOGIN_FAILURE) {
                Toast.makeText(CameraActivity.this, "登录失败", Toast.LENGTH_SHORT).show();
                mVideoPlayer.showLoadding(false);
            }

        }
    }

    class CameraEventListAdapter extends BaseAdapter {

        Context mContext;

        public CameraEventListAdapter(Context context) {
            mContext = context;
        }

        @Override
        public int getCount() {
            return 10;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            TextView tv = new TextView(mContext);

            tv.setText("测试评论" + (i + 1));
            return tv;
        }
    }

}
