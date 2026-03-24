package com.visa.transactions.controller;

import com.visa.transactions.dto.TransactionRequest;
import com.visa.transactions.model.Transaction;
import com.visa.transactions.service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public Transaction createTransaction(@RequestBody TransactionRequest request) {
        return transactionService.createTransaction(request);
    }

    @GetMapping("/{accountId}")
    public List<Transaction> getTransactionByAccountId(@PathVariable Long accountId) {
        return transactionService.getTransactionByAccountId(accountId);
    }

}
