package ru.sadovskaya.math;

public class Trafficlight {
    String color = "green";

    public String next() {
        String tmp = color;
        if (tmp.equals("green")) color = "red";
        else if (tmp.equals("red")) color = "green";
        return tmp;
    }
}

        /*Trafficlight trafficlight = new Trafficlight();
        System.out.println(trafficlight.next());
        System.out.println(trafficlight.next());
        System.out.println(trafficlight.next());
        System.out.println(trafficlight.next());
        System.out.println(trafficlight.next());*/
