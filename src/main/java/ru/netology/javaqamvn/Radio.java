package ru.netology.javaqamvn;

public class Radio {
    private int currentNumber;
    private int currentVolume;
    private int size = 10;
    private int maxNumber;
    public Radio() {
    }
    public Radio(int size) {
        this.size = size;
    }
    public int getMaxNumber() {
        return this.maxNumber = this.size - 1;
    }
    public int getCurrentSize() {
        return this.size;
    }
    public int getCurrentNumber() {
        return this.currentNumber;
    }
    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber >= 0) {
            if (newCurrentNumber <= this.getMaxNumber()) {
                this.currentNumber = newCurrentNumber;
            }
        }
    }
   public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= 0) {
            if (newCurrentVolume <= 100) {
                this.currentVolume = newCurrentVolume;
            }
        }
    }
    public void next() {
        if (this.currentNumber == this.getMaxNumber()) {
            this.currentNumber = 0;
        } else {
            ++this.currentNumber;
        }

    }
    public void prev() {
        if (this.currentNumber == 0) {
            this.currentNumber = this.getMaxNumber();
        } else {
            --this.currentNumber;
        }

    }
    public void increaseVolume() {
        if (this.currentVolume < 100) {
            ++this.currentVolume;
        }

    }
    public void decreaseVolume() {
        if (this.currentVolume > 1) {
            --this.currentVolume;
        }

    }
}
