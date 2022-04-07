package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //引入自定义View 【不在同一方法，无法引用，使用的是单机触发事件】
       // View dialogView = getLayoutInflater().inflate(R.layout.alertdialog_view, null);
    }


    public void lxdclick(View view) {
        View dialogView = getLayoutInflater().inflate(R.layout.alertdialog_view, null);
        AlertDialog.Builder ad = new AlertDialog.Builder(this);

        ad.setTitle("对话框内容：")
        .setMessage("今天真不错，你好啊")
         .setIcon(R.mipmap.ic_launcher)
          .setView(dialogView)
        //弹出对话框：触发其他按钮
         .setNegativeButton("确定", new DialogInterface.OnClickListener() {
             @Override   //对话接口调用触发内部类
             public void onClick(DialogInterface dialogInterface, int i) {
                 Log.e("lxd","点击了确定");
             }
         })
          .setPositiveButton("取消", new DialogInterface.OnClickListener() {
              @Override
              public void onClick(DialogInterface dialogInterface, int i) {
                  Log.e("lxd","点击了取消");
              }
          })
      .setNeutralButton("中间", new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface dialogInterface, int i) {
              Log.e("lxd","点击了中间");
          }
      })
          .create()  //链式加载，最后create和show必须有
          .show();
    }
}
