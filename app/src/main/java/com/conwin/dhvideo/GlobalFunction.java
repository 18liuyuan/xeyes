package com.conwin.dhvideo;

import android.os.Environment;

import java.io.File;

/**
 * Created by Administrator on 2016/9/12.
 */
public class GlobalFunction {

  static public  File getStoreFile(){
        File fRet = null;
        if(Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)){
            //执行存储sdcard方法
            fRet =  Environment.getExternalStorageDirectory();
        }
        return  fRet;
    }
}
