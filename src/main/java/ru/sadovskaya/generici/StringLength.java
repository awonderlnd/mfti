package ru.sadovskaya.generici;

public class StringLength implements Applyable<String, Integer> {
    @Override
    public Integer apply(String str) {
        return str.length();
    }
}
