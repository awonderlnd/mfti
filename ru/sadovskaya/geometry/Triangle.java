package ru.sadovskaya.geometry;

import ru.sadovskaya.main.Polygonalable;

import static java.lang.Math.sqrt;

public class Triangle extends Figure implements Polygonalable {
    private static final String name = "Треугольник";
    Point2D a, b, c;

    Triangle(Point2D a, Point2D b, Point2D c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    public double getPerimeter() {
        ClosedPolyline triangle = new ClosedPolyline(a, b, c);
        return triangle.getLength();
    }

    @Override
    public double getArea() {
        double halfPer = this.getPerimeter() / 2;
        Line ab = new Line(a.getX(), a.getY(), b.getX(), b.getY());
        Line bc = new Line(b.getX(), b.getY(), c.getX(), c.getY());
        Line ca = new Line(c.getX(), c.getY(), a.getX(), a.getY());
        return sqrt(halfPer * (halfPer - ab.getLength()) * (halfPer - bc.getLength()) *
                (halfPer - ca.getLength()));
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " с вершинами: " + a + ", " + b + ", " + c;
    }

    @Override
    public PolygonalChain getPolygonalChain() {
        return new PolygonalChain(a, b, c);
    }
}
