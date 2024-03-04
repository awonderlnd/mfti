package ru.sadovskaya.geometry;

import ru.sadovskaya.interfaces.Lengthable;

import java.util.ArrayList;
import java.util.List;

public class LengthSummator{

    private ArrayList<Object> countSumLength = new ArrayList<>();

    public double totalLength(Lengthable... lengthable) {
        double lenSum = 0;
        this.countSumLength.addAll(List.of(lengthable));
        for (Lengthable lengthable1 : lengthable) {
            lenSum += lengthable1.getLength();
        }
        return lenSum;
    }

    public ArrayList<Object> getCountSumLength() {
        return new ArrayList<>(countSumLength);
    }

    @Override
    public String toString() {
        return "Список объектов " + countSumLength;
    }
}
