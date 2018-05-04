package com.example.dnafv.foodsqlitedemo;

import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

public class FoodList extends AppCompatActivity {

    GridView gridView;
    ArrayList<Food>list;
    FoodListAdapter adapter = null;


    //Add the onCreate Method so that it will automatically open the food_list_activity as that is
    // what the Button is supposed to do!
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.food_list_activity);

        gridView = (GridView)findViewById(R.id.gridView);
        list = new ArrayList<>();
        adapter = new FoodListAdapter(this, R.layout.food_items, list);
        gridView.setAdapter(adapter);


        //Get Data from SQLite:
        Cursor cursor = MainActivity.sqLiteHelper.getData("SELECT * FROM foods");
        list.clear();
        while(cursor.moveToNext()){
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            String price = cursor.getString(2);
            byte[] image = cursor.getBlob(3);

            list.add(new Food(id, name, price, image));
        }
        adapter.notifyDataSetChanged();
    }
}
