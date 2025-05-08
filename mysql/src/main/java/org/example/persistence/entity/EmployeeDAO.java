package org.example.persistence.entity;

import org.example.persistence.ConnectionUtil;

import java.sql.Statement;

import java.sql.SQLException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static java.time.ZoneOffset.UTC;

public class EmployeeDAO {

    public void insert(final EmployeeEntity entity) {
        try (
                var connection = ConnectionUtil.getConnection();
                var statement = connection.createStatement()
        ) {
            var sql = "INSERT INTO employees (name, salary, birthday) VALUES ('" + entity.getName() + "', " + entity.getSalary() + " , '" + formatOffSetDateTime(entity.getBirthday()) + "' )";
            statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            try (var generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    entity.setId(generatedKeys.getLong(1));
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void update(final EmployeeEntity entity) {
        try (
                var connection = ConnectionUtil.getConnection();
                var statement = connection.createStatement()
        ) {
            var sql = "UPDATE employees set name = '" + entity.getName() + "', salary = " + entity.getSalary() + " , birthday = '"+ formatOffSetDateTime(entity.getBirthday()) + "' WHERE id = " + entity.getId();
            statement.executeUpdate(sql);
            System.out.printf("Foram afetados %s registros na base de dados\n", statement.getUpdateCount());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void delete(final long id) {
        try (
                var connection = ConnectionUtil.getConnection();
                var statement = connection.createStatement()
        ) {
            var sql = "DELETE FROM employees WHERE id = " + id;
            statement.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public List<EmployeeEntity> findAll() {
        List<EmployeeEntity> entities = new ArrayList<>();
        try (
                var connection = ConnectionUtil.getConnection();
                var statement = connection.createStatement();
        ){
            statement.executeQuery("SELECT * FROM employees ORDER BY name");
            var resultSet = statement.getResultSet();
            while (resultSet.next()) {
                var entity = new EmployeeEntity();
                entity.setId(resultSet.getLong("id"));
                entity.setName(resultSet.getString("name"));
                entity.setSalary(resultSet.getBigDecimal("salary"));
                var birthdayInstant = resultSet.getTimestamp("birthday").toInstant();
                entity.setBirthday(OffsetDateTime.ofInstant(birthdayInstant, UTC));
                entities.add(entity);
            }
        }
        catch (SQLException ex) {
        ex.printStackTrace();
    }
        return entities;
}

public EmployeeEntity findById(final long id) {
    var entity = new EmployeeEntity();
    try (
            var connection = ConnectionUtil.getConnection();
            var statement = connection.createStatement();
    ){
        statement.executeQuery("SELECT * FROM employees WHERE id = " + id);
        var resultSet = statement.getResultSet();
        if (resultSet.next()) {
            entity.setId(resultSet.getLong("id"));
            entity.setName(resultSet.getString("name"));
            entity.setSalary(resultSet.getBigDecimal("salary"));
            var birthdayInstant = resultSet.getTimestamp("birthday").toInstant();
            entity.setBirthday(OffsetDateTime.ofInstant(birthdayInstant, UTC));
        }
    }
    catch (SQLException ex) {
        ex.printStackTrace();
    }
    return entity;
}

private String formatOffSetDateTime(final OffsetDateTime dateTime) {
    var utcDatetime = dateTime.atZoneSameInstant(UTC);
    return utcDatetime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
}
}
