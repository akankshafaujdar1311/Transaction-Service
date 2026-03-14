package com.visa.transactions.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "operation_types")
public class OperationType {

    @Id
    private Integer id;

    private String description;
}
