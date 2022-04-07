package com.example.notifiction;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private NotificationManager nm;
    private  Notification notif ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取通知的方法：必须设置全局变量
        nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.O){ //判断是否大于第8版本
            NotificationChannel channel = new NotificationChannel("lxd","通知",
                    NotificationManager.IMPORTANCE_HIGH );//三个参数
               nm.createNotificationChannel(channel);//通过管理器 调用创建通知渠道的方法

        }
        Intent intent = new Intent(this, IntentActivty.class);
        //PendingIntent对象 获取 活动
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);//context==this
                //创建通知容器
        notif = new NotificationCompat.Builder(this,"lxd")
                       .setContentTitle("官方通知")
                       .setContentText("我想你了")
                       .setSmallIcon(R.drawable.ic_pets_black_24dp)
                       .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.drawable.fj))
                       .setColor(Color.parseColor("#ff0000")) //转换int型的color
                      .setContentIntent(pendingIntent)  //点击通知进行跳转，需要参数PendingIntent
                        .setAutoCancel(true) //设置为自动取消，即点击通知后消失
                       .setWhen(DateFormat.DEFAULT)
                .build();


    }

    public void sendNotifiction(View view) {
      //调用发送通知
        nm.notify(1,notif);
    }

    public void cancelNotifiction(View view) {
        //点击按钮取消通知
        nm.cancel(1);

    }
}
