package ru.sadovskaya.animals;

import ru.sadovskaya.main.Meowable;

public class Cat implements Meowable {
    String name;
    Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Кот " + name;
    }
}