package ru.sadovskaya.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ru.sadovskaya.peoples.students.Student;

import java.util.function.Predicate;

@Component
public class StudentBuilder {

    @Autowired
    Predicate<Integer> range;

    public Student createStudent(String name, int... grades) {
        return new Student(name, range, grades);
    }
}
