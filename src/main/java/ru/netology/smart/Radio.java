package ru.netology.smart;

public class Radio {

    private int currentStationNumber;
    private int currentVolume;
    private int amountOfStations;

    public Radio(int amountOfStations) {
        this.amountOfStations = amountOfStations;
    }

    public Radio() {
        amountOfStations = 10;
    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume = currentVolume + 1;
        }

    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume = currentVolume - 1;
        }

    }

    public void next() {
        if (currentStationNumber < amountOfStations - 1) {
            currentStationNumber = currentStationNumber + 1;
        } else {
            currentStationNumber = 0;
        }

    }

    public void prev() {
        if (currentStationNumber != 0) {
            currentStationNumber = currentStationNumber - 1;
        } else {
            currentStationNumber = amountOfStations - 1;
        }

    }

    public void setCurrentStationNumber(int stationNumber) {
        if ((stationNumber >= 0) && (stationNumber <= amountOfStations - 1)) {
            currentStationNumber = stationNumber;
        } else {
            currentStationNumber = amountOfStations - 1;
        }
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentVolume(int volume) {
        if ((volume >= 0) && (volume <= 100)) {
            currentVolume = volume;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
