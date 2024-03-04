package ru.sadovskaya.reflection;

@Default
public class Test {
    String s;
    @Default(intValue = 15)
    int x;
    Test t;
    Object ob;

    public Test() {
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
