package ru.sadovskaya.geometry;

import ru.sadovskaya.interfaces.Areable;

import java.util.ArrayList;
import java.util.List;

public class FigureListArea {
    private ArrayList<Areable> figureArrayList = new ArrayList<>();

    public double totalArea(Areable... areables) {
        this.figureArrayList.addAll(List.of(areables));
        double totalArea = 0;
        for (Areable areable : figureArrayList) {
            totalArea += areable.getArea();
        }
        return totalArea;
    }

    public ArrayList<Areable> getFigureArrayList() {
        return new ArrayList<>(figureArrayList);
    }
}
