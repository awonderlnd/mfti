package ru.sadovskaya.peoples;

import ru.sadovskaya.interfaces.Meowable;

public class Person implements Meowable {
    private final Name name;
    private int height;
    private final Person father;

    Person(String firstName, int height) {
        this(new Name(firstName), height, null);
    }

    Person(String firstName, int height, Person father) {
        this(new Name(firstName), height, father);
    }

    Person(Name name, int height) {
        this(name, height, null);
    }


    Person(Name name, int height, Person father) {
        String firstName = name.getFirstName();
        String patronymic = name.getPatronymic();
        String lastName = name.getLastName();
        if (height <= 0 || height > 500) {
            throw new IllegalArgumentException("Недопустимое значение роста");
        }
        this.height = height;
        if (father != null) {
            this.father = new Person(father);
            if (lastName == "" && (this.father.name.getLastName() != null)) {
                lastName = this.father.name.getLastName();
            }
            if (patronymic == "") {
                patronymic = getPatronymic(this.father.name.getFirstName());
            }
        } else this.father = null;
        this.name = new Name(firstName, lastName, patronymic);
    }

    Person(Person father) {
        this(father.getName(), father.getHeight(), father.getFather());
    }

    public String getPatronymic(String fatherName) {
        if (fatherName.endsWith("й") || fatherName.endsWith("ь")) {
            fatherName =
                    fatherName.substring(0, fatherName.length() - 1);
            return fatherName + "евич";
        } else return fatherName + "ович";
    }

    public void setHeight(int height) {
        if (height <= 0 || height > 500) {
            throw new IllegalArgumentException("Недопустимое значение роста");
        }
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public Person getFather() {
        return father;
    }

    public Name getName() {
        return name;
    }

    public String toString() {
        return name + "";
    }
}

