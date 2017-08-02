package com.example.rizqi.populeranime;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailAnime extends AppCompatActivity {

    TextView judul, pengarang, jumlah, sinopsis;
    ImageView gambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_anime);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        judul = (TextView) findViewById(R.id.judul_anime);
        pengarang = (TextView) findViewById(R.id.pengarang);
        jumlah = (TextView) findViewById(R.id.jumlah);
        sinopsis = (TextView) findViewById(R.id.sinopsis);
        gambar = (ImageView) findViewById(R.id.gambar);


        Anime anime = getIntent().getParcelableExtra("ANIME");
       judul.setText(anime.getJudulAnime());
       pengarang.setText(anime.getPengarangAnime());
       jumlah.setText(anime.getJumlahEpisode());
       sinopsis.setText(anime.getSinopsisAnime());
        Picasso.with(getBaseContext()).load(anime.getIdGambarAnime()).into(gambar);

    }

}
