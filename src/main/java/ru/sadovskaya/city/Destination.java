package ru.sadovskaya.city;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public class Destination {
    private City destinationCity;
    @Getter
    @Setter
    private int price;

    public Destination(City destination, int price) {
        this.destinationCity = destination;
        this.price = price;
    }

    public City getDestination() {
        return destinationCity;
    }

    @Override
    public String toString() {
        return destinationCity.getName() +
                ": " + price;
    }

    @Override
    public int hashCode() {
        return this.price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Destination dest = (Destination) obj;
        return Objects.equals(this.destinationCity, dest.destinationCity)
                && Objects.equals(this.price, dest.price);
    }
}
