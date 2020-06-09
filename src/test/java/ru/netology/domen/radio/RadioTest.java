package ru.netology.domen.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    void prevCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(1);
        radio.prevStationRadio();
        radio.prevStationRadio();
        assertEquals(9, radio.getCurrentNumberStation());


    }

    @Test
    void nextCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(8);
        radio.nextStationRadio();
        radio.nextStationRadio();
        assertEquals(0, radio.getCurrentNumberStation());

    }


    @Test
    void currentStation() {

        Radio radio = new Radio();
        radio.setCurrentNumberStation(4);
        assertEquals(4, radio.getCurrentNumberStation());
    }

    @Test
    void MaxStationRadio() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(9);
        assertEquals(9, radio.getMaxStation(), radio.getCurrentNumberStation());
    }

    @Test
    void moreMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(10);
        assertEquals(radio.getMaxStation(), radio.getCurrentNumberStation());
    }

    @Test
    void minStationRadio() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(0);
        assertEquals(0, radio.getMinStation(), radio.getCurrentNumberStation());

    }

    @Test
    void LessminStationRadio() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(-1);
        assertEquals(radio.getMinStation(), radio.getCurrentNumberStation());

    }


    @Test
    void currentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void minVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }


    @Test
    void maxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    void moreMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    void LessMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }

    @Test
void increaseVolume(){
    Radio radio = new Radio();
    radio.setCurrentVolume(9);
    radio.increaseVolume();
    radio.increaseVolume();
    assertEquals(10,radio.getCurrentVolume());
    }


    @Test
    void decreaseVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        radio.decreaseVolume();
        assertEquals(0,radio.getCurrentVolume());
    }
}