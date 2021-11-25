package com.cookandroid.newrecyclerview2021;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MemoAdapter extends RecyclerView.Adapter<MemoAdapter.MyViewHolder> {

    ArrayList<Memo> items;

    public MemoAdapter(ArrayList<Memo> items) {
        this.items = items;
    }

    public void addItem(Memo item){
        items.add(item);
    }
    public Memo getItem(int position){
        return items.get(position);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_layout, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Memo item = items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView dateView;
        TextView contentView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            dateView = itemView.findViewById(R.id.textView1);
            contentView = itemView.findViewById(R.id.textView2);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if(position != RecyclerView.NO_POSITION){
                        Intent intent = new Intent(itemView.getContext(),ModifyActivity.class);
                        intent.putExtra("date",getItem(position).getDate());
                        intent.putExtra("content",getItem(position).getContent());
                        itemView.getContext().startActivity(intent);
                    }
                }
            });

        }

        public void setItem(Memo item){
            dateView.setText(item.getDate());
            contentView.setText(item.getContent());
        }
    }
}
