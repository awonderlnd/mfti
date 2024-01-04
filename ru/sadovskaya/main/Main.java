package ru.sadovskaya.main;
import ru.sadovskaya.geometry.Point2D;
import ru.sadovskaya.geometry.Point3D;
import ru.sadovskaya.geometry.PolygonalChain;
import ru.sadovskaya.math.Fraction;
import ru.sadovskaya.geometry.Line;
import ru.sadovskaya.city.*;

public class Main {
    public static void main(String[] args) {

        //3.4.1
        /*Fraction fr1 = new Fraction(1,4);
        Fraction fr2 = new Fraction(1,4);
        Fraction fr3 = new Fraction(3,4);
        Fraction fr4 = new Fraction(1,7);
        System.out.println(fr1.equals(fr2));
        System.out.println(fr1.equals(fr3));
        System.out.println(fr1.equals(fr4));*/

        //3.4.2
        /*Point2D p1 = new Point2D(1,4);
        Point2D p2 = new Point2D(1,4);
        Point2D p3 = new Point2D(3,4);
        Point2D p4 = new Point2D(1,7);
        Point2D p5 = new Point2D(3,4);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(null));*/

        //3.4.3
        /*Line l1 = new Line(p1, p2);
        Line l2 = new Line(p2, p1);
        Line l3 = new Line(p2, p3);
        Line l4 = new Line(p4, p1);
        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(l3));
        System.out.println(l1.equals(l4));*/

        //3.4.4
        /*PolygonalChain l1 = new PolygonalChain(p1, p2, p3);
        PolygonalChain l2 = new PolygonalChain(p2, p1, p5);
        PolygonalChain l3 = new PolygonalChain(p3, p2, p1);
        System.out.println(l1.equals(l2));
        System.out.println(l2.equals(l1));
        System.out.println(l1.equals(l3));*/

        //3.4.5
        /*City a = new City("A");
        City b = new City("B", new Destination(a, 5));
        City d = new City("E");
        City c = new City("C", new Destination(d, 6));
        b.addRoadTo(a, 19);
        System.out.println(b);
        b.addRoadTo(c, 11);
        System.out.println(b);
        Destination destination = new Destination(c, 11);
        SmartCity aSmart = new SmartCity("A");
        aSmart.addRoadTo(c, 1 );
        System.out.println(aSmart);
        System.out.println(c);*/

        //3.4.6
        /*City a = new SmartCity("A");
        City b = new City("B");
        City c = new City("C");
        City d = new SmartCity("D");
        City e = new City("E");
        a.addRoadTo(c, 6);
        b.addRoadTo(c, 3);
        d.addRoadTo(b, 7);
        e.addRoadTo(c, 6);
        System.out.println(a);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a.equals(e));
        System.out.println(a.equals(d));*/

        //4.2.3
        /*Fraction fr1 = new Fraction(1,4);
        Fraction fr2 = fr1.clone();
        System.out.println(fr1);
        System.out.println(fr2);
        System.out.println(fr1==fr2);
        System.out.println(fr1.equals(fr2));*/

        //4.2.4
        /*Point2D p1 = new Point3D(11,9,5);
        Point2D p2 = p1.clone();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));*/

        //4.2.5
        /*Line l1 = new Line(3,5,6,7);
        Line l2 = l1.clone();
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l1==l2);
        System.out.println(l1.equals(l2));*/

    }
}