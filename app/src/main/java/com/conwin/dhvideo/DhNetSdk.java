package com.conwin.dhvideo;

import android.util.Log;

import com.company.NetSDK.CB_fDisConnect;
import com.company.NetSDK.CB_fHaveReConnect;
import com.company.NetSDK.CB_fRealDataCallBackEx;
import com.company.NetSDK.CB_fSubDisConnect;
import com.company.NetSDK.CB_pfAudioDataCallBack;
import com.company.NetSDK.EM_USEDEV_MODE;
import com.company.NetSDK.INetSDK;
import com.company.NetSDK.NET_DEVICEINFO;
import com.company.NetSDK.NET_PARAM;
import com.company.NetSDK.SDKDEV_TALKDECODE_INFO;
import com.company.NetSDK.SDK_RealPlayType;
import com.company.NetSDK.SDK_TALK_CODING_TYPE;

/**
 * Created by Administrator on 2016/9/10.
 */
public class DhNetSdk {

    long mLoginHandle = 0;
    long mRealStreamHandle = 0;
    long mTalkHandle = 0;
    boolean mLogining = false;//正在登陆

   // RealStreamCalllBack mRealStreamCallBack;
    LoginResultCallBack mLoginResultCallBack;


    class DeviceDisConnect implements CB_fDisConnect {
        @Override
        public void invoke(long lLoginID, String pchDVRIP, int nDVRPort) {

            return;
        }
    }

    public class DeviceReConnect implements CB_fHaveReConnect {
        @Override
        public void invoke(long lLoginID, String pchDVRIP, int nDVRPort) {

        }
    }

    public class DeviceSubDisConnect implements CB_fSubDisConnect {
        @Override
        public void invoke(int emInterfaceType, boolean bOnline,
                           long lOperateHandle, long lLoginID) {

        }
    }

    class LoginRunnable implements  Runnable{
        String _ip,_user,_pwd;
        int _port;
        public LoginRunnable(String ip, int port, String user, String pwd) {
            _ip = ip;
            _port = port;
            _user = user;
            _pwd = pwd;

        }

        @Override
        public void run() {

            mLogining = true;
          //  INetSDK.Cleanup();
            DeviceDisConnect disConnect = new DeviceDisConnect();
            boolean zRet = INetSDK.Init(disConnect);

            INetSDK.SetConnectTime(3000, 3);
            NET_PARAM stNetParam = new NET_PARAM();
            stNetParam.nWaittime = 6 * 1000; // ??????????
            stNetParam.nSearchRecordTime = 20 * 1000; // ?????????????
            INetSDK.SetNetworkParam(stNetParam);

            NET_DEVICEINFO deviceInfo = new NET_DEVICEINFO();
            Integer error = new Integer(0);

            DeviceReConnect reConnect = new DeviceReConnect();
            INetSDK.SetAutoReconnect(reConnect);

            DeviceSubDisConnect subDisConnect = new DeviceSubDisConnect();
            INetSDK.SetSubconnCallBack(subDisConnect);

            int loginType = 20;
            long handle = INetSDK.LoginEx(_ip, _port, _user, _pwd,
                    loginType, null, deviceInfo, error);
            if (handle != 0) {
                mLoginHandle = handle;
            }
            if (mLoginResultCallBack != null){
                mLoginResultCallBack.OnLoginResult(handle);
            }
            mLogining = false;
        }
    }

    public interface RealStreamCalllBack extends CB_fRealDataCallBackEx{

    }

    public interface  AudioStreamCallBack extends CB_pfAudioDataCallBack{

    }


    public interface LoginResultCallBack {
        void OnLoginResult(long lResult);
    }

    public long login(String ip, int port, String user, String pwd, LoginResultCallBack callBack) {
        if (mLogining){
            return 0;
        }
        if (callBack == null){
            return 0;
        }
        mLoginResultCallBack = callBack;

        new Thread( new LoginRunnable(ip, port, user, pwd)).start();

        return 0;
    }

    public boolean logout() {
        boolean bRet = INetSDK.Logout(mLoginHandle);
        mLoginHandle = 0;
        return bRet;
    }

//    public long setRealStreamCallBack() {
//        return 0;
//    }

    public boolean realPlay(int channel, RealStreamCalllBack callback) {

        long handler = INetSDK.RealPlayEx(mLoginHandle, channel-1, SDK_RealPlayType.SDK_RType_Realplay_0);
        if (handler != 0) {
           // mRealStreamCallBack = callback;
            INetSDK.SetRealDataCallBackEx(handler, callback, 1);
        }
        mRealStreamHandle  = handler;
        return mRealStreamHandle==0?false:true;
    }

    public void stopRealPlay() {
        if(mRealStreamHandle!=0){
            INetSDK.StopRealPlay(mRealStreamHandle);
        }
        mRealStreamHandle = 0;

    }

    /*
    return
    0 成功
    <0失败
    -1 未播放视频
    -2 开启对讲失败
     */
    public int startTalk(AudioStreamCallBack cb){
        if (mLoginHandle == 0  || mRealStreamHandle == 0){
            return -1;
        }
        if (false == INetSDK.SetDeviceMode(mLoginHandle,
                EM_USEDEV_MODE.SDK_TALK_CLIENT_MODE, null)) {
            Log.i("player",
                    "startTalkEx SetDeviceMode SDK_TALK_SERVER_MODE error");
            return -2;
        }

        SDKDEV_TALKDECODE_INFO decodeInfo = new SDKDEV_TALKDECODE_INFO();
        decodeInfo.dwSampleRate = 8000;
        decodeInfo.encodeType = SDK_TALK_CODING_TYPE.SDK_TALK_G711a;
        decodeInfo.nAudioBit = 16;
        decodeInfo.nPacketPeriod = 0;

        if (false == INetSDK.SetDeviceMode(mLoginHandle,
                EM_USEDEV_MODE.SDK_TALK_ENCODE_TYPE, decodeInfo)) {
            return -2;
        }

       // AudioStreamCallBack audiaDatacb = new AudioStreamCallBack(cb);
        mTalkHandle = INetSDK.StartTalkEx(mLoginHandle, cb);

        if (mTalkHandle == 0) {
            // boolean b = INetSDK.RecordStart();
            int err = INetSDK.GetLastError();
            Log.i("player", "INetSDK.RecordStart error,code=" + err);
            System.out.println();
            return -1;
        }
        return 0;
        //startAudioRecord();
    }

    public void stopTalk(){
        INetSDK.StopTalkEx(mTalkHandle);
        mTalkHandle = 0;
    }

    public boolean sendTalkDataToDevice(byte[] data){
       int nRet = INetSDK.TalkSendData(mTalkHandle, data);
        return nRet==0?false:true;
    }
}
