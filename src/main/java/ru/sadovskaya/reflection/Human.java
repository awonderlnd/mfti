package ru.sadovskaya.reflection;

import lombok.Getter;

@Getter
@Validate(HumanTests.class)
public class Human {

    private String name;
    private int age;

    public Human(String name, int age) {
        this.age = age;
        this.name = name;
    }

//    public Human(int age) {
//        this.age = age;
//    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                '}';
    }
}

