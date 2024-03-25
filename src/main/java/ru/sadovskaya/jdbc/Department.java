package ru.sadovskaya.jdbc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Department {
    String ID;
    String NAME;

    public Department(String ID, String NAME) {
        this.ID = ID;
        this.NAME = NAME;
    }

    public Department() {
    }
}
