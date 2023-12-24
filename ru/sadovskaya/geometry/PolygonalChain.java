package ru.sadovskaya.geometry;

import ru.sadovskaya.main.Lengthable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolygonalChain implements Lengthable {
    List<Point2D> pointList;

    PolygonalChain(Point2D... pointList) {
        this.pointList = Arrays.asList(pointList);
    }

    @Override
    public String toString() {
        if (this.pointList.isEmpty()) {
            return "Линия отсутствует";
        } else return "Линия " + this.pointList;
    }

    List<Point2D> addPoints(Point2D... newPointList) {
        this.pointList = new ArrayList<>(pointList);
        this.pointList.addAll(List.of(newPointList));
        return this.pointList;
    }

    List<Point2D> addPoints(List<Point2D> listPoint) {
        this.pointList = new ArrayList<>(pointList);
        this.pointList.addAll(listPoint);
        return this.pointList;
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
}
