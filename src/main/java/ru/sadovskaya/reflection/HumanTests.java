package ru.sadovskaya.reflection;

@Validate(HumanTests.class)

public class HumanTests {

    void testAge(Human human) {
        if (human.getAge() < 0 || human.getAge() > 120) {
            throw new IllegalArgumentException("Ошибка в testAge:" +
                    " возраст человека не в диапазоне от 0 до 120");
        }
    }
}