package ru.sadovskaya.main;

public interface Meowable {
    default void meow() {
        System.out.println("мяу!");
    }
}
