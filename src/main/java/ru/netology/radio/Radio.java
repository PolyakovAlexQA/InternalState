package ru.netology.radio;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Radio {

    private int maxStation;
    private int minStation;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;
    private int currentNumberStation;



    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }

        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentNumberStation(int currentNumberStation) {
        if (currentNumberStation > maxStation) {
            this.currentNumberStation = maxStation;
            return;
        }
        if (currentNumberStation < minStation) {
            this.currentNumberStation = minStation;
            return;
        }
        this.currentNumberStation = currentNumberStation;
    }

    public void nextStationRadio() {

        if (currentNumberStation == maxStation) {
            currentNumberStation = minStation;
            return;
        }
        currentNumberStation++;
    }

    public void prevStationRadio() {
        if (currentNumberStation == minStation) {
            currentNumberStation = maxStation;
            return;
        }
        currentNumberStation--;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }
}

