package com.conwin.dhvideo;

import android.provider.Settings;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.company.PlaySDK.Constants;
import com.company.PlaySDK.IPlaySDK;

/**
 * Created by Administrator on 2016/9/10.
 */
public class DhPlayerSdk {

    int mPlayPort = -1;
    int mPlayType = 1;
    SurfaceHolder mSurfaceHolder;
    SurfaceView mSurfaceView;
    String mCameraId = "";
    /* 预览图片生成标志
     1 不生成视频预览图片
     2 等待生成预览图片
     3 已经生成预览图片
     */

    public interface SAVE_THUMB_PIC_FLG{
        int WITHOUT_SAVE = 1;
        int WAIT_SAVE = 2;
        int SAVED = 3;
    }

    int mSaveThumbFlg = SAVE_THUMB_PIC_FLG.WITHOUT_SAVE;

    public boolean initPlayer() {

        mPlayPort = IPlaySDK.PLAYGetFreePort();
        int nOpenRet = IPlaySDK.PLAYOpenStream(mPlayPort, null, 0,
                1024 * 1024 * 2);
        if (mPlayType == 1) {
            IPlaySDK.PLAYSetStreamOpenMode(mPlayPort,
                    Constants.STREAME_REALTIME);
        } else {
            IPlaySDK.PLAYSetStreamOpenMode(mPlayPort, Constants.STREAME_FILE);
        }

        return true;
    }

    public boolean startPlayer(SurfaceView surfaceView){

        int nPlayRet = IPlaySDK.PLAYPlay(mPlayPort, surfaceView);
        if (nPlayRet == 0) {
            IPlaySDK.PLAYCloseStream(mPlayPort);
            mPlayPort = -1;

        }
        mSurfaceView = surfaceView;

//        //初始化音频解码
//        int nRet = IPlaySDK.PLAYOpenStream(m_nTalkPort, null, 0, 1024 * 1024);
//        nRet = IPlaySDK.PLAYPlay(m_nTalkPort, null);
//        nRet = IPlaySDK.PLAYPlaySoundShare(m_nTalkPort);

        mSurfaceHolder = surfaceView.getHolder();

        mSurfaceHolder.addCallback(new SurfaceHolder.Callback() {

            public void surfaceCreated(SurfaceHolder holder) {
                IPlaySDK.InitSurface(mPlayPort, mSurfaceView);
            }

            public void surfaceChanged(SurfaceHolder holder, int format,
                                       int width, int height) {



                holder.setFixedSize(width, height);
            }

            public void surfaceDestroyed(SurfaceHolder holder) {

            }
        });

        return true;
    }

    public void stopPlayer(){
        IPlaySDK.PLAYStop(mPlayPort);
        IPlaySDK.PLAYStopSoundShare(mPlayPort);
        IPlaySDK.PLAYCloseStream(mPlayPort);

    }


    public boolean inputData(byte[] pBuffer, int dwBufSize){
       int lRet =  IPlaySDK.PLAYInputData(mPlayPort, pBuffer,
                pBuffer.length);
        if (lRet == 0){
            Integer iR = new Integer(0);
            IPlaySDK.PLAYGetLastError(iR);
            System.out.println();
        } else if(mSaveThumbFlg == SAVE_THUMB_PIC_FLG.WAIT_SAVE){
            // mSaveThumbFlg = SAVE_THUMB_PIC_FLG.SAVED;
            String saveFile = GlobalFunction.getStoreFile()+"/"+GlobalDefine.DIRS.CAMERA_THUMB+"/"+"camera"+mCameraId;
            boolean bRet = capturePic(saveFile);
            if (bRet) mSaveThumbFlg = SAVE_THUMB_PIC_FLG.SAVED;
        }
        return lRet==0?false:true;
    }

    //抓图
    public boolean capturePic(String path){
        if (mPlayPort < 0){
            return  false;
        }
        int nRet =  IPlaySDK.PLAYCatchPicEx(mPlayPort, path, Constants.PicFormat_JPEG);
        return  nRet==0?false:true;
    }

    public void setSaveThumbEnable(boolean enable, String cameraId){
        mCameraId = cameraId;
        mSaveThumbFlg = enable?SAVE_THUMB_PIC_FLG.WAIT_SAVE:SAVE_THUMB_PIC_FLG.WITHOUT_SAVE;

    }

    public void uninitPlayer(){
        IPlaySDK.UinitSurface(mPlayPort);
    }

}
