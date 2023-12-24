package ru.sadovskaya.geometry;

import ru.sadovskaya.main.Areable;

abstract public class Figure implements Areable {
    Point2D anchor;

    public Figure(Point2D anchor) {
        this.anchor = anchor;
    }

    public abstract double getArea();
    public abstract String getName();
}
