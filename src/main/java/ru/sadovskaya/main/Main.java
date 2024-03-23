package ru.sadovskaya.main;

import lombok.SneakyThrows;
import lombok.ToString;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {

        ApplicationContext ctx =
                new AnnotationConfigApplicationContext("ru.sadovskaya.postProcessors");

        System.out.println(ctx.getBean("random"));
        System.out.println(ctx.getBean("testerBean"));

        //Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);

    }

    public static int sum(String... args) {
        int res = 0;
        for (String s : args) {
            res += Integer.parseInt(s);
        }
        return res;
    }
}
