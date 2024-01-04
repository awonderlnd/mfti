package ru.sadovskaya.geometry;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
public class Point2D implements Cloneable {
    private int x, y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "{" + x + ";" + y + "}";
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
            throw new AssertionError();
        }
    }
}
