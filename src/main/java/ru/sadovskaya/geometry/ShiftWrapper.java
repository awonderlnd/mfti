package ru.sadovskaya.geometry;

import ru.sadovskaya.interfaces.Shiftable;

import java.util.ArrayList;
import java.util.List;

public class ShiftWrapper implements Shiftable {
    private final List<Shiftable> shiftableList = new ArrayList<>();

    public ShiftWrapper(Shiftable... shiftable) {
        this.shiftableList.addAll(List.of(shiftable));
    }

    public List<Shiftable> getShiftableList() {
        return new ArrayList<>(shiftableList);
    }

    public Shiftable get(int index){
        List<Shiftable> newList = new ArrayList<>(shiftableList);
        return newList.get(index);
    }

    @Override
    public void shift(Coordinate coordinate, int shift) {
        for (Shiftable shiftable : shiftableList) {
            shiftable.shift(coordinate, shift);
        }
    }

    @Override
    public String toString() {
        return "" + this.getShiftableList();
    }
}
