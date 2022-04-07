package com.example.viewpager;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;
//创建一个适配器类
public class MyAdapter extends PagerAdapter {

   private List<View> mlistView; //把数据拿过来

    public MyAdapter(List<View> mlistView) {
        this.mlistView = mlistView;
    }


    @Override
    public int getCount() {
        return mlistView.size();//需要展示的图面的个数
    }



    @NonNull
    @Override //添加方法； 将view传入ViewGroup 中，给到指定位置
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(mlistView.get(position),0);//添加视图 ,index指定第一个位置

        return mlistView.get(position);//返回的是这个视图内容
    }

    @Override  //判断是否相等？
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {

        return view==object;
    }
    //销毁方法

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(mlistView.get(position));
    }
}
