package com.rajiv.jukebox;

import java.util.ArrayList;
import java.util.List;

public class CD {

    private String name;
    private List<Song> songs;
    private String albumArtUrl;
    private int currentSong;

    public CD(String name, String albumArtUrl) {
        this.name = name;
        this.songs = new ArrayList<>();
        this.albumArtUrl = albumArtUrl;
        this.currentSong = 0;
    }

    public String getName() {
        return name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getAlbumArtUrl() {
        return albumArtUrl;
    }

    public int getCurrentSong() {
        return currentSong;
    }

    public Song playNextSong() {
        if(currentSong >= songs.size()) {
            System.out.println("There is no next Song on the CD!");
            return null;
        }
        currentSong++;
        return songs.get(currentSong).play();
    }
}
