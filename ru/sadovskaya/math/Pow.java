package ru.sadovskaya.math;
import static java.lang.Integer.parseInt;
import static java.lang.StrictMath.pow;

public class Pow {
    public static int getPow(String base, String exponent) {
        int num1 = parseInt(base);
        int num2 = parseInt(exponent);
        return (int) pow(num1, num2);
    }
}
