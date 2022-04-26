package com.example.swg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {
    ImageView mImaeView;
    TextView mTitleView;

    public MyHolder(@NonNull View itemView) {
        super(itemView);
        this.mImaeView = itemView.findViewById(R.id.imageTv);
        this.mTitleView = itemView.findViewById(R.id.titleTv);
    }
}
