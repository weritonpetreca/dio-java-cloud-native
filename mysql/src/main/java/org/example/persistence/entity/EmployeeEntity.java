package org.example.persistence.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Data
public class EmployeeEntity {

    private long id;
    private String name;
    private BigDecimal salary;
    private OffsetDateTime birthday;
}
