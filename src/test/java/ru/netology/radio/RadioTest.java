package ru.netology.radio;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class RadioTest {
       Radio radio = new Radio();


    @Test

    void prevCurrentStation() {
        Radio radio = new Radio(10,0,100,0,100,0);
        radio.prevStationRadio();
        assertEquals(10, radio.getCurrentNumberStation());
    }

    @Test
    void increaseCurrentStation() {
        Radio radio = new Radio(10,0,100,0,100,9);
        radio.nextStationRadio();
        assertEquals(10, radio.getCurrentNumberStation());
    }

    @Test
    void decreaseCurrentStation() {
        Radio radio = new Radio(10,0,100,0,100,10);
        radio.prevStationRadio();
        assertEquals(9, radio.getCurrentNumberStation());
    }

    @Test
    void nextCurrentStation() {
        radio.setCurrentNumberStation(10);
        radio.nextStationRadio();
        assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    void currentStation() {
        Radio radio = new Radio(10,0,100,0,100,10);

        assertEquals(10, radio.getCurrentNumberStation());
    }

    @Test
    void MaxStationRadio() {
        Radio radio = new Radio(10,0,100,0,100,9);

        assertEquals(10, radio.getMaxStation(), radio.getCurrentNumberStation());
    }

    @Test
    void moreMaxStation() {
        radio.setCurrentNumberStation(10);
        assertEquals(radio.getMaxStation(), radio.getCurrentNumberStation());
    }

    @Test
    void minStationRadio() {
        radio.setCurrentNumberStation(0);
        assertEquals(0, radio.getMinStation(), radio.getCurrentNumberStation());

    }

    @Test
    void LessMinStationRadio() {
        radio.setCurrentNumberStation(-1);
        assertEquals(radio.getMinStation(), radio.getCurrentNumberStation());

    }

    @Test
    void currentVolume() {
        Radio radio = new Radio(10,0,100,0,3,9);

        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    void minVolume() {
        radio.setCurrentVolume(0);
        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }

    @Test
    void maxVolume() {
        radio.setCurrentVolume(100);
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    void moreMaxVolume() {
        radio.setCurrentVolume(100);
        assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    void LessMinVolume() {
        radio.setCurrentVolume(-1);
        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio(10,0,100,0,99,9);
        radio.increaseVolume();
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio(10,0,100,0,1,9);
        radio.decreaseVolume();
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}