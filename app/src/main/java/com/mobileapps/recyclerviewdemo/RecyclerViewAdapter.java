package com.mobileapps.recyclerviewdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    Context context;
    ArrayList<Student> list;

    public RecyclerViewAdapter(Context context, ArrayList<Student> passedList) {
        this.context = context;
        this.list = passedList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder viewHolder = new ViewHolder(inflater.inflate(R.layout.item,viewGroup,false));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.tvStudentName.setText(list.get(i).studentName);
        viewHolder.tvStudentGrade.setText(list.get(i).studentGrade);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvStudentName;
        TextView tvStudentGrade;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvStudentGrade = itemView.findViewById(R.id.tvStudentGrade);
            tvStudentName = itemView.findViewById(R.id.tvStudentName);
        }
    }
}
