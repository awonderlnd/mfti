package ru.sadovskaya.geometry;

import lombok.Getter;
import lombok.Setter;
import ru.sadovskaya.geometry.Figure;
import ru.sadovskaya.geometry.Point2D;

@Getter
@Setter
public class Circle extends Figure {
    private double radius;
    private static final String name = "Круг";

    public Circle(Point2D center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return name +
                " с центром " + anchor +
                " и радиусом " + radius;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void shift(Coordinate coordinate, int shift) {
        switch (coordinate) {
            case X -> this.anchor.shift(Coordinate.X, shift);
            case Y -> this.anchor.shift(Coordinate.Y, shift);
        }
    }
}
