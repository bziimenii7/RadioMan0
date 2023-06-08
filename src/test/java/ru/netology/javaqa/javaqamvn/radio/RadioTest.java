package ru.netology.javaqa.javaqamvn.radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/currentStation.csv")
    public void shouldSetStation(int station, int expected) {
        ru.netology.javaqa.javaqamvn.radio.Radio rad = new ru.netology.javaqa.javaqamvn.radio.Radio();

        rad.setCurrentStation(station);

        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/nextStation.csv")
    public void switchNextStation(int station, int expected) {
        ru.netology.javaqa.javaqamvn.radio.Radio rad = new ru.netology.javaqa.javaqamvn.radio.Radio();

        rad.setCurrentStation(station);
        rad.nextStation();

        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/prevStation.csv")
    public void switchPrevStation(int station, int expected) {
        ru.netology.javaqa.javaqamvn.radio.Radio rad = new ru.netology.javaqa.javaqamvn.radio.Radio();

        rad.setCurrentStation(station);
        rad.prevStation();

        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/currentVolume.csv")
    public void shouldSetVolume(int volume, int expected) {
        ru.netology.javaqa.javaqamvn.radio.Radio rad = new ru.netology.javaqa.javaqamvn.radio.Radio();

        rad.setCurrentVolume(volume);

        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/increaseVolume.csv")
    public void switchIncreaseVolume(int volume, int expected) {
        ru.netology.javaqa.javaqamvn.radio.Radio rad = new ru.netology.javaqa.javaqamvn.radio.Radio();

        rad.setCurrentVolume(volume);
        rad.increaseVolume();

        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/decreaseVolume.csv")
    public void switchDecreaseVolume(int volume, int expected) {
        ru.netology.javaqa.javaqamvn.radio.Radio rad = new ru.netology.javaqa.javaqamvn.radio.Radio();

        rad.setCurrentVolume(volume);
        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}