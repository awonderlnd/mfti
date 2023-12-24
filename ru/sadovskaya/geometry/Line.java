package ru.sadovskaya.geometry;

import ru.sadovskaya.main.Lengthable;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Line implements Lengthable {
    private Point2D start;
    private Point2D end;

    Line(int x1, int y1, int x2, int y2) {
        this.start = new Point2D(x1, y1);
        this.end = new Point2D(x2, y2);
    }

    Line(Point2D start, Point2D end) {
        this(start.getX(), start.getY(), end.getX(), end.getY());
    }

    Point2D getStart() {
        return start;
    }

    Point2D getEnd() {
        return end;
    }

    void setStart(Point2D start) {
        this.start = new Point2D(start.getX(), start.getY());
    }

    void setEnd(Point2D end) {
        this.end = new Point2D(end.getX(), end.getY());
    }


    public String toString() {
        return "Линия от " + start + " до " + end;
    }


    @Override
    public double getLength() {
        return sqrt(pow(end.getX() - start.getX(), 2) + pow(end.getY() - start.getY(), 2));
    }
}
