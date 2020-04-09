package ru.netology.domain;

public class Radio {

    private int currentVolume = 8;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentRadioStation = 7;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private final static int MAX_RADIO_STATION = 9;

    public int switchStationByManually(int inputStation) {
        if (inputStation < 9 && inputStation > 0) {
            currentRadioStation = inputStation;
        }
        return currentRadioStation;
    }

    public void pressNextStation() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = 0;
        } else {
            currentRadioStation += 1;
        }
    }

    public void pressPreviewStation() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = 9;
        } else {
            currentRadioStation -= 1;
        }
    }

    public void turnUpVolume() {
        if (currentVolume == maxVolume) {
            return;
        } else {
            currentVolume += 1;
        }
    }

    public void turnDownVolume() {
        if (currentVolume == minVolume) {
            return;
        } else {
            currentVolume -= 1;
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
