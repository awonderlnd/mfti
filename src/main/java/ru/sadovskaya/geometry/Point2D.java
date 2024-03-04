package ru.sadovskaya.geometry;

import lombok.Getter;
import lombok.Setter;
import ru.sadovskaya.interfaces.Shiftable;

import java.util.Objects;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

@Setter
@Getter
public class Point2D implements Cloneable, Shiftable {
    public int x, y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Точка {" + x + ";" + y + "}";
    }

    @Override
    public int hashCode() {
        return this.x;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point2D point2D = (Point2D) obj;
        return Objects.equals(this.x, point2D.x) && Objects.equals(this.y, point2D.y);
    }

    @Override
    public Point2D clone() {
        try {
            return (Point2D) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public double distanceTo(Point2D point) {
        double kat1 = point.x - this.x;
        double kat2 = point.y - this.y;
        return sqrt(pow(kat1, 2) + pow(kat2, 2));
    }

    @Override
    public void shift(Coordinate coordinate, int shift) {
        switch (coordinate) {
            case X -> this.x += shift;
            case Y -> this.y += shift;
        }
    }



    //реализовать подсчет точки

}
