package com.visa.transactions.service;

import com.visa.transactions.dto.TransactionRequest;
import com.visa.transactions.model.Transaction;
import com.visa.transactions.repository.AccountRepository;
import com.visa.transactions.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;
    private final AccountRepository accountRepository;

    public TransactionService(TransactionRepository transactionRepository,
                              AccountRepository accountRepository) {
        this.transactionRepository = transactionRepository;
        this.accountRepository = accountRepository;
    }

    public List<Transaction> getTransactionByAccountId(Long accountId){
        return transactionRepository.findByAccountId(accountId);
    }

    public Transaction createTransaction(TransactionRequest request) {
        if (request.getAccountId() == null) {
            throw new IllegalArgumentException("Account ID must not be null");
        }
        accountRepository.findById(request.getAccountId())
                .orElseThrow(() -> new RuntimeException("Account not found"));

        Double amount = request.getAmount();

        if (request.getOperationTypeId() == 1 ||
                request.getOperationTypeId() == 2 ||
                request.getOperationTypeId() == 3) {

            amount = -Math.abs(amount);
        } else if (request.getOperationTypeId() == 4) {
            amount = Math.abs(amount);
        }

        Transaction transaction = new Transaction();
        transaction.setAccountId(request.getAccountId());
        transaction.setOperationTypeId(request.getOperationTypeId());
        transaction.setAmount(amount);
        transaction.setEventDate(LocalDateTime.now());

        return transactionRepository.save(transaction);
    }
}
