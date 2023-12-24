package ru.sadovskaya.animals;

public class Sparrow extends Bird {

    Sparrow() {
        super("Воробей", "чырык");
    }

    @Override
    public void sing() {
        System.out.println(getSongType());
    }

    @Override
    public String toString() {
        return getSpecies() + " поёт " + getSongType();
    }
}
