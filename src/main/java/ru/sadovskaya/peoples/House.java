package ru.sadovskaya.peoples;

public class House {
    private final int floor;

    House(int floor) {
        if (floor < 0) {
            throw new IllegalArgumentException("Количество этажей не может быть отрицательным");
        }
        this.floor = floor;
    }

    public String toString() {
        if (floor % 10 == 1) {
            return "Дом с " + floor + " этажом";
        }
        return "Дом с " + floor + " этажами";
    }
}
