package ru.sadovskaya.geometry;

public class ColorAttribute extends Attribute {
    ColorAttribute(String value) {
        super("Цвет", value);
    }

    @Override
    public String getValue() {
        return (String) super.getValue();
    }
}
