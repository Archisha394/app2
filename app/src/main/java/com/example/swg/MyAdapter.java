package com.example.swg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder>{

    Context c;
    ArrayList<model> models; // this array lis create a list of array which parameters define in our model class
    // now create a parameterized constructor press alt+fn+ins

    public MyAdapter(Context c, ArrayList<model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row, null);//this line inflates our row

        return new MyHolder(view);// this will return our view to holder class
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        myHolder.mTitleView.setText(models.get(i).getTitle()); // here i is position
        myHolder.mImaeView.setImageResource(models.get(i).getImg());// here we used image resource because
        // we will use our images in our resource folder which is drawable


    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
