package ru.netology.domen.radio;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Radio<currentNumberStation> {

    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int currentNumberStation;

    public Radio(int maxStation, int minStation, int maxVolume, int minVolume, int currentVolume, int currentNumberStation) {
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
        this.currentNumberStation = currentNumberStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

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

