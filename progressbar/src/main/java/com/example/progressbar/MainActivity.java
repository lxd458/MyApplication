package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
  private  ProgressBar pb;
    private  ProgressBar pb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //拿到进度条
        pb = findViewById(R.id.pb);

        pb2 = findViewById(R.id.pb2);
    }

    public void onclick(View view) {
        if(pb.getVisibility()==View.GONE){
            pb.setVisibility(View.VISIBLE);
        }else {
            pb.setVisibility(View.GONE);
        }
    }
  //模拟进度条下载:点一下按钮增长10
    public void load(View view) {
        int progress = pb2.getProgress();
        progress+=10;
        pb2.setProgress(progress);

    }
}
