package ru.netology.javaqamvn;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class RadioTest {
    @Test
    public void shouldSetSize100() {
        Radio station = new Radio(100);

        Assertions.assertEquals(100, station.getCurrentSize());
    }

    @Test
    public void shouldSetRightDefaultSize() {
        Radio station = new Radio();

        Assertions.assertEquals(10, station.getCurrentSize());
    }
    @Test
    public void shouldSetRightMaxNumberDefaultSize() {
        Radio station = new Radio();

        Assertions.assertEquals(9, station.getMaxNumber());
    }
    @Test
    public void shouldSetRightMaxNumberSize100() {
        Radio station = new Radio(100);

        Assertions.assertEquals(99, station.getMaxNumber());
    }
    @Test
    public void shouldSetRightNumberDefaultSize() {
        Radio station = new Radio();
        station.setCurrentNumber(9);

        int expected = 9;
        int actual = station.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetRightNumberSize100() {
        Radio station = new Radio(100);
        station.setCurrentNumber(9);

        int expected = 9;
        int actual = station.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldntSetNegativeNumberDefaultSize() {
        Radio station = new Radio();

        station.setCurrentNumber(-1);

        int expected = 0;
        int actual = station.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldntSetNegativeNumberSize100() {
        Radio station = new Radio(100);

        station.setCurrentNumber(-1);

        int expected = 0;
        int actual = station.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldntSetOverMaxNumberDefaultSize() {
        Radio station = new Radio();

        station.setCurrentNumber(station.getMaxNumber() + 1);

        int expected = 0;
        int actual = station.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldntSetOverMaxNumberSize100() {
        Radio station = new Radio(100);

        station.setCurrentNumber(station.getMaxNumber() + 1);

        int expected = 0;
        int actual = station.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetCurrentNumberDefaultSize() {
        Radio station = new Radio();
        station.setCurrentNumber(4);

        int expected = 4;
        int actual = station.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetCurrentNumberSize100() {
        Radio station = new Radio(100);
        station.setCurrentNumber(4);

        int expected = 4;
        int actual = station.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMakeRightNextNumberDefaultSize() {
        Radio station = new Radio();

        station.setCurrentNumber(7);
        station.next();

        int expected = 8;
        int actual = station.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMakeRightNextNumberSize100() {
        Radio station = new Radio(100);

        station.setCurrentNumber(7);
        station.next();

        int expected = 8;
        int actual = station.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMakeRightNextNumberIfMaxNumberDefaultSize() {
        Radio station = new Radio();

        station.setCurrentNumber(station.getMaxNumber());
        station.next();

        int expected = 0;
        int actual = station.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMakeRightNextNumberIfMaxNumberSize100() {
        Radio station = new Radio(100);

        station.setCurrentNumber(station.getMaxNumber());
        station.next();

        int expected = 0;
        int actual = station.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMakeRightPrevNumberDefaultSize() {
        Radio station = new Radio();

        station.setCurrentNumber(7);
        station.prev();

        int expected = 6;
        int actual = station.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMakeRightPrevNumberSize100() {
        Radio station = new Radio(100);

        station.setCurrentNumber(7);
        station.prev();

        int expected = 6;
        int actual = station.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMakeRightPrevNumberIf0DefaultSize() {
        Radio station = new Radio();

        station.setCurrentNumber(0);
        station.prev();

        int expected = station.getMaxNumber();
        int actual = station.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMakeRightPrevNumberIf0Size100() {
        Radio station = new Radio(100);

        station.setCurrentNumber(0);
        station.prev();

        int expected = station.getMaxNumber();
        int actual = station.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRightVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(9);

        int expected = 9;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetRightVolume() {

        Radio station = new Radio();
        station.setCurrentVolume(9);

        int expected = 9;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetRightVolumeIfNegative() {

        Radio station = new Radio();
        station.setCurrentVolume(-1);

        int expected = 0;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetRightVolumeIfOver100() {

        Radio station = new Radio();
        station.setCurrentVolume(101);

        int expected = 0;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {

        Radio station = new Radio();
        station.setCurrentVolume(5);
        station.increaseVolume();

        int expected = 6;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIf10() {

        Radio station = new Radio();
        station.setCurrentVolume(100);
        station.increaseVolume();

        int expected = 100;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {

        Radio station = new Radio();
        station.setCurrentVolume(5);
        station.decreaseVolume();

        int expected = 4;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIf0() {

        Radio station = new Radio();
        station.setCurrentVolume(0);
        station.decreaseVolume();

        int expected = 0;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

