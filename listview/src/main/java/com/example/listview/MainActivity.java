package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
  private List<Bean>  data = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i=0;i<100;i++){
            Bean bean = new Bean();
            bean.setName("爱你"+i);
            data.add(bean);//把遍历的所有数据放进集合

        }

        ListView list = findViewById(R.id.lv);
           list.setAdapter(new Adapter(data,this));//缺失两个构造方法
    list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
              @Override
       public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            Log.e("lxd", "onItemClick: "+i );
              }
          });
    }


}
