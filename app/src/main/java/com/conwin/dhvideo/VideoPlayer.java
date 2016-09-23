package com.conwin.dhvideo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Gimo on 2016/9/21.
 */
public class VideoPlayer extends LinearLayout {

    SurfaceView mSurfaceView;
    View mRootView;
    View mViewloadding;
    TextView mTvLoadTitle;
    View mViewCtrl;
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
        mViewloadding = mRootView.findViewById(R.id.ll_loadding);
        mTvLoadTitle = (TextView) mRootView.findViewById(R.id.tv_load_title);
    }

    public SurfaceView getSurfaceView(){
        return  mSurfaceView;
    }

    public void setLoadingTitle(String title){
        mTvLoadTitle.setText(title);
    }

    public void showLoadding(boolean bEnable){
        if (bEnable){
            mViewloadding.setVisibility(View.VISIBLE);
        } else {
            mViewloadding.setVisibility(View.GONE);
        }
    }

    /*
  设置屏幕横竖屏
  1 竖屏
  2 横屏
   */
    public void setScreenOrientation(int value){
        ViewGroup.LayoutParams params = this.getLayoutParams();
        ViewGroup.LayoutParams svParams = mSurfaceView.getLayoutParams();
        if(value == 1){

            params.height = LayoutParams.WRAP_CONTENT;
            params.width = LayoutParams.MATCH_PARENT;

            svParams.height = LayoutParams.WRAP_CONTENT;
            svParams.width = LayoutParams.MATCH_PARENT;


        } else if (value == 2){
            params.height = LayoutParams.MATCH_PARENT;
            params.width = LayoutParams.MATCH_PARENT;

            svParams.height = LayoutParams.MATCH_PARENT;
            svParams.width = LayoutParams.WRAP_CONTENT;
        }
        this.setLayoutParams(params);
        mSurfaceView.setLayoutParams(svParams);

    }

}
