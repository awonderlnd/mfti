package ru.sadovskaya.geometry;

import ru.sadovskaya.interfaces.Lengthable;
import ru.sadovskaya.interfaces.Shiftable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PolygonalChain implements Lengthable, Shiftable {
    List<Point2D> pointList;

    public PolygonalChain(Point2D... pointList) {
        this.pointList = Arrays.asList(pointList);
    }

    @Override
    public String toString() {
        if (this.pointList.isEmpty()) {
            return "Линия отсутствует";
        } else return "Линия " + this.pointList;
    }

    public List<Point2D> addPoints(Point2D... newPointList) {
        this.pointList = new ArrayList<>(pointList);
        this.pointList.addAll(List.of(newPointList));
        return this.pointList;
    }

    public void addPoints(List<Point2D> listPoint) {
        this.pointList = new ArrayList<>(pointList);
        this.pointList.addAll(listPoint);
    }

    public List<Point2D> getPointList() {
        return new ArrayList<>(pointList);
    }

    public Point2D getPoint(int index) {
        return pointList.get(index);
    }

    @Override
    public double getLength() {
        double dist = 0d;
        for (int i = 0; i < this.pointList.size() - 1; i++) {
            Line line = new Line(this.pointList.get(i), this.pointList.get(i + 1));
            dist += line.getLength();
        }
        return dist;
    }

    @Override
    public int hashCode() {
        return this.getPoint(0).x;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PolygonalChain poly = (PolygonalChain) obj;
        return Objects.equals(this.pointList, poly.pointList);
    }

    @Override
    public void shift(Coordinate coordinate, int shift) {
        switch (coordinate) {
            case X -> {
                for (Point2D point2D : this.pointList) {
                    point2D.shift(Coordinate.X, shift);
                }
            }
            case Y -> {
                for (Point2D point2D : this.pointList) {
                    point2D.shift(Coordinate.Y, shift);
                }
            }
        }
    }
}
