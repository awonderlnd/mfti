package ru.sadovskaya.trafficlight;

import org.springframework.stereotype.Component;

@Component
public class RedColor implements Color {
    public static final Color RED = new RedColor();

    private RedColor() {
    }

    @Override
    public Color next() {
        return GreenColor.GREEN;
    }

    @Override
    public String toString() {
        return "Red";
    }
}
