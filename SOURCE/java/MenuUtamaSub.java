package com.fadhilah.algolearn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuUtamaSub extends AppCompatActivity implements View.OnClickListener{

    private RecyclerView recyclerView;
    private ArrayList<ItemSub> list;

    Button btnBackToMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_sub_utama);
        btnBackToMenu = (Button) findViewById(R.id.btn_backToMenu);
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(ItemMenuSub.getListData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MenuUtamaSubAdapter menuSubUtamaAdapter = new MenuUtamaSubAdapter(this);
        menuSubUtamaAdapter.ItemMenuSub(list);
        recyclerView.setAdapter(menuSubUtamaAdapter);

        btnBackToMenu.setOnClickListener(this);
    }
    public void onClick(View view){
        Intent i;
        if(view.getId() == R.id.btn_backToMenu){
            i = new Intent(this, MenuUtama.class);
            startActivity(i);
        }
    }
}