package com.example.adapterview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyCustomAdapter extends BaseAdapter {

    private Context context;
    private String[] items;

    public MyCustomAdapter(Context context, String[] items){
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length;   // gets the length of items of your data source
    }

    @Override
    public Object getItem(int position) {
        return items[position]; // get item at given position
    }

    @Override
    public long getItemId(int position) {
        return position; // get unique identifier for the given position
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // display the data at a position in the dataset

        ViewHolder viewHolder;

        if(convertView == null){
            // convertView: is a recycled view that you can use to improve the performance of your list
            convertView = LayoutInflater.from(context).inflate(R.layout.my_list_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.textView =  convertView.findViewById(R.id.text1);
            convertView.setTag(viewHolder);

        }else{
            // reusing the view that is recycled
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // setting data to the view
        viewHolder.textView.setText(items[position]);

        // binding within the convert view
        // display data at position in the data set
        return convertView;
    }

    static class ViewHolder{
        // holds the reference to the views within the item layout
        // to optimize performance and efficiency , by removing findviewbyid pattern in getView

        TextView textView;

    }
}
