package com.conwin.dhvideo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

public class CameraInsertActivity extends AppCompatActivity {

    ACache mACache;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_info);

        EventBus.getDefault().register(this);
        mACache = ACache.get(this, "dhvideo");

        TextView tvTitle = (TextView)findViewById(R.id.tv_tb_title);
        tvTitle.setText("添加镜头");

        ImageView ivLeft = (ImageView) findViewById(R.id.iv_tb_left);
        ivLeft.setImageResource(R.drawable.go_back);
        ivLeft.setVisibility(View.VISIBLE);
        ivLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        View vSave = findViewById(R.id.tv_save);
        vSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etName = (EditText) findViewById(R.id.et_name);
                EditText etIp = (EditText) findViewById(R.id.et_ip);
                EditText etPort = (EditText) findViewById(R.id.et_port);
                EditText etUser = (EditText) findViewById(R.id.et_user);
                EditText etPwd = (EditText) findViewById(R.id.et_pwd);
                EditText etCh = (EditText) findViewById(R.id.et_channel);

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
                    Toast.makeText(CameraInsertActivity.this, "数据填写有误", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                    return ;
                }


                if(sName.length() == 0 || sIp.length() ==0 || nPort < 0 || sUser.length()==0 || sPwd.length() ==0 || nCh < 0){
                    Toast.makeText(CameraInsertActivity.this, "数据填写有误", Toast.LENGTH_SHORT).show();
                    return ;
                }

                JSONObject jo = new JSONObject();
                try {
                    jo.put("name",sName);
                    jo.put("ip",sIp);
                    jo.put("port",nPort);
                    jo.put("user",sUser);
                    jo.put("pwd",sPwd);
                    jo.put("channel",sCh);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                JSONArray list =  mACache.getAsJSONArray("cameraList");
                if (list == null){
                    list = new JSONArray();
                }
                list.put(jo);
                mACache.put("cameraList", list);
                EventObject.CameraUpdate cu = new EventObject.CameraUpdate();
                EventBus.getDefault().post(cu);
               // setResult(RESULT_OK);
                finish();
            }
        });


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
