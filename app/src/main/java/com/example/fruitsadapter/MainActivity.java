package com.example.fruitsadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Fruits> collection = new ArrayList<Fruits>();
        collection.add(new Fruits("Apple","Fruits",R.drawable.apple));
        collection.add(new Fruits("Cherry","Fruits",R.drawable.cherry));
        collection.add(new Fruits("Strawberry","Fruits",R.drawable.strawberry));
        collection.add(new Fruits("Watermelon","Fruits",R.drawable.watermelon));
        collection.add(new Fruits("Lemon","Fruits",R.drawable.lemon));
        collection.add(new Fruits("Mango","Fruits",R.drawable.mango));
        collection.add(new Fruits("Grapes","Fruits",R.drawable.grapes));
        collection.add(new Fruits("Orange","Fruits",R.drawable.orange));
        collection.add(new Fruits("DragonFruit","Fruits",R.drawable.dragon));

        FruitAdapter adapter = new FruitAdapter(this,R.layout.items,collection);
        ListView listView = (ListView) findViewById(R.id.listView_xml);
        listView.setAdapter(adapter);
    }
}