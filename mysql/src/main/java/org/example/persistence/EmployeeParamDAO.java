package org.example.persistence;

import com.mysql.cj.jdbc.StatementImpl;
import org.example.persistence.entity.ContactDAO;
import org.example.persistence.entity.ContactEntity;
import org.example.persistence.entity.EmployeeEntity;
import org.example.persistence.entity.ModuleEntity;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static java.time.ZoneOffset.UTC;
import static java.util.TimeZone.LONG;

public class EmployeeParamDAO {

    private final ContactDAO contactDAO = new ContactDAO();
    private final AcessDAO acessDAO = new AcessDAO();

    public void insert(final EmployeeEntity entity) {
        try (
                var connection = ConnectionUtil.getConnection();
                var statement = connection.prepareStatement("INSERT INTO employees " +
                        "(name, salary, birthday) VALUES (?, ?, ?);")
        ) {
            statement.setString(1, entity.getName());
            statement.setBigDecimal(2, entity.getSalary());
            statement.setTimestamp(3, Timestamp.valueOf(entity.getBirthday()
                    .atZoneSimilarLocal(UTC).toLocalDateTime()));
            statement.executeUpdate();
            if (statement instanceof StatementImpl impl)
                entity.setId(impl.getLastInsertID());
            entity.getModules().stream()
                    .map(ModuleEntity::getId)
                    .forEach(m -> acessDAO.insert(entity.getId(), m));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void insertWithProcedure(final EmployeeEntity entity) {
        try (
                var connection = ConnectionUtil.getConnection();
                var statement = connection.prepareCall("CALL prc_insert_employee (?, ?, ?, ?)")
        ) {
            statement.registerOutParameter(1, LONG);
            statement.setString(2, entity.getName());
            statement.setBigDecimal(3, entity.getSalary());
            statement.setTimestamp(4, Timestamp.valueOf(entity.getBirthday().atZoneSimilarLocal(UTC).toLocalDateTime()));
            statement.execute();
            entity.setId(statement.getLong(1));
            try (var generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    entity.setId(generatedKeys.getLong(1));
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void insertBatch(final List<EmployeeEntity> entities) {
        try (var connection = ConnectionUtil.getConnection()){;
             var sql = "INSERT INTO employees (name, salary, birthday) VALUES (?, ?, ?);";
             try(var statement = connection.prepareStatement(sql)){
                 connection.setAutoCommit(false);
                 for (int i = 0; i < entities.size(); i++){
                     statement.setString(1, entities.get(i).getName());
                     statement.setBigDecimal(2, entities.get(i).getSalary());
                     statement.setTimestamp(3, Timestamp.valueOf(entities.get(i).getBirthday()
                             .atZoneSimilarLocal(UTC).toLocalDateTime()));
                     statement.addBatch();
                     if (i % 1000 == 0 || i == entities.size() - 1) statement.executeBatch();
                 }
                 connection.commit();
             }catch (SQLException ex) {
                 connection.rollback();
                    ex.printStackTrace();
             }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void update(final EmployeeEntity entity) {
        try (
                var connection = ConnectionUtil.getConnection();
                var statement = connection.prepareStatement(
                        "UPDATE employees SET name = ?, salary = ?, birthday = ? WHERE id = ?"
                )
        ) {
            statement.setString(1, entity.getName());
            statement.setBigDecimal(2, entity.getSalary());
            statement.setTimestamp(3, Timestamp.valueOf(entity.getBirthday().atZoneSimilarLocal(UTC).toLocalDateTime()));
            statement.setLong(4, entity.getId());

            statement.executeUpdate();
            System.out.printf("Foram afetados %s registros na base de dados\n", statement.getUpdateCount());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void delete(final long id) {
        try (
                var connection = ConnectionUtil.getConnection();
                var statement = connection.prepareStatement(
                        "DELETE FROM employees WHERE id = ?"
                )
        ) {
            statement.setLong(1, id);
            statement.executeUpdate();
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
                entity.setContacts(contactDAO.findByEmployeeId(resultSet.getLong("id")));
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
    var sql = "SELECT e.id employee_id," +
            "e.name," +
            "e.salary," +
            "e.birthday, " +
            "c.id contact_id," +
            "c.description," +
            "c.type " +
            "FROM employees e " +
            "LEFT JOIN contacts c ON c.employee_id = e.id " +
            "WHERE e.id = ?";
    try (
            var connection = ConnectionUtil.getConnection();
            var statement = connection.prepareStatement(sql);
    ){
        statement.setLong(1, id);
        statement.executeQuery();
        var resultSet = statement.getResultSet();
        if (resultSet.next()) {
            entity.setId(resultSet.getLong("employee_id"));
            entity.setName(resultSet.getString("name"));
            entity.setSalary(resultSet.getBigDecimal("salary"));
            var birthdayInstant = resultSet.getTimestamp("birthday").toInstant();
            entity.setBirthday(OffsetDateTime.ofInstant(birthdayInstant, UTC));
            entity.setContacts(new ArrayList<>());
            do {
                var contact = new ContactEntity();
                contact.setId(resultSet.getLong("contact_id"));
                contact.setDescription(resultSet.getString("description"));
                contact.setType(resultSet.getString("type"));
                entity.getContacts().add(contact);
            } while (resultSet.next());
//            entity.setContact(new ContactEntity());
//            entity.getContact().setId(resultSet.getLong("contact_id"));
//            entity.getContact().setDescription(resultSet.getString("description"));
//            entity.getContact().setType(resultSet.getString("type"));
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
