package ru.sadovskaya.math;

public class Time {
    private final int sec;
    private final int min;
    private final int hour;

    Time(int hour, int min, int sec) {
        if (hour > 24){
            throw new IllegalArgumentException("Вводимое значение должно быть меньше 24");
        }
        this.hour = hour;
        if (min > 60){
            throw new IllegalArgumentException("Вводимое значение должно быть меньше 60");
        }
        this.min = min;
        this.sec = sec;
    }

    Time(int sec) {
        this(0, 0, sec);
        if (sec > 86400) {
            throw new IllegalArgumentException("Вводимое значение должно быть меньше 86400");
        }
    }

    public String toString() {
        if (min == 0 && hour == 0) {
            return sec / 3600 + ":" + (sec % 3600) / 60 + ":" + sec % 60;
        }
        return hour + ":" + min + ":" + sec;
    }

    int getHour(){
        if (hour != 0) {
            return hour;
        }
        return sec / 3600;
    }

    int getMin(){
        if (min != 0){
            return min;
        }
        return (sec % 3600) / 60;
    }

    int getSec(){
        return sec % 60;
    }
}
