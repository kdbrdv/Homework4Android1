package com.example.homework4android1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TitleAdapter extends RecyclerView.Adapter<TitleAdapter.ViewHolder> {

    private ArrayList<User> list = new ArrayList<>();

    public void addItems(ArrayList<User> list) {
        this.list.addAll(list);
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TitleAdapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewName;
        private TextView lastName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.tv_name);
            lastName = itemView.findViewById(R.id.tv_last_name);
        }

        public void onBind(User s) {
            textViewName.setText(s.getName());
            lastName.setText(s.getLastName());
        }
    }
}
