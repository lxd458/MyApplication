package com.example.valueanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;
/*
 属性动画：valueanimation + ObjectAnimator
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*一、ValueAnimator对象调用方法【直接调用】 */
 /*
       ValueAnimator val = ValueAnimator.ofInt(0, 100);// int
      //设置时间
      val.setDuration(2000);
       //新增监听
       val.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
           @Override
           public void onAnimationUpdate(ValueAnimator valueAnimator) {
                //ValueAnimator valueAnimator参数对象:获取值
               int value = (int) valueAnimator.getAnimatedValue();
               Log.e("lxd", "onAnimationUpdate: "+value);
          }
       });
        //启动
       val.start();
*/

               //二、ObjectAnimator对象需要【其他的控件参与】
        TextView textView = findViewById(R.id.tv);
        //Ctrl(Command)+P	方法参数提示
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(textView,
                "alpha",0f,1f);//渐显样式
        objectAnimator.setDuration(4000);
        objectAnimator.start();
        //添加监听器
        objectAnimator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {//监听开始

            }

            @Override
            public void onAnimationEnd(Animator animator) {//监听结束

            }

            @Override
            public void onAnimationCancel(Animator animator) {//监听取消

            }

            @Override
            public void onAnimationRepeat(Animator animator) {//监听重复

            }
        });
        //添加适配器即可，不用监听器那么麻烦
        objectAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Animator animation) {
                super.onAnimationStart(animation); //选择适配监听开始
            }
        });

    }
}
