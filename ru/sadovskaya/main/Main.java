package ru.sadovskaya.main;

import ru.sadovskaya.geometry.Point2D;
import ru.sadovskaya.math.Pow;
import ru.sadovskaya.math.Summator;
import ru.sadovskaya.peoples.Department;
import ru.sadovskaya.peoples.Employee;

import java.awt.Point;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        //4.1.3
        /*Summator summator = new Summator();
        BigInteger i = new BigInteger("1234567891234567891212345678912345678912");
        System.out.println(summator.getSum(i, 7, 3.21, (11/3)));*/

        //4.1.4
        /*args = new String[2];
        args[0] = "3";
        args[1] = "3";
        out.println("Результат возведения " + args[0] + " в степень " +
                args[1] + " равен " + Pow.getPow(args[0], args[1]));*/

        //4.1.5
        /*Point2D point = new Point2D(3,7);
        out.println(point);
        java.awt.Point point1 = new Point(1,1);
        out.println(point1);*/

        //4.2.1
        /*Department depIT = new Department("IT");
        Department depSales = new Department("Sales");
        Employee emp1 = new Employee("Alex", depIT);
        Employee emp2 = new Employee("Max", depIT);
        depIT.setBoss(emp1);
        out.println(emp2);
        depIT.removeEmployee(emp2);
        out.println(emp1);
        out.println("Уволили Макса");
        out.println(emp2);
        depSales.setBoss(emp2);
        out.println("Сделали Макса начальником Sales");
        out.println(depSales);
        out.println(depSales.getEmployeeList());
        out.println("--------------------------------------------");
        out.println("Перевели Алекса в Sales");
        emp1.setDepartment(depSales);
        out.println(depIT.getEmployeeList());
        out.println(depSales.getEmployeeList());
        out.println("Сделали Алекса боссом IT");
        depIT.setBoss(emp1);
        out.println(depIT.getEmployeeList());
        out.println(depSales.getEmployeeList());*/
    }
}