package ru.sadovskaya.spring;

public class Review {
    public String review;
    public int grade;

    public Review(String review, int grade) {
        this.review = review;
        this.grade = grade;
    }

    private Review() {
    }
}
