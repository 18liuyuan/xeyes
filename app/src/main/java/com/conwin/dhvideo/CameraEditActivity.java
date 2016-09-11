package com.conwin.dhvideo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.conwin.gimoutils.ACache;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CameraEditActivity extends AppCompatActivity {

    ACache mACache;
    int mCameraId = -1;

    EditText etName ;
    EditText etIp ;
    EditText etPort ;
    EditText etUser ;
    EditText etPwd ;
    EditText etCh ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_edit);

        EventBus.getDefault().register(this);
        mACache = ACache.get(this, "dhvideo");
        findView();
        Bundle b = this.getIntent().getExtras();
        mCameraId = b.getInt("cameraId");
        TextView tvTitle = (TextView)findViewById(R.id.tv_tb_title);
        tvTitle.setText("修改镜头");

        ImageView ivLeft = (ImageView) findViewById(R.id.iv_tb_left);
        ivLeft.setImageResource(R.drawable.go_back);
        ivLeft.setVisibility(View.VISIBLE);
        ivLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        TextView tvRight = (TextView) findViewById(R.id.tv_tb_right);
        tvRight.setText("删除");
        tvRight.setVisibility(View.VISIBLE);
        tvRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        View vSave = findViewById(R.id.tv_save);
        vSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String sName = etName.getText().toString();
                String sIp = etIp.getText().toString().trim();
                String sPort = etPort.getText().toString();
                String sUser = etUser.getText().toString();
                String sPwd = etPwd.getText().toString();
                String sCh = etCh.getText().toString();

                int nPort = -1;
                int nCh = -1;
                try {
                    nPort = Integer.parseInt(sPort);
                    nCh = Integer.parseInt(sCh);
                } catch (NumberFormatException e) {
                    Toast.makeText(CameraEditActivity.this, "数据填写有误", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                    return ;
                }


                if(sName.length() == 0 || sIp.length() ==0 || nPort < 0 || sUser.length()==0 || sPwd.length() ==0 || nCh < 0){
                    Toast.makeText(CameraEditActivity.this, "数据填写有误", Toast.LENGTH_SHORT).show();
                    return ;
                }

                //JSONObject jo = new JSONObject();
                try {
                    JSONArray list =  mACache.getAsJSONArray("cameraList");
                    JSONObject jo = list.getJSONObject(mCameraId);
                    jo.put("name",sName);
                    jo.put("ip",sIp);
                    jo.put("port",nPort);
                    jo.put("user",sUser);
                    jo.put("pwd",sPwd);
                    jo.put("channel",sCh);
                    mACache.put("cameraList", list);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                EventObject.CameraUpdate cu = new EventObject.CameraUpdate();
                EventBus.getDefault().post(cu);
                // setResult(RESULT_OK);
                finish();
            }
        });

        initData();

    }

    void findView(){
         etName = (EditText) findViewById(R.id.et_name);
         etIp = (EditText) findViewById(R.id.et_ip);
         etPort = (EditText) findViewById(R.id.et_port);
         etUser = (EditText) findViewById(R.id.et_user);
         etPwd = (EditText) findViewById(R.id.et_pwd);
         etCh = (EditText) findViewById(R.id.et_channel);
    }
    void initData(){
        JSONArray list =  mACache.getAsJSONArray("cameraList");
        try {
            JSONObject camera = list.getJSONObject(mCameraId);
            if(camera.has("name")) {
                etName.setText(camera.getString("name"));
            }
            if(camera.has("ip")) {
                etIp.setText(camera.getString("ip"));
            }
            if(camera.has("user")) {
                etUser.setText(camera.getString("user"));
            }
            if(camera.has("pwd")) {
                etPwd.setText(camera.getString("pwd"));
            }
            if(camera.has("port")) {
                etPort.setText(""+camera.getInt("port"));
            }
            if(camera.has("channel")) {
                etCh.setText(""+camera.getInt("channel"));
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPostEvent(EventObject.CameraUpdate cu){

    }

    @Override
    public  void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }
}
