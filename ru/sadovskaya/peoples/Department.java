package ru.sadovskaya.peoples;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Department {
    @Setter
    @Getter
    String name;
    @Getter
    Employee boss;
    List<Employee> employeeList;

    public Department(String name, Employee boss, List<Employee> employeeList) {
        this.name = name;
        if (boss != null) {
            this.setBoss(boss);
        }
        this.employeeList = employeeList;
    }

    public Department(String name, Employee boss) {
        this(name, boss, new ArrayList<>());
    }

    public Department(String name) {
        this(name, null, new ArrayList<>());
    }

    public void addEmployee(Employee employee) {
        if (employee == null) return;
        if (employeeList.contains(employee)) return;
        removeEmployee(employee);
        employeeList.add(employee);
        employee.department = this;
    }

    public void removeEmployee(Employee employee) {
        if (employee == null) return;
        if (!employeeList.contains(employee)) return;
        if (boss == employee) boss = null;
        employeeList.remove(employee);
        employee.department = null;
    }

    public void setBoss(Employee boss) {
        if (boss.getDepartment() == this) {
            this.boss = boss;
        } else if (boss.getDepartment() == null) {
            boss.setDepartment(this);
            this.boss = boss;
        } else {
            boss.getDepartment().removeEmployee(boss);
            boss.setDepartment(this);
            this.boss = boss;
        }
    }

    public List<Employee> getEmployeeList() {
        return new ArrayList<>(employeeList);
    }

    public void setEmployeeList(Employee... employeeList) {
        this.employeeList.addAll(List.of(employeeList));
    }

    public String toString() {
        if (boss != null) {
            return name + ", начальник которого " + boss.getName();
        }
        return name + " у которого нет начальника.";
    }
}
