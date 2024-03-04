package ru.sadovskaya.interfaces;

public interface Meowable {
    default void meow() {
        System.out.println("мяу!");
    }
}
