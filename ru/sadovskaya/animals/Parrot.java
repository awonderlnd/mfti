package ru.sadovskaya.animals;

import java.util.Random;

public class Parrot extends Bird{
    public Parrot(String text) {
        super("Попугай", text);
    }

    @Override
    public void sing() {
        Random random = new Random();
        int randomNumber = random.nextInt(getSongType().getBytes().length);
        if (randomNumber > 0 && randomNumber < getSongType().length()) {
            System.out.println((getSongType().substring(0,randomNumber)));
        }
        else System.out.println(getSongType().charAt(0));
    }

    @Override
    public String toString() {
        return getSpecies() + " поёт " + getSongType();
    }
}
