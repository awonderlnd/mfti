package ru.sadovskaya.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import ru.sadovskaya.peoples.students.Student;

import java.util.*;
import java.util.function.Predicate;

@Configuration
public class Config {
    @Autowired
    ApplicationContext ac;

    @Bean
    public String hello() {
        return "Hello world!";
    }

    @Bean
    @Scope("prototype")
    public int random(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
        //не додумалась как уникальные из диапазона выкидывать

    }

//    @Bean
//    @Scope("prototype")
//    public int random2(int min, int max) {
//        ArrayList<Integer> integers = new ArrayList<>();
//        for (int i = min; i <= max; i++) {
//            integers.add(i);
//        }
//        int n = (int) Math.floor(Math.random() * integers.size());
//        int tmp = n;
//        integers.remove(n);
//        return tmp;
//    }


    @Bean
    @Lazy
    public Date origin() {
        return new Date();
    }

    @Bean
    public Predicate<Integer> range() {
        return i -> i >= 2 && i <= 5;
    }

    @Bean
    public int min() {
        return 0;
    }

    @Bean
    public int max() {
        return 99;
    }

    @Bean
    public Review good() {
        return new Review("Очень хорошо", 4);
    }

    @Bean
    public Review normally() {
        return new Review("Сойдет", 3);
    }

    @Bean
    public Review unclear(int random) {
        return new Review("Сложно сказать", random);
    }

    @Bean
    @Scope("prototype")
    public Review best(List<Review> list) {
        list.sort((o1, o2) -> o2.grade - o1.grade);
        return list.get(0);
    }

    @Bean
    public Student student1(Predicate<Integer> range) {
        return new Student("name1", range);
    }

    @Bean
    public Student student2(Predicate<Integer> range, int... grades) {
        return new Student("name2", range, grades);
    }

    @Bean
    public StudentBuilder studentBuilder() {
        return new StudentBuilder();
    }
}
