package com.fadhilah.algolearn;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class MenuUtamaAdapter extends RecyclerView.Adapter<MenuUtamaAdapter.CardViewHolder> {
    private ArrayList<Item> itemList;
    private Context context;
    public MenuUtamaAdapter(Context context) {
        this.context = context;
    }
    public ArrayList<Item> ItemMenu() {
        return itemList;
    }
    public void ItemMenu(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cardview_item_menu, parent, false);
        CardViewHolder viewHolder = new CardViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        Item c = ItemMenu().get(position);
        holder.tv_item_title.setText(c.getTitle());
        holder.tv_item_subtitle.setTextColor(context.getResources().getColor(R.color.white));
        holder.tv_item_subtitle.setText(c.getSubtitle());

        Glide.with(holder.itemView.getContext())
                .load(c.getGambar())
                .apply(new RequestOptions().override(250,250))
                .into(holder.item_icon);

        holder.item_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, MenuUtamaSub.class);
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return ItemMenu().size();
    }
    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView item_icon;
        TextView tv_item_title,tv_item_subtitle;
        LinearLayout item_btn;

        public CardViewHolder(View itemView) {
            super(itemView);
            item_icon = (ImageView)itemView.findViewById(R.id.item_icon);
            tv_item_title = (TextView)itemView.findViewById(R.id.tv_item_title);
            tv_item_subtitle = (TextView)itemView.findViewById(R.id.tv_item_subtitle);
            item_btn = (LinearLayout)itemView.findViewById(R.id.item_btn);
        }
    }
}

