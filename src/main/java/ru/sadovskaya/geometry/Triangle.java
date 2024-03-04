package ru.sadovskaya.geometry;

import ru.sadovskaya.interfaces.Polygonalable;

import static java.lang.Math.sqrt;

public class Triangle extends Figure implements Polygonalable {
    private static final String name = "Треугольник";
    Point2D b, c;

    public Triangle(Point2D a, Point2D b, Point2D c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    public double getPerimeter() {
        ClosedPolyline triangle = new ClosedPolyline(anchor, b, c);
        return triangle.getLength();
    }

    @Override
    public double getArea() {
        double halfPer = this.getPerimeter() / 2;
        Line<Point2D> ab = Line.of(anchor.x, anchor.y, b.x, b.y);
        Line<Point2D> bc = Line.of(b.x, b.y, c.x, c.y);
        Line<Point2D> ca = Line.of(c.x, c.y, anchor.x, anchor.y);
        return sqrt(halfPer * (halfPer - ab.getLength()) * (halfPer - bc.getLength()) *
                (halfPer - ca.getLength()));
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " с вершинами: " + anchor + ", " + b + ", " + c;
    }

    @Override
    public PolygonalChain getPolygonalChain() {
        return new PolygonalChain(anchor, b, c);
    }

    @Override
    public void shift(Coordinate coordinate, int shift) {
        switch (coordinate) {
            case X -> {
                this.anchor.shift(Coordinate.X, shift);
                this.b.shift(Coordinate.X, shift);
                this.c.shift(Coordinate.X, shift);
            }
            case Y -> {
                this.anchor.shift(Coordinate.Y, shift);
                this.b.shift(Coordinate.Y, shift);
                this.c.shift(Coordinate.Y, shift);
            }
        }
    }
}
