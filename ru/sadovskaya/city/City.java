package ru.sadovskaya.city;

import lombok.Getter;
import lombok.Setter;
import ru.sadovskaya.geometry.PolygonalChain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class City {
    @Getter
    @Setter
    private String name;
    List<Destination> roadTo = new ArrayList<>();

    public City(String name, Destination... roadTo) {
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
        List<Destination> roadTo2 = new ArrayList<>(roadTo);
        roadTo2.add(new Destination(city, price));
        this.roadTo = roadTo2;
    }

    public List<Destination> getRoadTo() {
        return new ArrayList<>(roadTo);
    }

    @Override
    public String toString() {
        return "Город " + name +
                ", дорога: " + roadTo;
    }

    @Override
    public int hashCode() {
        return this.roadTo.size();
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof City city)) return false;
        return Objects.equals(this.roadTo, city.roadTo);
    }
}