package ru.sadovskaya.trafficlight;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("startcolor")
public class GreenColor implements Color {
    public static final Color GREEN = new GreenColor();

    private GreenColor() {
    }

    @Override
    public Color next() {
        return YellowColor.YELLOW;
    }

    @Override
    public String toString() {
        return "Green";
    }
}
