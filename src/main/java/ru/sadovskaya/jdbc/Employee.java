package ru.sadovskaya.jdbc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter

public class Employee {
    int ID;
    String NAME;
    int DepartmentID;

    public Employee(int ID, String NAME, int departmentID) {
        this.ID = ID;
        this.NAME = NAME;
        DepartmentID = departmentID;
    }
}
