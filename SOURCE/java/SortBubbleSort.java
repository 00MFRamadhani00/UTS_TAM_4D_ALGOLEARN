package com.fadhilah.algolearn;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SortBubbleSort extends AppCompatActivity implements View.OnClickListener{
    private ImageView imageView;
    private Context context;
    Handler handler;
    Button btnPauseDanPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort_bubble_sort);

        btnPauseDanPlay = (Button) findViewById(R.id.btn_pauseDanPlay);
        imageView = (ImageView) findViewById(R.id.gifImageView_konten);
        Glide.with(this).load(R.drawable.bubble_sort_gif).into(imageView);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SortBubbleSort.this,SortBubbleSort.class);
                startActivity(intent);
                finish();
            }
        }, 15616);

        btnPauseDanPlay.setOnClickListener(this);
    }

    public void onClick(View view){
        Intent i;
        i = new Intent(this, SortBubbleSort.class);
        startActivity(i);
    }
}