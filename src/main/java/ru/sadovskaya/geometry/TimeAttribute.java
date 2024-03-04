package ru.sadovskaya.geometry;

import ru.sadovskaya.geometry.Attribute;

public class TimeAttribute extends Attribute {
    TimeAttribute(String value) {
        super("Время", value);
    }

    @Override
    public String getValue() {
        return (String) super.getValue();
    }
}
