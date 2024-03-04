package ru.sadovskaya.math;

import lombok.Getter;

import java.util.Objects;

@Getter
final class Fraction extends Number implements Cloneable{
    int num, den;

    public Fraction(int num, int den) {
        if (num == 0) {
            throw new IllegalArgumentException("Числитель не может быть равен 0");
        }
        this.num = num;
        if (den <= 0) {
            throw new IllegalArgumentException("Знаменатель не может быть меньше или равен 0");
        }
        this.den = den;
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }

    public Fraction sum(Fraction fr) {
        return new Fraction(this.num * fr.den + fr.num * this.den, this.den * fr.den);
    }

    public Fraction sum(int x) {
        return new Fraction(this.num + x * this.den, this.den);
    }

    public Fraction minus(Fraction fr) {
        return new Fraction(this.num * fr.den - fr.num * this.den, this.den * fr.den);
    }

    public Fraction minus(int x) {
        return new Fraction(this.num - x * this.den, this.den);
    }

    public Fraction mult(Fraction fr) {
        return new Fraction(this.num * fr.num, this.den * fr.den);
    }

    public Fraction mult(int x) {
        return new Fraction(this.num * x, this.den);
    }

    public Fraction div(Fraction fr) {
        return new Fraction(this.num * fr.den, this.den * fr.num);
    }

    public Fraction div(int x) {
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

    @Override
    public int hashCode() {
        return this.num;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fraction fraction = (Fraction) obj;
        return Objects.equals(this.num, fraction.num) && Objects.equals(this.den, fraction.den);
    }

    @Override
    public Fraction clone() {
        try {
            return (Fraction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
