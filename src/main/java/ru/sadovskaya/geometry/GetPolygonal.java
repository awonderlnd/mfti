package ru.sadovskaya.geometry;

import ru.sadovskaya.interfaces.Polygonalable;

import java.util.ArrayList;
import java.util.List;

public class GetPolygonal {
    private ArrayList<Polygonalable> polygonalables = new ArrayList<>();

    public PolygonalChain makePolygonalChain(Polygonalable... figures) {
        this.polygonalables.addAll(List.of(figures));
        PolygonalChain total = new PolygonalChain();
        for (Polygonalable figure : polygonalables) {
            total.addPoints(figure.getPolygonalChain().getPointList());
        }
        return total;
    }

    public ArrayList<Polygonalable> getGetPolygonalChains() {
        return new ArrayList<>(polygonalables);
    }
}
