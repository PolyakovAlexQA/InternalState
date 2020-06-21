package ru.netology.domen.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RadioTest {
       Radio radio = new Radio(9,0,100,0,100,9);


    @Test
    void prevCurrentStation() {
        radio.setCurrentNumberStation(0);
        radio.prevStationRadio();
        assertEquals(9, radio.getCurrentNumberStation());
    }

    @Test
    void increaseCurrentStation() {
        radio.setCurrentNumberStation(8);
        radio.nextStationRadio();
        assertEquals(9, radio.getCurrentNumberStation());
    }

    @Test
    void decreaseCurrentStation() {
        radio.setCurrentNumberStation(7);
        radio.prevStationRadio();
        assertEquals(6, radio.getCurrentNumberStation());
    }

    @Test
    void nextCurrentStation() {
        radio.setCurrentNumberStation(9);
        radio.nextStationRadio();
        assertEquals(0, radio.getCurrentNumberStation());
    }

    @Test
    void currentStation() {
        radio.setCurrentNumberStation(4);
        assertEquals(4, radio.getCurrentNumberStation());
    }

    @Test
    void MaxStationRadio() {
        radio.setCurrentNumberStation(9);
        assertEquals(9, radio.getMaxStation(), radio.getCurrentNumberStation());
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
        radio.setCurrentVolume(101);
        assertEquals(100, radio.getCurrentVolume());
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
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void decreaseVolume() {
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}