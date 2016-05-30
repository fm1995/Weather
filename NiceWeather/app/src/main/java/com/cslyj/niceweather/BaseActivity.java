package com.cslyj.niceweather;

import android.app.AlertDialog;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.cslyj.niceweather.network.JuheWeather;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

    }
    Handler h = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            String data = (String) msg.obj;

//            AlertDialog.Builder builder =new AlertDialog(BaseActivity.this).Builder();
//            builder.setTitle("测试数据");
////            builder.setItems("");
//            builder.show();
            System.out.println(data);
        }
    };
    public void click(View view) {

        Thread t = new Thread(){
            @Override
            public void run() {
                super.run();

               String res =  JuheWeather.getRequest2("北京");
                Log.d("baseActivity",res);

            }
        };
        t.start();
    }
}
