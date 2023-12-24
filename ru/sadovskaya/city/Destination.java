package ru.sadovskaya.city;

import lombok.Getter;
import lombok.Setter;

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
}
