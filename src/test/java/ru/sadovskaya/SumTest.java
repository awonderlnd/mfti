package ru.sadovskaya;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.sadovskaya.main.Main;

public class SumTest {

    @Test
    @DisplayName("normal summing case")
    void test1(){
        int res = Main.sum("1", "2");
        Assertions.assertEquals(3, res, "складывает числа неправильно");
    }

    @Test
    @DisplayName("args have not a number")
    void test2(){
        Assertions.assertThrows(NumberFormatException.class, () -> Main.sum("1", "2D"));
    }

}
