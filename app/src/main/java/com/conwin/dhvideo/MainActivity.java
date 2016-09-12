package com.conwin.dhvideo;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.conwin.gimoutils.ACache;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    PullToRefreshListView mLvCamera;
    List<JSONObject> mListCamera;
    LayoutInflater mInflater;
    CameraListAdapter mCameraAdapter;
    ACache mCache;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EventBus.getDefault().register(this);
        mInflater = this.getLayoutInflater();
        mCache = ACache.get(this,"dhvideo");
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

        mLvCamera = (PullToRefreshListView) findViewById(R.id.lv_camera);
        mLvCamera.setMode(PullToRefreshBase.Mode.BOTH);
        mLvCamera.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {

            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
                FreshCameraListTask task = new FreshCameraListTask();
                task.execute("start");
            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
                FreshCameraListTask task = new FreshCameraListTask();
                task.execute("start");
            }
        });

        mLvCamera.setOnPullEventListener(new PullToRefreshBase.OnPullEventListener<ListView>() {
            @Override
            public void onPullEvent(PullToRefreshBase<ListView> refreshView, PullToRefreshBase.State state, PullToRefreshBase.Mode direction) {

            }
        });
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

            SimpleDraweeView ivPic = (SimpleDraweeView) convertView.findViewById(R.id.iv_camera_pic);
           // ivPic.setAspectRatio(1.33f); // 设置宽高比为4:3
            String thumbPath = GlobalFunction.getStoreFile()+"/"+GlobalDefine.DIRS.CAMERA_THUMB+"/camera"+position+".jpg";
           // Uri uri = Uri.parse("http://img0.imgtn.bdimg.com/it/u=2925305502,4225644286&fm=206&gp=0.jpg");
          //  ImagePipelineFactory.getInstance().getImagePipeline().clearMemoryCaches();


           Fresco.getImagePipeline().evictFromCache(Uri.parse(thumbPath));
            Uri uri = Uri.fromFile(new File(thumbPath));

            DraweeController controller = Fresco.newDraweeControllerBuilder()

                    .setUri(uri)
                    .build();
            ivPic.setController(controller);

            TextView tvName = (TextView) convertView.findViewById(R.id.tv_name);
            tvName.setText(cameraName);
            convertView.setTag(position);
            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent iCamera = new Intent(MainActivity.this, CameraActivity.class);
                    Bundle b = new Bundle();

                    int position = Integer.parseInt(v.getTag().toString());
                    b.putInt("chId", position);
                    iCamera.putExtras(b);
                    startActivity(iCamera);
                }
            });
            return convertView;
        }
    }

    class FreshCameraListTask extends AsyncTask<String, Integer, Boolean>{
        @Override
        protected Boolean doInBackground(String... strings) {



            return true;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            initCameraList();
            mLvCamera.onRefreshComplete();
            super.onPostExecute(aBoolean);
        }
    }




    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPostEvent(EventObject.CameraUpdate cu) {
        initCameraList();
      //  Toast.makeText(getActivity(), event.message, Toast.LENGTH_SHORT).show();
    }


}
