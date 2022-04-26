package com.example.swg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // now create a model class
        // now create a MyHolder class
        // now create a adapter class
        // now in the main class

        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));// i will create recycler view in linearlayout

        myAdapter = new MyAdapter(this, getMylist());
        mRecyclerView.setAdapter(myAdapter);

    }
    private ArrayList<model> getMylist() {
        ArrayList<model> models = new ArrayList<>();
        model m = new model();
        m.setTitle("Student Welfare Group");
        m.setImg(R.drawable.swg);
        models.add(m);
        m = new model();
        m.setTitle("Rajasthan Cultural Association");
        m.setImg(R.drawable.img_4);
        models.add(m);
        m = new model();
        m.setTitle("The KGPian Game Theory Society");
        m.setImg(R.drawable.gametheory);
        models.add(m);
        m = new model();
        m.setTitle("Technology Robotix Society");
        m.setImg(R.drawable.trs);
        models.add(m);
        m = new model();
        m.setTitle("Gopali Youth Welfare Society");
        m.setImg(R.drawable.img_3);
        models.add(m);
        return models;
    }

}