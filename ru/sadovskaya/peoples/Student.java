package ru.sadovskaya.peoples;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private final List<Integer> gradeList = new ArrayList<>();


    Student(String name, int... gradeList) {
        this.name = name;
        for (int i : gradeList) {
            if (i >= 2 && i <= 5) {
                this.gradeList.add(i);
            }
        }
    }

    void setGrade(int... gradeList) {
        for (int i : gradeList) {
            if (i < 2 || i > 5) {
                throw new IllegalArgumentException("Недопустимое значение оценки");
            } else this.gradeList.add(i);
        }
    }

    public List<Integer> getGradeList() {
        return new ArrayList<>(gradeList);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        if (this.gradeList.isEmpty()) {
            return name + ": нет оценок";
        } else return name + ": " + gradeList;
    }

    double getAver() {
        if (gradeList.isEmpty()) {
            return 0;
        }
        int sum = 0;
        int count = 0;
        for (Integer i :
                gradeList) {
            sum += i;
            count++;
        }
        return (double) sum / count;
    }

    String isExcellent() {
        if (this.getAver() == 5.0) {
            return "Отличник.";
        }
        return "Не отличник.";
    }
}
