package com.example.listview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {
    private List<Bean> data;
    private Context context;

    public Adapter(List<Bean> data, Context context) {
        this.data = data;
        this.context = context;
    }

    public Adapter() {
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(view==null){
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(R.layout.list_item,viewGroup,false);
            viewHolder.textView=view.findViewById(R.id.tv);
            view.setTag(viewHolder);
        }else {
           viewHolder= (ViewHolder) view.getTag();
        }

        viewHolder.textView.setText(data.get(i).getName());
        Log.e("lxd", "getView: "+i );

        return view;
    }

    private final class ViewHolder{
        TextView textView;
    }
}
