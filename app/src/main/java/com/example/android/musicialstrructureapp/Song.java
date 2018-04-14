package com.example.android.musicialstrructureapp;

public class Song {

    private String mSongName;
    private String mAuthorName;

    public Song(String songName, String authorName){
        mSongName = songName;
        mAuthorName = authorName;
    }

    public String getSongName(){ return mSongName;}
    public String getAuthorName(){ return mAuthorName;}
}
