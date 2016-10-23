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
import android.widget.Toast;

import com.conwin.gimoutils.ACache;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;


public class MainActivity extends AppCompatActivity {

    PullToRefreshListView mLvCamera;
    JSONArray mListCamera;
    LayoutInflater mInflater;
    CameraListAdapter mCameraAdapter;
    ACache mCache;

    String mCameraIp = "";
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
        mListCamera = new JSONArray();

        mCameraAdapter = new CameraListAdapter();
        mLvCamera.setAdapter(mCameraAdapter);
        getCameraList();
       // getCameraIp();

    }


    @Override
    public void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

//    void initCameraList(){
//        mListCamera.clear();
//        ACache cache = ACache.get(this,"dhvideo");
//        JSONArray cameraList = cache.getAsJSONArray("cameraList");
//        for (int i=0;cameraList!=null && i<cameraList.length();i++){
//            try {
//                mListCamera.add(cameraList.getJSONObject(i));
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//        }
//        mCameraAdapter.notifyDataSetChanged();
//    }


    void getCameraList(){
        AsyncHttpClient httpClient = new AsyncHttpClient();
        httpClient.get("http://gimo.site:5300/api/get_camera_list",null, new JsonHttpResponseHandler(){
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                if (statusCode == 200){
                    if(response.has("result") ){
                        try {
                            int result = response.getInt("result") ;
                            if (result == 0 && response.has("data")){
                                mListCamera = response.getJSONArray("data");
                                mCameraAdapter.notifyDataSetChanged();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {

            }
        });

    }

    class CameraListAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return mListCamera.length();
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
            JSONObject jCamera = null ;
            try {
                jCamera = mListCamera.getJSONObject(position);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            String cameraName = "";
            int cameraId = 0;
            try {
                cameraName = jCamera.getString("name");
                cameraId = jCamera.getInt("_id");
            } catch (JSONException e) {
                e.printStackTrace();
            }


            SimpleDraweeView ivPic = (SimpleDraweeView) convertView.findViewById(R.id.iv_camera_pic);
           // ivPic.setAspectRatio(1.33f); // 设置宽高比为4:3
            String thumbPath = GlobalFunction.getStoreFile()+"/"+GlobalDefine.DIRS.CAMERA_THUMB+"/camera"+cameraId+".jpg";
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
            convertView.setTag(jCamera.toString());
            convertView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String sCamera =  v.getTag().toString();
                    Intent iCamera = new Intent(MainActivity.this, CameraActivity.class);
                    Bundle b = new Bundle();



                    b.putString("cameraInfo", sCamera);
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
            getCameraList();
            mLvCamera.onRefreshComplete();
            super.onPostExecute(aBoolean);
        }
    }




    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onPostEvent(EventObject.CameraUpdate cu) {
        getCameraList();
      //  Toast.makeText(getActivity(), event.message, Toast.LENGTH_SHORT).show();
    }








}
