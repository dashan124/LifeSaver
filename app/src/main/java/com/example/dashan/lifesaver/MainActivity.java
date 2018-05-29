package com.example.dashan.lifesaver;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    List<Cards> mCards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCards=new ArrayList<>();
        mCards.add(new Cards("Save Water","Save water for future",R.drawable.save_water));
        mCards.add(new Cards("Report","Report Water pollution",R.drawable.ic_report_black_24dp));

        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.main_recycler_view_home);

        RecyclerViewAdapter myadapter=new RecyclerViewAdapter(this,mCards);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        recyclerView.setAdapter(myadapter);

    }


}
