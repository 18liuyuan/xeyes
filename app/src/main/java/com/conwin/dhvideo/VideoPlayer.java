package com.conwin.dhvideo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by Gimo on 2016/9/21.
 */
public class VideoPlayer extends LinearLayout {

    SurfaceView mSurfaceView;
    View mRootView;
    public VideoPlayer(Context context) {
        super(context);
        initView(context);
    }

    public VideoPlayer(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    void initView(Context context){
        mRootView = LayoutInflater.from(context).inflate(R.layout.video_player, this, true);
        mSurfaceView = (SurfaceView) mRootView.findViewById(R.id.sv_screen);
    }

    public SurfaceView getSurfaceView(){
        return  mSurfaceView;
    }

}
