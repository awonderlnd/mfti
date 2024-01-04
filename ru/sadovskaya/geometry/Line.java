package ru.sadovskaya.geometry;

import ru.sadovskaya.main.Lengthable;

import java.util.Objects;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Line implements Lengthable, Cloneable{
    private Point2D start;
    private Point2D end;

    public Line(int x1, int y1, int x2, int y2) {
        this.start = new Point2D(x1, y1);
        this.end = new Point2D(x2, y2);
    }

    public Line(Point2D start, Point2D end) {
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

    @Override
    public int hashCode() {
        return this.start.getX();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Line line = (Line) obj;
        return Objects.equals(this.start, line.start) && Objects.equals(this.end, line.end);
    }

    @Override
    public Line clone() {
        try {
            return (Line) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
