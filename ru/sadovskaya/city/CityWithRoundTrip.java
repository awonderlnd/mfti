package ru.sadovskaya.city;

public class CityWithRoundTrip extends City {
    public CityWithRoundTrip(String name, Destination... roadTo) {
        super(name, roadTo);
    }


//    @Override
//    public void addRoadTo(ru.sadovskaya.city.City city, int price) {
//        //c.addRoadTo(new ru.sadovskaya.city.City("a"), 5);
//        super(city, price);
//        if (!city.hasRoadTo(this)) {
//            city.addRoadTo(this, price);
//        }
//    }

    @Override
    public void addRoadTo(City city, int price) {
        super.addRoadTo(city, price);
    }
}
