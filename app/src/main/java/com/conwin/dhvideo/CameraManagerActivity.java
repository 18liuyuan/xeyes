package com.conwin.dhvideo;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.conwin.gimoutils.ACache;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class CameraManagerActivity extends AppCompatActivity {

    ListView mLvCamera;
    List<JSONObject> mListCamera;
    LayoutInflater mInflater;
    CameraListAdapter mCameraAdapter;
    ACache mACache;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_manager);

        EventBus.getDefault().register(this);
        mInflater = this.getLayoutInflater();
        mACache = ACache.get(this, "dhvideo");
        ImageView ivLeft = (ImageView) findViewById(R.id.iv_tb_left);
        ivLeft.setImageResource(R.drawable.go_back);
        ivLeft.setVisibility(View.VISIBLE);
        ivLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        TextView tvRight = (TextView)findViewById(R.id.tv_tb_right);
        tvRight.setText("添加");
        tvRight.setVisibility(View.VISIBLE);
        tvRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iInsert = new Intent(CameraManagerActivity.this, CameraInsertActivity.class);
                startActivity(iInsert);


            }
        });


        TextView tvTitle = (TextView)findViewById(R.id.tv_tb_title);
        tvTitle.setText("镜头管理");

        mLvCamera = (ListView) findViewById(R.id.lv_camera);
        mListCamera = new ArrayList<JSONObject>();

        mCameraAdapter = new CameraListAdapter();
        mLvCamera.setAdapter(mCameraAdapter);
        initCameraList();
    }


//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if(requestCode == 100 && resultCode == RESULT_OK){
//            initCameraList();
//        }
//        super.onActivityResult(requestCode, resultCode, data);
//
//    }

    @Override
    public void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

    void initCameraList(){
        mListCamera.clear();
        ACache cache = ACache.get(this,"dhvideo");
        JSONArray cameraList = cache.getAsJSONArray("cameraList");
        for (int i=0;cameraList!=null && i<cameraList.length();i++){
            try {
                mListCamera.add(cameraList.getJSONObject(i));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        mCameraAdapter.notifyDataSetChanged();

    }


    class CameraListAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return mListCamera.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            if(convertView == null){
                convertView = mInflater.inflate(R.layout.manager_camera_item, null);
            }
            JSONObject jCamera =  mListCamera.get(position);
            String cameraName = "";
            try {
                cameraName = jCamera.getString("name");
            } catch (JSONException e) {
                e.printStackTrace();
            }

            TextView tvName = (TextView) convertView.findViewById(R.id.tv_name);
            tvName.setText(cameraName);
            convertView.setTag(position);
            convertView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                   int positon = (int) v.getTag();
                   // mListCamera.get(position);
                    navigateDeleteCamera(position);
                    return false;
                }
            });

            convertView.setTag(position);
            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position  = Integer.parseInt(view.getTag().toString());
                    Bundle b = new Bundle();
                    b.putInt("cameraId", position);
                    Intent iEdit = new Intent(CameraManagerActivity.this, CameraEditActivity.class);
                    iEdit.putExtras(b);
                    startActivity(iEdit);
                }
            });
            return convertView;
        }
    }

    void navigateDeleteCamera(final int postion){

        JSONObject jo = mListCamera.get(postion);
        String name = "";
        try {
            name = jo.getString("name");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        new AlertDialog.Builder(this)

                .setTitle("是否删除镜头:"+name+"?")
                .setNegativeButton("否", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("是", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        JSONArray ja = mACache.getAsJSONArray("cameraList");
                        JSONArray newArr = new JSONArray();
                        for (int i=0;i<ja.length();i++){
                            if(i != postion){
                                try {
                                    newArr.put(ja.getJSONObject(i));
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                        mACache.put("cameraList", newArr);
                        EventObject.CameraUpdate cu = new EventObject.CameraUpdate();
                        EventBus.getDefault().post(cu);
                        //EventBus.getDefault().register(this);
                    }
                })
                .show();
    }



    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPostEvent(EventObject.CameraUpdate cu){

        initCameraList();
    }

}
