package com.example.notifiction;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

@SuppressLint("Registered") //注册进去
public class IntentActivty extends Activity { //add to  manifest
    @Override //快捷键： oncre
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("lxd","进入Intent具体的通知内容");
    }
}
