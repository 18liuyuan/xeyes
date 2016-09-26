package com.conwin.dhvideo;

import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.company.NetSDK.INetSDK;
import com.company.PlaySDK.Constants;
import com.company.PlaySDK.IPlaySDK;
import com.company.PlaySDK.IPlaySDKCallBack;

import java.io.File;

/**
 * Created by Administrator on 2016/9/10.
 */
public class DhPlayerSdk {

    int mPlayPort = -1;
    int mPlayType = 1;
    SurfaceHolder mSurfaceHolder;
    SurfaceView mSurfaceView;
    String mCameraId = "";
    int mTalkPort = 99;
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

    public boolean initTalkPlayer(){
        //初始化音频解码

        int nRet = IPlaySDK.PLAYOpenStream(mTalkPort, null, 0, 1024 * 1024);
        nRet = IPlaySDK.PLAYPlay(mTalkPort, null);
        nRet = IPlaySDK.PLAYPlaySoundShare(mTalkPort);
        IPlaySDK.PLAYSetVolume(mTalkPort, 0xffff);
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
        stopAudoRecord();
        IPlaySDK.PLAYStop(mPlayPort);
        IPlaySDK.PLAYStopSoundShare(mPlayPort);
        IPlaySDK.PLAYCloseStream(mPlayPort);
        IPlaySDK.UinitSurface(mPlayPort);
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
            String saveFile = GlobalFunction.getStoreFile()+"/"+GlobalDefine.DIRS.CAMERA_THUMB+"/"+"camera"+mCameraId+".jpg";
            File oldFile = new File(saveFile);
            oldFile.delete();
            boolean bRet = capturePic(saveFile);
            if (bRet) mSaveThumbFlg = SAVE_THUMB_PIC_FLG.SAVED;
        }
        return lRet==0?false:true;
    }

    public boolean inputTalkData(byte[] pBuffer, int dwBufSize){
        int lRet =  IPlaySDK.PLAYInputData(mTalkPort, pBuffer,
                pBuffer.length);
        if (lRet == 0){
            Integer iR = new Integer(0);
            IPlaySDK.PLAYGetLastError(iR);
            System.out.println();
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

    /*
   return
   0 成功
   <0失败
   -1 未播放视频
   -2 开启声音失败
    */
    public int openAudio(){

        if(mPlayPort < 0 ){
            return  -1;
        }
       int nRet =  IPlaySDK.PLAYPlaySoundShare(mPlayPort);
        return nRet==0?-2:0;
    }

    public void closeAudio(){
        if (mPlayPort>-1) {
            IPlaySDK.PLAYStopSoundShare(mPlayPort);
        }
    }

    public boolean startAudioRecord(AudioRecordCallBack cb){
        int nFrameLength = 1280;// G711a

        int nRet = IPlaySDK.PLAYOpenAudioRecord(cb, 16, 8000,
                nFrameLength, 0);
        return  nRet==0?false:true;
    }

    public void stopAudoRecord(){
        IPlaySDK.PLAYCloseAudioRecord();
    }

    public byte[] AudioEncode(byte[] pDataBuffer) {
        int DataLength = pDataBuffer.length;

        byte pbOut[] = new byte[102400];
        int iCbLen = INetSDK.g711aEncode(pDataBuffer, pbOut, DataLength);

        byte pCbData[] = null;
        pCbData = new byte[iCbLen + 8];

        // bit stream format frame head
        pCbData[0] = 0x00;
        pCbData[1] = 0x00;
        pCbData[2] = 0x01;
        pCbData[3] = (byte) 0xF0;

        pCbData[4] = 0x0E; // G711A
        pCbData[5] = 0x02;// dwSampleRate 8k //pCbData[5] = 0x04; //dwSampleRate
        // = 16K

        pCbData[6] = (byte) (iCbLen & 0xff);
        pCbData[7] = (byte) (iCbLen >> 8);
        System.arraycopy(pbOut, 0, pCbData, 8, iCbLen);
        return pCbData;

    }

    public void unInitPlayer(){
        IPlaySDK.UinitSurface(mPlayPort);
    }

    public void unInitTalkPlayer(){
        //音频反初始化
       // IPlaySDK.PLAYCloseAudioRecord();
        IPlaySDK.PLAYStop(mTalkPort);
        IPlaySDK.PLAYStopSoundShare(mTalkPort);
        IPlaySDK.PLAYCloseStream(mTalkPort);
    }
    public  interface AudioRecordCallBack extends IPlaySDKCallBack.pCallFunction{

    }
}
