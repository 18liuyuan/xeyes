package com.conwin.dhvideo;

import com.company.NetSDK.CB_fDisConnect;
import com.company.NetSDK.CB_fHaveReConnect;
import com.company.NetSDK.CB_fRealDataCallBackEx;
import com.company.NetSDK.CB_fSubDisConnect;
import com.company.NetSDK.INetSDK;
import com.company.NetSDK.NET_DEVICEINFO;
import com.company.NetSDK.NET_PARAM;
import com.company.NetSDK.SDK_RealPlayType;

/**
 * Created by Administrator on 2016/9/10.
 */
public class DhNetSdk {

    long mLoginHandle = 0;
    long mRealStreamHandle = 0;
   // RealStreamCalllBack mRealStreamCallBack;



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


    public interface RealStreamCalllBack extends CB_fRealDataCallBackEx{

    }


    public long login(String ip, int port, String user, String pwd) {
        DeviceDisConnect disConnect = new DeviceDisConnect();
      //  mRealStreamCallBack = new RealStreamCalllBack();

        boolean zRet = INetSDK.Init(disConnect);

        INetSDK.SetConnectTime(3000, 3);
        NET_PARAM stNetParam = new NET_PARAM();
        stNetParam.nWaittime = 6 * 1000; // ����ȴ�ʱʱ��
        stNetParam.nSearchRecordTime = 20 * 1000; // ¼��طŲ�ѯ��ʱʱ��
        INetSDK.SetNetworkParam(stNetParam);

        NET_DEVICEINFO deviceInfo = new NET_DEVICEINFO();
        Integer error = new Integer(0);

        DeviceReConnect reConnect = new DeviceReConnect();
        INetSDK.SetAutoReconnect(reConnect);

        DeviceSubDisConnect subDisConnect = new DeviceSubDisConnect();
        INetSDK.SetSubconnCallBack(subDisConnect);

        int loginType = 20;
        long handle = INetSDK.LoginEx(ip, port, user, pwd,
                loginType, null, deviceInfo, error);
        if (handle != 0) {
            mLoginHandle = handle;
        } else {

        }
        return handle;
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


}
