package com.example.videokitdemojava.activity;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.videokitdemojava.R;
import com.example.videokitdemojava.adapter.VideoAdapter;
import com.example.videokitdemojava.model.Movie;
import com.example.videokitdemojava.utils.Constants;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements VideoAdapter.onMovieListener {
    RecyclerView recyclerView;
    VideoAdapter adaptor;
    List<Movie> movieList;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieList = new ArrayList<>();
        this.context = this;
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager((this)));
        movieList.add(new Movie(1, Constants.MEDIA1_NAME, Constants.MEDIA1_URL, R.drawable.play_button_video));
        movieList.add(new Movie(2, Constants.MEDIA2_NAME, Constants.MEDIA2_URL, R.drawable.play_button_video));
        movieList.add(new Movie(3, Constants.MEDIA3_NAME, Constants.MEDIA3_URL, R.drawable.play_button_video));
        movieList.add(new Movie(4, Constants.MEDIA4_NAME, Constants.MEDIA4_URL, R.drawable.play_button_video));
        adaptor = new VideoAdapter(this, movieList, this);
        recyclerView.setAdapter(adaptor);
    }

    @Override
    public void onMovieListener(int position) {
        Intent intent = new Intent(this, PlayVideoActivity.class);
        intent.putExtra("name", movieList.get(position).getName());
        intent.putExtra("url", movieList.get(position).getUrl());
        context.startActivity(intent);
    }
}