package ru.sadovskaya.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.sadovskaya.reflection.Default;

@Qualifier("yellowGreen")
@Component
public class YellowGreen implements Color {

    @Default(value = "hello")
    String testValue;
    @Autowired
    @Qualifier("startcolor")
    Color nextColor;

    private YellowGreen() {
    }

    @Override
    public Color next() {
        return nextColor;
    }

    @Override
    public String toString() {
        return "Yellow";
    }
}
