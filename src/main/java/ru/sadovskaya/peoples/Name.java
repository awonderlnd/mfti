package ru.sadovskaya.peoples;

public class Name {
    private final String lastName;
    private final String firstName;

    private final String patronymic;

    Name(String firstName, String lastName, String patronymic) {
        if ((firstName == "" || firstName == null) && (lastName == "" || lastName == null)
                && (patronymic == "" || patronymic == null)) {
            throw new IllegalArgumentException("Хотя бы один параметр должен иметь значение");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    Name(String firstName) {
        this(firstName, "", "");
    }

    Name(String firstName, String lastName) {
        this(firstName, lastName, "");
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String toString() {
        return firstName + " " + patronymic + " " + lastName;
    }
}
