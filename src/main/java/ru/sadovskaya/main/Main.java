package ru.sadovskaya.main;

import lombok.SneakyThrows;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.sadovskaya.peoples.students.Student;
import ru.sadovskaya.spring.Review;
import ru.sadovskaya.spring.StudentBuilder;
import ru.sadovskaya.trafficlight.TrafficLight;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {

        //8.1.1
        ApplicationContext ctx = new AnnotationConfigApplicationContext("ru.sadovskaya.spring");
        System.out.println(ctx.getBean("hello"));

        //8.1.2
        System.out.println(ctx.getBean("random"));


        //8.1.3
        System.out.println(ctx.getBean("origin"));
        System.out.println(ctx.getBean("best", Review.class).grade);

        //8.2.5
        StudentBuilder sb = (StudentBuilder) ctx.getBean("studentBuilder");
        Student katya = sb.createStudent("Katya", 7, 6, 4, 5, 2);
        Student vanya = sb.createStudent("Vanya", 1, 2, 5, 9);
        System.out.println();
        System.out.println(katya);
        System.out.println(vanya);
        System.out.println();

        //8.2.7
        ApplicationContext ac =
                new AnnotationConfigApplicationContext("ru.sadovskaya.trafficlight");
        TrafficLight tl = ac.getBean(TrafficLight.class);
        System.out.println(tl.next());
        System.out.println(tl.next());
        System.out.println(tl.next());
        System.out.println(tl.next());
        System.out.println(tl.next());
        System.out.println(tl.next());


    }

    public static int sum(String... args) {
        int res = 0;
        for (String s : args) {
            res += Integer.parseInt(s);
        }
        return res;
    }
}

