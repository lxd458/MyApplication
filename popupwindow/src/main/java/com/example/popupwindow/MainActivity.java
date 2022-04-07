package com.example.popupwindow;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

public class MainActivity extends AppCompatActivity {
   private PopupWindow popupWindow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("lxd" , "已退出");
                popupWindow.dismiss();//可以声明全局变量，退出方法
            }
        });
    }

     public void lxdClick(View view) {
        //获取其他view试图内容
        View popView = getLayoutInflater().inflate(R.layout.popup_view,null);
        View btn1 = popView.findViewById(R.id.btn1);
        View btn2 = popView.findViewById(R.id.btn2);

        //创建弹出对象 PopupWindow对象有三个参数的，也有四个参数的
        popupWindow =
            new PopupWindow(popView, ViewGroup.LayoutParams.WRAP_CONTENT,
                 ViewGroup.LayoutParams.WRAP_CONTENT,true);
            //设置背景图片资源
        popupWindow.setBackgroundDrawable(getResources().getDrawable(R.drawable.fj));
            //显示创建的pOP窗口
        popupWindow.showAsDropDown(view);

        //创建按钮方法
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("lxd" , "你住上海吗？");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("lxd" , "你住北京吗？");
            }
        });



    }
}
