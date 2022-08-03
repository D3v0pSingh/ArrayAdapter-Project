package com.example.fruitsadapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class FruitAdapter extends ArrayAdapter<Fruits> {

    public FruitAdapter(Activity context, int resource, ArrayList<Fruits> collection) {
        super(context, 0, collection);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.items, parent, false);
        }

        Fruits currentFruit = getItem(position);

        TextView txt1 = (TextView) listItemView.findViewById(R.id.fruitname);
        txt1.setText(currentFruit.getFname());

        TextView txt2 = (TextView) listItemView.findViewById(R.id.ftype);
        txt2.setText(currentFruit.getFtype());

        ImageView img = (ImageView) listItemView.findViewById(R.id.image);
        img.setImageResource(currentFruit.getImageId());

        return listItemView;
    }
}
