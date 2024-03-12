package ru.sadovskaya.trafficlight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("red")
public class RedColor implements Color {

    @Autowired
    @Qualifier("startcolor")
    Color nextColor;

    private RedColor() {
    }

    @Override
    public Color next() {
        return nextColor;
    }

    @Override
    public String toString() {
        return "Red";
    }
}
