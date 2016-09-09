package com.conwin.dhvideo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);


        ImageView ivLeft = (ImageView) findViewById(R.id.iv_tb_left);
        ivLeft.setVisibility(View.VISIBLE);
        ivLeft.setImageResource(R.drawable.go_back);
        ivLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        TextView tvTitle = (TextView)findViewById(R.id.tv_tb_title);
        tvTitle.setText("设置");

        LinearLayout llCameraManager = (LinearLayout) findViewById(R.id.ll_camera_manager);
        llCameraManager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iCamMan = new Intent(SetActivity.this, CameraManagerActivity.class);
                startActivity(iCamMan);
            }
        });


    }
}
