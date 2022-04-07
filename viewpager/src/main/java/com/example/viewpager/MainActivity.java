package com.example.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         //需要渲染==LayoutInflater
        LayoutInflater lf = getLayoutInflater().from(this);
        View view1 = lf.inflate(R.layout.layout1, null);
        View view2 = lf.inflate(R.layout.layout2, null);
        View view3 = lf.inflate(R.layout.layout3, null);
        View view4 = lf.inflate(R.layout.layout4, null);
        View view5 = lf.inflate(R.layout.layout5, null);

        List<View> list = new ArrayList<>() ; //创建集合，放入集合
        list.add(view1);
        list.add(view2);
        list.add(view3);
        list.add(view4);
        list.add(view5);


        //接收xml
        ViewPager viewpage = findViewById(R.id.vp);
        //创建MyAdapter对象
        MyAdapter myAdapter = new MyAdapter(list);
        //页面设置适配器
        viewpage.setAdapter(myAdapter);//把适配器放入VIEWPAGE




    }
}
