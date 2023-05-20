package com.fadhilah.algolearn;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class MenuUtamaSubAdapter extends RecyclerView.Adapter<MenuUtamaSubAdapter.CardViewHolder> {
    private ArrayList<ItemSub> itemList;
    private Context context;
    public MenuUtamaSubAdapter(Context context) {
        this.context = context;
    }
    public ArrayList<ItemSub> ItemMenu() {
        return itemList;
    }
    public void ItemMenuSub(ArrayList<ItemSub> itemList) {
        this.itemList = itemList;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cardview_item_menu_sub, parent, false);
        CardViewHolder viewHolder = new CardViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        ItemSub c = ItemMenu().get(position);
        holder.tv_item_title.setText(c.getTitle());

        holder.item_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(context, SortBubbleSortPause.class);
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return ItemMenu().size();
    }
    public class CardViewHolder extends RecyclerView.ViewHolder {
        TextView tv_item_title;
        LinearLayout item_btn;

        public CardViewHolder(View itemView) {
            super(itemView);
            tv_item_title = (TextView)itemView.findViewById(R.id.tv_item_title);
            item_btn = (LinearLayout)itemView.findViewById(R.id.item_btn);
        }
    }
}

