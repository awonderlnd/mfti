package ru.sadovskaya.animals;

import java.util.Random;

public class Cuckoo extends Bird {
    Cuckoo() {
        super("Кукушка", "ку-ку");
    }

    @Override
    public void sing() {
        Random random = new Random();
        int randomNumber = random.nextInt(11);
        if (randomNumber > 0) {
            System.out.println((getSongType() + " ").repeat(randomNumber));
        }
        else System.out.println(getSongType());
    }

    @Override
    public String toString() {
        return getSpecies() + " поёт " + getSongType();
    }
}
