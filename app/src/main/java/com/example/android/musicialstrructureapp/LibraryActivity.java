package com.example.android.musicialstrructureapp;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //Creata a list of Songs
        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Hero", "Skillet"));
        songs.add(new Song("Monster", "Skillet"));
        songs.add(new Song("Comatose", "Skillet"));
        songs.add(new Song("Rise","Skillet"));
        songs.add(new Song("Lonely Day","System Of A Down"));
        songs.add(new Song("Question","System Of A Down"));
        songs.add(new Song("Hypnotize", "System Of A Down"));
        songs.add(new Song("In The End", "Linkin Park"));
        songs.add(new Song("Paper Cut","Linkin Park"));
        songs.add(new Song("Faint","Linkin Park"));
        songs.add(new Song("In The End","Black Vell Brides"));
        songs.add(new Song("Agony","Black Vell Brides"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        /*
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {


            }
        });
    */
    }

    public void goToNowPlaying(View view) {
        Intent numbersIntent = new Intent(LibraryActivity.this, NowPlayingActivity.class);

        startActivity(numbersIntent);
    }
}
