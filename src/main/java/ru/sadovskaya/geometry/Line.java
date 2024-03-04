package ru.sadovskaya.geometry;

import lombok.Getter;
import lombok.Setter;
import ru.sadovskaya.interfaces.Lengthable;
import ru.sadovskaya.interfaces.Shiftable;

import java.util.Objects;

@Setter
@Getter
public class Line<T extends Point2D> implements Lengthable, Cloneable, Shiftable {
    private T start;
    private T end;

    public Line(T start, T end) {
        this.start = start;
        this.end = end;
    }

    public static Line<Point2D> of(int x1, int y1, int x2, int y2) {
        return new Line<>(new Point2D(x1, y1), new Point2D(x2, y2));
    }

    public static <E extends Point2D> Line<E> of(E start, E end) {
        return new Line<>(start, end);
    }

    public String toString() {
        return "Линия от " + start + " до " + end;
    }

    public Line<T> moveX(Line<T> line){
        line.start.x =  line.start.x + 10;
        return line;
    }

    @Override
    public double getLength() {
        return this.start.distanceTo(this.end);
    }

    @Override
    public int hashCode() {
        return this.start.x;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Line<T> line = (Line<T>) obj;
        return Objects.equals(this.start, line.start)
                && Objects.equals(this.end, line.end);
    }

    @Override
    public Line<T> clone() {
        try {
            Line line = (Line) super.clone();
            line.start = start.clone();
            line.end = end.clone();
            return line;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void shift(Coordinate coordinate, int shift) {
        switch (coordinate) {
            case X -> {
                this.start.shift(Coordinate.X, shift);
                this.end.shift(Coordinate.X, shift);
            }
            case Y -> {
                this.start.shift(Coordinate.Y, shift);
                this.end.shift(Coordinate.Y, shift);
            }
        }
    }
}
