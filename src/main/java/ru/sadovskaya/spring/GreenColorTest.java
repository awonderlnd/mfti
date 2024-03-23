package ru.sadovskaya.spring;

import ru.sadovskaya.reflection.Test;

public class GreenColorTest {
    @Test
    public void test1(GreenColor greenColor) {
        if (greenColor.toString() == null) throw new RuntimeException("Validation exception");
    }
}
