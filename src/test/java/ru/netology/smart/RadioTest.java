package ru.netology.smart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setCurrentStationNumber() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(8);

        int expected = 8;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationNumberUnderLimit() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(-8);

        int expected = 0;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationNumberOverLimit() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(10);

        int expected = 0;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation9() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(9);
        rad.next();

        int expected = 0;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextStationUnderLimit() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(-1);
        rad.next();

        int expected = 1;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation0() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(0);
        rad.prev();

        int expected = 9;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevStationOverLimit() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(10);
        rad.prev();

        int expected = 9;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolume100() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolume0() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(8);
        rad.increaseVolume();

        int expected = 9;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(8);
        rad.decreaseVolume();

        int expected = 7;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeOverLimit() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.decreaseVolume();

        int expected = 9;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolume100() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.decreaseVolume();

        int expected = 99;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolume0() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextStation() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(8);
        rad.next();

        int expected = 9;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextStation0() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(0);
        rad.next();

        int expected = 1;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevStation() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(7);
        rad.prev();

        int expected = 6;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevStation9() {
        Radio rad = new Radio();

        rad.setCurrentStationNumber(9);
        rad.prev();

        int expected = 8;
        int actual = rad.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentVolumeUnderLimit() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-7);


        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentVolumeOverLimit() {
        Radio rad = new Radio();

        rad.setCurrentVolume(123);


        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
