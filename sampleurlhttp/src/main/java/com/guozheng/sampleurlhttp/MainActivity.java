package com.guozheng.sampleurlhttp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.guozheng.urlhttputils.urlhttp.CallBackUtil;
import com.guozheng.urlhttputils.urlhttp.UrlHttpUtil;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View v){
        getData();

        //postData();

    }

    private void postData() {
        String url = "https://www.baidu.com/";
        HashMap<String, String> paramsMap = new HashMap<>();
        paramsMap.put("title","title");
        paramsMap.put("desc","desc");
        UrlHttpUtil.post(url, paramsMap, new CallBackUtil.CallBackString() {
            @Override
            public void onFailure(int code, String errorMessage) {

            }

            @Override
            public void onResponse(String response) {
                Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_SHORT).show();
                Log.d("kwwl",response);
            }
        });
    }

    private void getData() {
        String url = "https://www.baidu.com/";
        UrlHttpUtil.get(url, new CallBackUtil.CallBackString() {
            @Override
            public void onFailure(int code, String errorMessage) {

            }

            @Override
            public void onResponse(String response) {
                Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_SHORT).show();
                Log.d("kwwl",response);
            }
        });
    }
}
