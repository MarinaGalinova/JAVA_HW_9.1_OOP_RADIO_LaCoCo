public class Radio {
    public int currentNumber;
    public int currentVolume;

    public int getCurrentNumber() {
        return currentNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentNumber(int newCurrentNumber) {

        if (newCurrentNumber < 0) {
            return;
        }
        if (newCurrentNumber > 9) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public void next() {  // метод ничего не возвращает, поэтому void. Ничего не принимает, так как радио само знает, какой номер станции у нее текущий

        if (currentNumber == 9) {
            currentNumber = 0;
        } else
            currentNumber = currentNumber + 1;
    }

    public void prev() {  // метод ничего не возвращает, поэтому void. Ничего не принимает, так как радио само знает, какой номер станции у нее текущий

        if (currentNumber == 0) {
            currentNumber = 9;
        } else
            currentNumber = currentNumber - 1;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {

        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 1) {
            currentVolume = currentVolume - 1;
        }

    }

}