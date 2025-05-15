package org.example.persistence;

import org.example.persistence.entity.EmployeeEntity;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import static java.time.ZoneOffset.UTC;

public class AcessDAO {

    public void insert(final long employeeId, final long moduleId) {
        try (
                var connection = ConnectionUtil.getConnection();
                var statement = connection.prepareStatement("INSERT INTO accesses (employee_id, module_id) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS)

        ) {
            statement.setLong(1, employeeId);
            statement.setLong(2, moduleId);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
