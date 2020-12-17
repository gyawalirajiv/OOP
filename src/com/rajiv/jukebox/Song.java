package com.rajiv.jukebox;

public class Song {

    private String title;
    private String artistName;
    private Integer length;

    public Song(String title, String artistName, Integer length) {
        this.title = title;
        this.artistName = artistName;
        this.length = length;
    }

    public Song play(){
        System.out.println("Playing " + title + " By " + artistName);
        return this;
    }

    public String getTitle() {
        return title;
    }

    public String getArtistName() {
        return artistName;
    }

    public Integer getLength() {
        return length;
    }
}
