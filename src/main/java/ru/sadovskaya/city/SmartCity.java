package ru.sadovskaya.city;

public class SmartCity extends City {
    public SmartCity(String name) {
        super(name);
    }

    @Override
    public void addRoadTo(City city, int price) {
        super.addRoadTo(city, price);
        if (!city.hasRoadTo(this)){
            city.addRoadTo(this, price);
        }
    }
}
