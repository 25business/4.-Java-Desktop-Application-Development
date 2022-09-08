package com.example;

public class ElapsedTime {
    private int tenths;
    private int seconds;
    private int minutes;

    public void incrementTenths() {
        tenths += 1;
        if(tenths == 10) {
            seconds += 1;
            tenths = 0;

            if(seconds == 60) {
                minutes += 1;
                seconds = 0;
            }
        }
    }

    public String toString() {
        return String.format("%02d:%02d.%02d",minutes, seconds, tenths);
    }
}
