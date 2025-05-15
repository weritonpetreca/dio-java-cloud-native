package org.example;


import net.datafaker.Faker;
import org.example.persistence.ModuleDAO;
import org.example.persistence.entity.ContactDAO;
import org.example.persistence.entity.ContactEntity;
import org.example.persistence.entity.EmployeeEntity;
import org.example.persistence.EmployeeParamDAO;
import org.example.persistence.EmployeeAuditDAO;
import org.example.persistence.entity.ModuleEntity;
import org.flywaydb.core.Flyway;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Locale;
import java.util.stream.Stream;

import static java.time.ZoneOffset.UTC;

public class Main {

    private final static EmployeeParamDAO employeeDAO = new EmployeeParamDAO();
    private final static EmployeeAuditDAO employeeAuditDAO = new EmployeeAuditDAO();
    private final static ContactDAO contactDAO = new ContactDAO();
    private final static ModuleDAO moduleDAO = new ModuleDAO();
    private final static Faker faker = new Faker(Locale.of("pt", "BR"));

    public static void main(String[] args) {

        var flyway = Flyway.configure().dataSource("jdbc:mysql://localhost:3306/jdbc-sample", "root", "LucifeR1210*").load();
        flyway.migrate();

        /*var employee = new EmployeeEntity();
        employee.setName("Tanandra");
        employee.setSalary(new java.math.BigDecimal("3860"));
        employee.setBirthday(java.time.OffsetDateTime.now().minusYears(32).minusMonths(2).minusDays(5));
        System.out.println(employee);
        employeeDAO.insertWithProcedure(employee);
        System.out.println(employee);*/

//        employeeDAO.findAll().forEach(System.out::println);

//        System.out.println(employeeDAO.findById(2));

        /*var update = new EmployeeEntity();
        update.setId(1);
        update.setName("Dani");
        update.setSalary(new BigDecimal("5550"));
        update.setBirthday(java.time.OffsetDateTime.now().minusYears(32).minusMonths(2).minusDays(15));
        employeeDAO.update(update);*/

//        employeeDAO.delete(5);

//        employeeAuditDAO.findAll().forEach(System.out::println);

        /*var entities = Stream.generate(() -> {
            var employee = new EmployeeEntity();
            employee.setName(faker.name().fullName());
            employee.setSalary(new BigDecimal(faker.number().digits(4)));
            employee.setBirthday(OffsetDateTime.of(LocalDate.now().minusYears(faker.number().numberBetween(40, 20)), LocalTime.MIN, UTC));
            return employee;
        }).limit(10000).toList();

        employeeDAO.insertBatch(entities);*/

        /*var employee = new EmployeeEntity();
        employee.setName("Vanessa");
        employee.setSalary(new java.math.BigDecimal("4243"));
        employee.setBirthday(java.time.OffsetDateTime.now().minusYears(32).minusMonths(10).minusDays(24));
        System.out.println(employee);
        employeeDAO.insertWithProcedure(employee);
        System.out.println(employee);*/

//        var contact = new ContactEntity();
//        contact.setDescription("tanandra@exemplo.com");
//        contact.setType("e-mail");
//        contact.setEmployee(employee);
//        contactDAO.insert(contact);

//        System.out.println(employeeDAO.findById(40002));

        /*var employee = new EmployeeEntity();
        employee.setName("Teresa");
        employee.setSalary(new java.math.BigDecimal("3214"));
        employee.setBirthday(java.time.OffsetDateTime.now().minusYears(32).minusMonths(10).minusDays(24));
        System.out.println(employee);
        employeeDAO.insertWithProcedure(employee);
        System.out.println(employee);

        var contact1 = new ContactEntity();
        contact1.setDescription("tanandra@exemplo.com");
        contact1.setType("e-mail");
        contact1.setEmployee(employee);
        contactDAO.insert(contact1);

        var contact2 = new ContactEntity();
        contact2.setDescription("35997232323");
        contact2.setType("celular");
        contact2.setEmployee(employee);
        contactDAO.insert(contact2);*/

//        System.out.println(employeeDAO.findById(40004));

//        employeeDAO.findAll().forEach(System.out::println);

        /*var entities = Stream.generate(() -> {
            var employee = new EmployeeEntity();
            employee.setName(faker.name().fullName());
            employee.setSalary(new BigDecimal(faker.number().digits(4)));
            employee.setBirthday(OffsetDateTime.of(LocalDate.now().minusYears(faker.number()
                    .numberBetween(40, 20)), LocalTime.MIN, UTC));
            employee.setModules(new ArrayList<>());
            var moduleAmount = faker.number().numberBetween(1, 4);
            for (int i = 0; i < moduleAmount; i++) {
                var module = new ModuleEntity();
                module.setId(i + 1);
                employee.getModules().add(module);
            }
            return employee;
        }).limit(3).toList();
        entities.forEach(employeeDAO::insert);*/

        moduleDAO.findAll().forEach(System.out::println);
    }
}