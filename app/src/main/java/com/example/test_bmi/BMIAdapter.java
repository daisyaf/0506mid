package com.example.test_bmi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BMIAdapter extends RecyclerView.Adapter<BMIAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.item_list, parent, false);
        ViewHolder holder = new ViewHolder(view);
        holder.tv_height = view.findViewById(R.id.tv_height);
        holder.tv_weight = view.findViewById(R.id.tv_weight);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_height;
        public TextView tv_weight;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

