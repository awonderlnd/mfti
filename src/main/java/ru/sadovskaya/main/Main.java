package ru.sadovskaya.main;

import jakarta.persistence.Entity;
import lombok.SneakyThrows;
import org.hibernate.Hibernate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import ru.sadovskaya.jdbc.*;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication
@ComponentScan("ru.sadovskaya.jdbc")
@EntityScan("ru.sadovskaya.jdbc")
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Main.class);
        DepartmentRepo repo = ctx.getBean(DepartmentRepo.class);
        EmployeeRepo emp = ctx.getBean(EmployeeRepo.class);
        System.out.println(emp.findAll());
        //System.out.println(repo.findAll());
    }


    public static int sum(String... args) {
        int res = 0;
        for (String s : args) {
            res += Integer.parseInt(s);
        }
        return res;
    }
}
