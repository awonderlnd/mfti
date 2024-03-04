package ru.sadovskaya.peoples.students;

import ru.sadovskaya.interfaces.Converter;

public class StudentParser implements Converter<Student> {
    @Override
    public Student convert(String string) {
        return new Student(string);
    }
}
