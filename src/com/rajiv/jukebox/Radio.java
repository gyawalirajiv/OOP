package com.rajiv.jukebox;

import java.util.List;

public class Radio {

    private RadioStation currentRadioStation;
    private List<RadioStation> favoriteStations;

    public Radio(RadioStation currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public List<RadioStation> getFavoriteStations() {
        return favoriteStations;
    }

    public void setFavoriteStations(RadioStation radioStation){
        favoriteStations.add(radioStation);
    }

    public RadioStation getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(RadioStation currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public RadioStation changeFrequency(Double frequency) {
        currentRadioStation.setFrequency(frequency);
        return currentRadioStation;
    }

    public RadioStation changeRadioFrequencyProtocol(RadioFrequencyProtocol protocol) {
        currentRadioStation.setRadioFrequencyProtocol(protocol);
        return currentRadioStation;
    }

    public RadioStation playFavoriteRadioStation(int index) {
        currentRadioStation = favoriteStations.get(index);
        return currentRadioStation;
    }
}
