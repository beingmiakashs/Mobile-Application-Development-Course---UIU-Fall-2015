package com.omeletlab.sa.sqliteactiveandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.activeandroid.query.Select;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Restaurant restPansi = new Restaurant("Pansi", "Shylet", 250);
        Restaurant restWoondal = new Restaurant("Woondal", "Shylet", 180);
        Restaurant restStar = new Restaurant("Star", "Dhaka", 220);

        restPansi.save();
        restWoondal.save();
        restStar.save();

        List<Restaurant> restaurants = new Select().
                from(Restaurant.class).orderBy("capacity ASC").execute();

        for(Restaurant rest : restaurants){
            Log.d("restList", rest.name + " " + rest.area + " " + rest.capacity);
        }










    }
}
