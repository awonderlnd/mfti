package ru.sadovskaya.animals;

import ru.sadovskaya.interfaces.Meowable;

public class Cat implements Meowable {
    String name;
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Кот " + name;
    }
}