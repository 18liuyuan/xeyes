package com.conwin.dhvideo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.conwin.gimoutils.ACache;

import org.json.JSONException;
import org.json.JSONObject;

public class CameraActivity extends AppCompatActivity {

    ACache mACache;
    int mCameraId;
    JSONObject mCameraInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        TextView tvTitle = (TextView)findViewById(R.id.tv_tb_title);
        tvTitle.setText("视频");

        mACache = ACache.get(this, "dhvideo");

        Bundle b = this.getIntent().getExtras();
        mCameraId = b.getInt("chId");
        try {
            mCameraInfo = mACache.getAsJSONArray("cameraList").getJSONObject(mCameraId);
            tvTitle.setText(mCameraInfo.getString("name"));

            TextView tvInfo = (TextView) findViewById(R.id.tv_info);
            StringBuilder info = new StringBuilder();
            info.append("名称:");
            info.append(mCameraInfo.get("name"));
            info.append("\r\n");

            info.append("IP:");
            info.append(mCameraInfo.get("ip"));
            info.append("\r\n");


            info.append("端口:");
            info.append(mCameraInfo.get("port"));
            info.append("\r\n");



            tvInfo.setText(info.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }

        ImageView ivLeft = (ImageView) findViewById(R.id.iv_tb_left);
        ivLeft.setImageResource(R.drawable.go_back);
        ivLeft.setVisibility(View.VISIBLE);
        ivLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
