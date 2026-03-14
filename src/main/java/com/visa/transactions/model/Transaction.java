package com.visa.transactions.model;

import jakarta.persistence.*;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private Long accountId;

    @Setter
    private Integer operationTypeId;

    @Setter
    private Double amount;

    @Setter
    private LocalDateTime eventDate;
}
