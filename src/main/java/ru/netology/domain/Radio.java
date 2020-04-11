package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int currentVolume = 8;
    private int maxVolume = 100;
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

}
