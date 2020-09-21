package com.example.application.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyleViewAdapter extends RecyclerView.Adapter<RecyleViewAdapter.itemViewHolder> {
    private ArrayList<MyItem> rmyItems ;

    public RecyleViewAdapter(ArrayList<MyItem> itemList) {
        rmyItems = itemList ;

    }


    public static class itemViewHolder extends RecyclerView.ViewHolder{
        public ImageView im1 , im2 , im3 ,im4 , im5 ;
        public TextView te1 , te2 ,te3 , te4 , te5 ;


        public itemViewHolder(@NonNull View itemView) {
            super(itemView);
            im1 = itemView.findViewById(R.id.image1_id);
            im2 = itemView.findViewById(R.id.image2);
            im3 = itemView.findViewById(R.id.image3);
            im4 = itemView.findViewById(R.id.image4);
            im5 = itemView.findViewById(R.id.image5);
            te1 = itemView.findViewById(R.id.text1);
            te2 = itemView.findViewById(R.id.text2);
            te3 = itemView.findViewById(R.id.text3);
            te4 = itemView.findViewById(R.id.text4);
            te5 = itemView.findViewById(R.id.text5);
        }
    }
    public void RecyleViewAdapter (ArrayList<MyItem> myItems){
        rmyItems = myItems;

    }
    @NonNull
    @Override
    public itemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyleview,parent,false);
        itemViewHolder itemViewHolder = new itemViewHolder(v);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull itemViewHolder holder, int position) {
        MyItem currentItem = rmyItems.get(position);

        holder.im1.setImageResource(currentItem.getImage1());
        holder.im2.setImageResource(currentItem.getImage2());
        holder.te1.setText(currentItem.getText1());
        holder.te2.setText(currentItem.getText2());
        holder.te3.setText(currentItem.getText3());
        holder.te4.setText(currentItem.getText4());
        holder.te5.setText(currentItem.getText5());

    }

    @Override
    public int getItemCount() {

        return rmyItems.size();
    }
}
