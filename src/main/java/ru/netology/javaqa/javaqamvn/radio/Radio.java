package ru.netology.javaqa.javaqamvn.radio;

public class Radio {
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        currentStation = currentStation >= maxStation ? minStation : currentStation + 1;
    }

    public void prevStation() {
        currentStation = currentStation <= minStation ? maxStation : currentStation - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        currentVolume = currentVolume >= maxVolume ? maxVolume : currentVolume + 1;
    }

    public void decreaseVolume() {
        currentVolume = currentVolume <= minVolume ? minVolume : currentVolume - 1;
    }
}