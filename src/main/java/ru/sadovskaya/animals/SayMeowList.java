package ru.sadovskaya.animals;

import ru.sadovskaya.interfaces.Meowable;

import java.util.ArrayList;
import java.util.List;

public class SayMeowList {
    private ArrayList<Meowable> meowArrayList = new ArrayList<>();

    public void sayMeow(Meowable... meowables) {
        this.meowArrayList.addAll(List.of(meowables));
        for (Meowable meowable : meowArrayList) {
            System.out.print(meowable.toString() + " ");
            meowable.meow();
        }
    }

    public ArrayList<Meowable> getMeowArrayList() {
        return new ArrayList<>(meowArrayList);
    }
}
