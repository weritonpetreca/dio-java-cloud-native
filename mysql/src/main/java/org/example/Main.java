package org.example;


import org.example.persistence.ConnectionUtil;
import org.example.persistence.entity.EmployeeDAO;
import org.example.persistence.entity.EmployeeEntity;
import org.flywaydb.core.Flyway;

import java.math.BigDecimal;
import java.sql.SQLException;

public class Main {

    private final static EmployeeDAO employeeDAO = new EmployeeDAO();

    public static void main(String[] args) {

        var flyway = Flyway.configure().dataSource("jdbc:mysql://localhost:3306/jdbc-sample", "root", "LucifeR1210*").load();
        flyway.migrate();

//        var employee = new EmployeeEntity();
//        employee.setName("Bia");
//        employee.setSalary(new java.math.BigDecimal("2550"));
//        employee.setBirthday(java.time.OffsetDateTime.now().minusYears(22));
//        System.out.println(employee);
//        employeeDAO.insert(employee);
//        System.out.println(employee);

//        employeeDAO.findAll().forEach(System.out::println);

//        System.out.println(employeeDAO.findById(2));

//        var employee = new EmployeeEntity();
//        employee.setId(3);
//        employee.setName("Dani");
//        employee.setSalary(new BigDecimal("5550"));
//        employee.setBirthday(java.time.OffsetDateTime.now().minusYears(32).minusMonths(2).minusDays(15));
//        employeeDAO.update(employee);

//        employeeDAO.delete(3);
    }
}