package ru.sadovskaya.animals;
import ru.sadovskaya.interfaces.Meowable;

public class CountCollar implements Meowable {
    Meowable meowable;
    public int count;

    public CountCollar(Meowable meowable) {
        this.meowable = meowable;
    }

    public void meow() {
        meowable.meow();
        count++;
    }


}
