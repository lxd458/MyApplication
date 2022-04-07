package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
/*
      逐帧动画
 */
public class MainActivity extends AppCompatActivity {
  private boolean flag =true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout rl = findViewById(R.id.rl);//获取视图

        //获取背景图片 getBackground();
        final AnimationDrawable drawable = (AnimationDrawable) rl.getBackground();


        rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             if(flag){
                 drawable.start();
                 flag=false;
             }else {
                 drawable.stop();
                 flag=true; //交替执行开关
             }
            }
        });


    }
}
