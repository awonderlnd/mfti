package ru.sadovskaya.main;

import lombok.SneakyThrows;
import ru.sadovskaya.jdbc.DAO;
import ru.sadovskaya.jdbc.Department;
import ru.sadovskaya.jdbc.Employee;
import ru.sadovskaya.jdbc.EmployeeDAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Connection con = DriverManager.getConnection("jdbc:h2:.\\Office");
//        EmployeeDAO employeeDAO = new EmployeeDAO(con);
//        System.out.println(employeeDAO.getEmployee());
        DAO<Department> departmentDAO = new DAO<>(con, Department.class);
        System.out.println(departmentDAO.get());
        con.close();
    }

    public static int sum(String... args) {
        int res = 0;
        for (String s : args) {
            res += Integer.parseInt(s);
        }
        return res;
    }
}
