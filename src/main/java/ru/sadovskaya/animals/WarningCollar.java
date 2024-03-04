package ru.sadovskaya.animals;

import ru.sadovskaya.interfaces.Meowable;

public class WarningCollar implements Meowable {
    Meowable meowable;

    public WarningCollar(Meowable meowable) {
        this.meowable = meowable;
    }

    public void meow() {
        System.out.println("ВНИМАНИЕ!");
        meowable.meow();

    }
}
