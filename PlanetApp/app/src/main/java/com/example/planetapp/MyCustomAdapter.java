package com.example.planetapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
// tut-05 working on it
public class MyCustomAdapter extends ArrayAdapter<Planet> {
    private ArrayList<Planet> planetArrayList;
    Context context;

    public MyCustomAdapter( ArrayList<Planet> planetArrayList, Context context) {
        super(context, R.layout.item_list_layout, planetArrayList);
        this.planetArrayList = planetArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // 1> get planet object for the current position
        Planet planets = getItem(position);

        // 2> Inflate Layout
        MyViewHolder myViewHolder;
        final View result;

        if(convertView == null){
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_list_layout, parent, false);

            myViewHolder.planetName = (TextView) convertView.findViewById(R.id.planet_name);
            myViewHolder.moonCount =  (TextView) convertView.findViewById(R.id.moon_count);
            myViewHolder.planetImage = (ImageView) convertView.findViewById(R.id.imageView);

            result = convertView;
            convertView.setTag(myViewHolder);
        }else{
            myViewHolder = (MyViewHolder) convertView.getTag();
            result = convertView;
        }

        myViewHolder.planetName.setText(planets.getPlanetName());
        myViewHolder.moonCount.setText(planets.getMoonCount());
        myViewHolder.planetImage.setImageResource(planets.getImageResource());

        return result;
    }

    public static class MyViewHolder{
        TextView planetName;
        TextView moonCount;
        ImageView planetImage;
    }
}
