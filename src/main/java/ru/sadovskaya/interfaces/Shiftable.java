package ru.sadovskaya.interfaces;

import ru.sadovskaya.geometry.Coordinate;
import ru.sadovskaya.geometry.Point2D;

public interface Shiftable {

    void shift(Coordinate coordinate, int shift);

}
