package com.conwin.dhvideo;

import android.app.Application;
import android.os.Environment;

import com.facebook.drawee.backends.pipeline.Fresco;

import java.io.File;

/**
 * Created by Administrator on 2016/9/11.
 */
public class XeyesApplication extends Application {

    public String mDirRootPath="" ;
    @Override
    public void onCreate() {
        super.onCreate();
        initDirs();

        Fresco.initialize(this);
    }

    /*
    初始化本地存储目录
     */
    void initDirs(){
        File rootFile = GlobalFunction.getStoreFile();
        if (rootFile == null){
            return;
        }

        File tmpFile = new File(rootFile + "/" + GlobalDefine.DIRS.CAMERA_THUMB);
        if (!tmpFile.exists()) {
            tmpFile.mkdirs();
        }
    }
}
