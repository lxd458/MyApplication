package com.example.layoutparams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/*
  布局的尺寸和大小【布局参数】：不使用activity_main的xml布局
  在Java代码中实现布局
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        LinearLayout linearLayout = new LinearLayout(this);//创建布局
        LinearLayout.LayoutParams layoutParams =  //创建布局参数对象
                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
          linearLayout.setLayoutParams(layoutParams);//设置参数

        TextView textView = new TextView(this); //需要使用到文本视图
        textView.setText("我是文本v");
        textView.setBackgroundColor(0xffff00ff);
        //chaungj
        LinearLayout.LayoutParams textLayoutparams = new LinearLayout.LayoutParams(300, 300);
       // textView.setLayoutParams(textLayoutparams);//设置参数到text view
      //  linearLayout.addView(textView);//再到布局添加试图
        linearLayout.addView(textView,textLayoutparams);//添加视图为两参，把文本和参数带上

        //最后传入ContentView
        setContentView(linearLayout);


    }
}
