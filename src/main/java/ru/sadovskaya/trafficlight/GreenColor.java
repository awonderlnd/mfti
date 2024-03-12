package ru.sadovskaya.trafficlight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("startcolor")
public class GreenColor implements Color {

    @Autowired
    @Qualifier("yellowGreen")
    Color nextColor;

    private GreenColor() {
    }

    @Override
    public Color next() {
        return nextColor;
    }

    @Override
    public String toString() {
        return "Green";
    }
}
