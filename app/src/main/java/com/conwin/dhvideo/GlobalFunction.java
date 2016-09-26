package com.conwin.dhvideo;

import android.os.Environment;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    /*
    format 参考yyyy_MM_dd_HH_mm_ss
     */
    static public String getCurrentTimeString(String format){

            SimpleDateFormat formatter = new SimpleDateFormat(format);
            Date curDate = new Date(System.currentTimeMillis());//
            String time = formatter.format(curDate);
            return time;
    }
}
