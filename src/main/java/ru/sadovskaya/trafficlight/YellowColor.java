package ru.sadovskaya.trafficlight;

import org.springframework.stereotype.Component;

@Component
public class YellowColor implements Color {
    public static final Color YELLOW = new YellowColor();

    private YellowColor() {
    }

    @Override
    public Color next() {
        return RedColor.RED;
    }

    @Override
    public String toString() {
        return "Yellow";
    }
}
