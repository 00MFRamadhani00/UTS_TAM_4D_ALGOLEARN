package com.fadhilah.algolearn;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuUtamaSub extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<ItemSub> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_sub_utama);

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(ItemMenuSub.getListData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MenuUtamaSubAdapter menuSubUtamaAdapter = new MenuUtamaSubAdapter(this);
        menuSubUtamaAdapter.ItemMenuSub(list);
        recyclerView.setAdapter(menuSubUtamaAdapter);
    }
}