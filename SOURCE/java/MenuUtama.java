package com.fadhilah.algolearn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MenuUtama extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Item> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(ItemMenu.getListData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MenuUtamaAdapter menuUtamaAdapter = new MenuUtamaAdapter(this);
        menuUtamaAdapter.ItemMenu(list);
        recyclerView.setAdapter(menuUtamaAdapter);
    }
}