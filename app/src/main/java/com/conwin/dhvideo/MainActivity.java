package com.conwin.dhvideo;

import android.content.Intent;
import android.os.Bundle;
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


public class MainActivity extends AppCompatActivity {

    ListView mLvCamera;
    List<JSONObject> mListCamera;
    LayoutInflater mInflater;
    CameraListAdapter mCameraAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EventBus.getDefault().register(this);
        mInflater = this.getLayoutInflater();
        TextView tvRight = (TextView)findViewById(R.id.tv_tb_right);
        tvRight.setText("设置");
        tvRight.setVisibility(View.VISIBLE);
        tvRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iSet = new Intent(MainActivity.this, SetActivity.class);
                startActivity(iSet);
            }
        });

        TextView tvTitle = (TextView)findViewById(R.id.tv_tb_title);
        tvTitle.setText("我的视频");

        mLvCamera = (ListView) findViewById(R.id.lv_camera);
        mListCamera = new ArrayList<JSONObject>();

        mCameraAdapter = new CameraListAdapter();
        mLvCamera.setAdapter(mCameraAdapter);
        initCameraList();

    }

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


    class CameraListAdapter extends BaseAdapter{

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
        public View getView(int position, View convertView, ViewGroup parent) {
            if(convertView == null){
                convertView = mInflater.inflate(R.layout.main_camera_item, null);
            }
           JSONObject jCamera =  mListCamera.get(position);
            String cameraName = "";
            try {
                cameraName = jCamera.getString("name");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            ImageView ivPic = (ImageView) convertView.findViewById(R.id.iv_camera_pic);
            TextView tvName = (TextView) convertView.findViewById(R.id.tv_name);
            tvName.setText(cameraName);
            return convertView;
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPostEvent(EventObject.CameraUpdate cu) {
        initCameraList();
      //  Toast.makeText(getActivity(), event.message, Toast.LENGTH_SHORT).show();
    }
}
