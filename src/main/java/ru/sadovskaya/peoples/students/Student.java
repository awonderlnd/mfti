package ru.sadovskaya.peoples.students;

import lombok.Getter;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.function.Predicate;

public class Student implements Comparable<Student> {
    @Getter
    String name;
    private final List<Integer> marks = new ArrayList<>();
    Predicate<Integer> predicate;
    private final Deque<Action> actions = new ArrayDeque<>();

    Student(String name) {
        this.name = name;
    }

    public Student(String name, Predicate<Integer> rule, int... marks) {
        this(name);
        this.predicate = rule;
        for (int i : marks) {
            if (predicate.test(i)) {
                this.marks.add(i);
            }
        }
    }

    public void addMarks(int... marks) {
        List<Integer> tmp = new ArrayList<>();
        for (int i : marks) {
            if (predicate.test(i)) {
                this.marks.add(i);
                tmp.add(i);
            } else throw new IllegalArgumentException("Недопустимое значение оценки");
            actions.push(() -> this.marks.removeAll(tmp));
        }
    }

    public void setName(String name) {
        String tmp = this.name;
        actions.push(() -> this.name = tmp);
        this.name = name;
    }

    public void undo() {
        actions.pop().make();
    }

    public Save getSave() {
        return new SaveImpl();
    }

    public void removeMark(int index) {
        if (marks.size() > index) {
            int grade = marks.get(index);
            actions.push(() -> marks.add(index, grade));
            this.marks.remove(index);
        } else throw new IllegalArgumentException();
    }

    void removeAllMarks() {
        this.marks.clear();
    }

    public List<Integer> getMarks() {
        return new ArrayList<>(marks);
    }

    public double getAver() {
        if (marks.isEmpty()) {
            return 0;
        }
        int sum = 0;
        int count = 0;
        for (Integer i :
                marks) {
            sum += i;
            count++;
        }
        return (double) sum / count;
    }

    public String isExcellent() {
        if (this.getAver() == 5.0) {
            return "Отличник.";
        }
        return "Не отличник.";
    }

    @Override
    public int compareTo(Student compareStud) {
        return Double.compare(this.getAver(), compareStud.getAver());
    }

    @Override
    public String toString() {
        if (this.marks.isEmpty()) {
            return name + ": нет оценок";
        } else return name + ": " + marks;
    }

    private class SaveImpl implements Save {
        String name = Student.this.name;
        List<Integer> marks = new ArrayList<>(Student.this.marks);

        @Override
        public void load() {
            Student.this.name = name;
            Student.this.marks.clear();
            Student.this.marks.addAll(marks);
            Student.this.actions.clear();
        }
    }
}


