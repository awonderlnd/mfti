package ru.sadovskaya.geometry;

import lombok.Getter;

@Getter
public abstract class Attribute {
    private String name;
    private Object value;

    public Attribute(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return name +
                " - " + value;
    }
}
