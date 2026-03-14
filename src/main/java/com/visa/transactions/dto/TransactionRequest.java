package com.visa.transactions.dto;

import lombok.Getter;

public class TransactionRequest {

    @Getter
    private Long accountId;
    @Getter
    private Integer operationTypeId;
    @Getter
    private Double amount;
}
