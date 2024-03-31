//package ru.sadovskaya.jdbc;
//
//import lombok.SneakyThrows;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class EmployeeDAO {
//    Connection con;
//
//    public EmployeeDAO(Connection con) {
//        this.con = con;
//    }
//
//    @SneakyThrows
//    public List<Employee> getEmployee() {
//        List<Employee> employees = new ArrayList<>();
//        Statement stm = con.createStatement();
//        ResultSet res = stm.executeQuery("SELECT * FROM Employee");
//        while (res.next()) {
//            employees.add(new Employee(res.getInt(1), res.getString(2),
//                    res.getInt(3)));
//        }
//
//        return employees;
//    }
//
//    @SneakyThrows
//    public void addEmployee(Employee employee) {
//        PreparedStatement pstm = con.prepareStatement("INSERT INTO Employee VALUES(?, ?, ?)");
//        pstm.setInt(1, employee.id);
//        pstm.setString(2, employee.name);
//        pstm.setInt(3, employee.departmentId);
//        pstm.execute();
//
//    }
//
//    public void deleteEmployee(Employee employee) {
//    }
//
//    public void findEmployeeByID(Employee employee) {
//
//    }
//
//}
