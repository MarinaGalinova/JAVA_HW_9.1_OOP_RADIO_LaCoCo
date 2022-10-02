import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class RadioTest {

    @Test
    public void shouldSetRightNumber() {
        Radio station = new Radio();
        station.setCurrentNumber(9);

        int expected = 9;
        int actual = station.currentNumber;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void shouldntSetNegativeNumber() {
        Radio station = new Radio();

        station.setCurrentNumber(-1);

        int expected = 0;
        int actual = station.currentNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldntSetOverNineNumber() {
        Radio station = new Radio();

        station.setCurrentNumber(15);

        int expected = 0;
        int actual = station.currentNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetCurrentNumber() {
        Radio station = new Radio();
        station.setCurrentNumber(4);

        int expected = 4;
        int actual = station.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMakeRightNextNumber() {
        Radio station = new Radio();

        station.setCurrentNumber(7);
        station.next();

        int expected = 8;
        int actual = station.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMakeRightNextNumberIf9() {
        Radio station = new Radio();

        station.setCurrentNumber(9);
        station.next();

        int expected = 0;
        int actual = station.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMakeRightPrevNumber() {
        Radio station = new Radio();

        station.setCurrentNumber(7);
        station.prev();

        int expected = 6;
        int actual = station.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMakeRightPrevNumberIf0() {
        Radio station = new Radio();

        station.setCurrentNumber(0);
        station.prev();

        int expected = 9;
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
    public void shouldGetRightVolumeIfOver10() {

        Radio station = new Radio();
        station.setCurrentVolume(11);

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
        station.setCurrentVolume(10);
        station.increaseVolume();

        int expected = 10;
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

//@Test
//    public void shouldNotSetOverMax() {
//        Conditioner cond = new Conditioner();
//
//        cond.setCurrentTemperature(50);
//
//        int expected = 0;
//        int actual = cond.getCurrentTemperature();
//
//        Assertions.assertEquals(expected, actual);
