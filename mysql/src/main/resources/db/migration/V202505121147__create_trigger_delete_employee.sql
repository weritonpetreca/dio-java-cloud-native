DELIMITER $
CREATE TRIGGER tgr_employee_audit_delete BEFORE DELETE ON employees
FOR EACH ROW
BEGIN
    INSERT INTO employees_audit (employee_id, old_name, old_salary, old_birthday, operation) VALUES (OLD.id, OLD.name, OLD.salary, OLD.birthday, 'D');
END $
DELIMITER;