package ru.sadovskaya.reflection;

public class Testt {
    String s;
    int x;
    Testt t;
    Object ob;

    public Testt() {
    }

    @Invoke
    public String test1() {
        return "test1";
    }

    @Invoke
    public Integer test2() {
        return 11;
    }

    public String test3() {
        return "test3";
    }

    @Override
    public String toString() {
        return "Test{" +
                "s='" + s + '\'' +
                ", x=" + x +
                '}';
    }
}
