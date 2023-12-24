package ru.sadovskaya.peoples;

import lombok.Getter;

@Getter
public class Employee {
    String name;
    Department department;

    public Employee(String name, Department department) {
        this(name);
        this.department = department;
        this.department.setEmployeeList(this);
    }

    public Employee(String name) {
        this.name = name;
    }

    public void setName(String name) {
        if (name == null) name = "";
        this.name = name;
    }

    public void setDepartment(Department department) {
        if (this.department != null) {
            this.department.removeEmployee(this);
        }
        this.department = department;
        if (department != null) this.department.setEmployeeList(this);
    }

    public String toString() {
        if (department != null && this != department.getBoss()) {
            return name + " работает в отделе " + this.getDepartment();
        } else if (department != null) {
            return name + " начальник отдела " + this.getDepartment().getName();
        } else return name + " без отдела";
    }
}
