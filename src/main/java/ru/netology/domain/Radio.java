package ru.netology.domain;

public class Radio {

    private int currentVolume = 8;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentRadioStation = 7;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private final static int MAX_RADIO_STATION = 9;

    public Radio(int currentVolume, int maxVolume, int minVolume, int currentRadioStation, int maxRadioStation, int minRadioStation) {
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentRadioStation = currentRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.minRadioStation = minRadioStation;
    }

    public Radio() {

    }

    public int switchStationByManually(int inputStation) {
        if (inputStation < 9 && inputStation > 0) {
            currentRadioStation = inputStation;
        }
        return currentRadioStation;
    }

    public void pressNextStation() {
        if (currentRadioStation == maxRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        } else {
            currentRadioStation++;
        }
    }

    public void pressPreviewStation() {
        if (currentRadioStation == minRadioStation) {
            this.currentRadioStation = maxRadioStation;
        } else {
            currentRadioStation--;
        }
    }

    public void turnUpVolume() {
        if (currentVolume == maxVolume) {
            return;
        } else {
            currentVolume++;
        }
    }

    public void turnDownVolume() {
        if (currentVolume == minVolume) {
            return;
        } else {
            currentVolume--;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

}
