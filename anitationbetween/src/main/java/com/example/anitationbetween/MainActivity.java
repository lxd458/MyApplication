package com.example.anitationbetween;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/*
  补间动画: 初始值，结束值，起止时间
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView = findViewById(R.id.iv);
        //图片内容的点击事件
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //通过xml【加载方法】来创建Anitation对象     context== MainActivity.this
       /* 1.点击图片，显示透明度，从透明倒不透明  */
// Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);
      /* 2.点击图片，旋转一圈  */
//Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                /* 3.点击图片，进行等比例缩和放  */
Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale);
                /* 4.点击图片，实现位置平移*/
//Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate);
                imageView.startAnimation(animation);//一直不动，图片视图 启用animation对象
            }
        });

    }
}
