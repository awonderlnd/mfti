package ru.sadovskaya.jdbc;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAO {
    Connection con;

    public DepartmentDAO(Connection con) {
        this.con = con;
    }

    @SneakyThrows
    public List<Department> getDepartment() {
        List<Department> departments = new ArrayList<>();
        Statement stm = con.createStatement();
        ResultSet res = stm.executeQuery("SELECT * FROM Department");
        while (res.next()) {
            departments.add(new Department(res.getString(1), res.getString(2)));
        }

        return departments;
    }

    @SneakyThrows
    public void addDepartment(Department department) {
        PreparedStatement pstm = con.prepareStatement("INSERT INTO Department VALUES(?, ?)");
        pstm.setString(1, department.ID);
        pstm.setString(2, department.NAME);
        pstm.execute();

    }

    public void deleteDepartment(Employee employee) {
    }

    public void findByID(Employee employee) {

    }

}
