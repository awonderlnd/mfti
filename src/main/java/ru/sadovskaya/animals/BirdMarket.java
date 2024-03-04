package ru.sadovskaya.animals;

import ru.sadovskaya.interfaces.Singable;

import java.util.ArrayList;
import java.util.List;

public class BirdMarket{

    private ArrayList<Singable> birdArrayList = new ArrayList<>();

    public void birdsSing(Singable... singable) {
        this.birdArrayList.addAll(List.of(singable));
        for (Singable singable1 : birdArrayList) {
            singable1.sing();
        }
    }

    public ArrayList<Singable> getBirdArrayList() {
        return new ArrayList<>(birdArrayList);
    }
}
