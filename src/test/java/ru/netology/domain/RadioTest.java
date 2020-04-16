package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void shouldSwitchStationByManually() {
        Radio radio = new Radio();
        assertEquals(7, radio.switchStationByManually(7));
    }

    @Test
    void shouldSwitchStationByManuallyWithWrongNumber() {
        Radio radio = new Radio();
        radio.switchStationByManually(0);
        assertEquals(0, radio.switchStationByManually(0));
    }

    @Test
    void shouldSwitchStationByManuallyIfUnderMinimum() {
        Radio radio = new Radio(7,9);
        radio.switchStationByManually(-1);
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchStationByManuallyIfOverMaximum() {
        Radio radio = new Radio(7,9);
        radio.switchStationByManually(56);
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchNextStation() {
        Radio radio = new Radio(7,9);
        radio.pressNextStation();
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchNextStationWhenCurrentNine() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.pressNextStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchPreviewStationWhenCurrentNull() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.pressPreviewStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldPressPreviewStation() {
        Radio radio = new Radio(7,9);
        radio.pressPreviewStation();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    void shouldTurnUpVolume() {
        Radio radio = new Radio(45,100,0);
        radio.turnUpVolume();
        assertEquals(46, radio.getCurrentVolume());
    }

    @Test
    void shouldTurnUpVolumeOverMaximum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.turnUpVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldTurnDownVolume() {
        Radio radio = new Radio(45,100,0);
        radio.turnDownVolume();
        assertEquals(44, radio.getCurrentVolume());
    }

    @Test
    void shouldTurnDownVolumeWhenMinimum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.turnDownVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}