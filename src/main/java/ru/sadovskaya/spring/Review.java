package ru.sadovskaya.spring;

import lombok.Getter;
import ru.sadovskaya.reflection.ToString;

public class Review {
    public String review;
    @Getter
    public int grade;

    public Review(String review, int grade) {
        this.review = review;
        this.grade = grade;
    }

    private Review() {
    }
}
