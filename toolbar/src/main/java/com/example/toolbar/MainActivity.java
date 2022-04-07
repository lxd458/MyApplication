package com.example.toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar; //注意：是安卓x

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        Toolbar toolbar = findViewById(R.id.tb);
        //调用导航点击方法，引入匿名内部类
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("lxd","ToolBar被点击触发了");
            }
        });
        //方式二
        Toolbar tb2 = findViewById(R.id.tb2);
        tb2.setNavigationIcon(R.drawable.ic_reply_black_24dp);
        tb2.setSubtitle("子标题不错");
        tb2.setSubtitleTextColor(R.color.colorAccent);
         tb2.setNavigationOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Log.e("lxd","ToolBar22222被点击触发了");
             }
         });

    }
}
