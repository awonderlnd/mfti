package ru.sadovskaya.geometry;

import ru.sadovskaya.interfaces.Areable;
import ru.sadovskaya.interfaces.Shiftable;

abstract public class Figure implements Areable, Shiftable {
    Point2D anchor;

    public Figure(Point2D anchor) {
        this.anchor = anchor;
    }

    public abstract double getArea();
    public abstract String getName();
}
