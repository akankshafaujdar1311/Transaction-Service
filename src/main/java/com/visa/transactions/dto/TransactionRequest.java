package com.visa.transactions.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionRequest {
    private Long accountId;
    private Integer operationTypeId;
    private Double amount;
}
