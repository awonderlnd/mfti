package ru.sadovskaya.city;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class City {
    @Getter
    @Setter
    private String name;
    List<Destination> roadTo = new ArrayList<>();

    City(String name, Destination... roadTo) {
        this.name = name;
        if (roadTo != null) {
            this.roadTo = Arrays.asList(roadTo);
        }
    }

    public boolean hasRoadTo(City city) {
        for (Destination d : roadTo) {
            if (d.getDestination() == city){
                return true;
            }
        }
        return false;
    }
    public void deleteRoadTo(City city) {
        for (Destination d : roadTo) {
            if (d.getDestination() == city){
                roadTo.remove(d);
            }
        }
    } //Не могу понять, почему метод падает с ошибкой

    public void addRoadTo(City city, int price) {
        for (Destination d : roadTo) {
            if (d.getDestination() == city){
                d.setPrice(price);
                return;
            }
        }
        roadTo.add(new Destination(city, price));
    } // не работает add, даже просто b.roadTo.add(new ru.sadovskaya.city.Destination(c, 11)); в мэйне

    public List<Destination> getRoadTo() {
        return new ArrayList<>(roadTo);
    }

    @Override
    public String toString() {
        return "Город " + name +
                ", дорога: " + roadTo;
    }
}