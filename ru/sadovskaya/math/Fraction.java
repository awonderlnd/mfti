package ru.sadovskaya.math;

final class Fraction extends Number {
    private final int num, den;

    Fraction(int num, int den) {
        if (num == 0) {
            throw new IllegalArgumentException("Числитель не может быть равен 0");
        }
        this.num = num;
        if (den <= 0) {
            throw new IllegalArgumentException("Знаменатель не может быть меньше или равен 0");
        }
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }

    Fraction sum(Fraction fr) {
        return new Fraction(this.num * fr.den + fr.num * this.den, this.den * fr.den);
    }

    Fraction sum(int x) {
        return new Fraction(this.num + x * this.den, this.den);
    }

    Fraction minus(Fraction fr) {
        return new Fraction(this.num * fr.den - fr.num * this.den, this.den * fr.den);
    }

    Fraction minus(int x) {
        return new Fraction(this.num - x * this.den, this.den);
    }

    Fraction mult(Fraction fr) {
        return new Fraction(this.num * fr.num, this.den * fr.den);
    }

    Fraction mult(int x) {
        return new Fraction(this.num * x, this.den);
    }

    Fraction div(Fraction fr) {
        return new Fraction(this.num * fr.den, this.den * fr.num);
    }

    Fraction div(int x) {
        return new Fraction(this.num, this.den * x);
    }

    @Override
    public int intValue() {
        return num / den;
    }

    @Override
    public long longValue() {
        return num / den;
    }

    @Override
    public float floatValue() {
        return (float) num / den;
    }

    @Override
    public double doubleValue() {
        return (double) num / den;
    }
}
