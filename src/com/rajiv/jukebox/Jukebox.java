package com.rajiv.jukebox;

public class Jukebox {

    private CD cd;
    private Radio radio;
    private Mode mode;

    public Jukebox(CD cd, Radio radio) {
        this.cd = cd;
        this.radio = radio;
        this.mode = Mode.CD;
    }

    public void changeMode(){
        if(this.mode == Mode.CD) this.mode = Mode.RADIO;
        else this.mode = Mode.CD;
    }

    public void changeCD(CD cd){
        cd = cd;
    }

    public Song playCD(){
        return this.cd.getSongs().get(cd.getCurrentSong()).play();
    }

    public Song nextSong(){
        return cd.playNextSong();
    }

    public RadioStation changeRadioToFrequency(Double frequency){
        return radio.changeFrequency(frequency);
    }

    public RadioStation changeRadioFrequencyProtocol(RadioFrequencyProtocol protocol){
        return radio.changeRadioFrequencyProtocol(protocol);
    }

    public RadioStation playFavoriteRadioStation(int index){
        return radio.playFavoriteRadioStation(index);
    }
}
