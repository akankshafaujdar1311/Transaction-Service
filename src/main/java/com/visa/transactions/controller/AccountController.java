package com.visa.transactions.controller;

import com.visa.transactions.dto.AccountRequest;
import com.visa.transactions.model.Account;
import com.visa.transactions.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public Account createAccount(@RequestBody AccountRequest request) {
         log.atInfo().log("Creating account with document number: {}", request.getDocumentNumber());
        return accountService.createAccount(request.getDocumentNumber());
    }

    @GetMapping("/{accountId}")
    public Account getAccount(@PathVariable Long accountId) {
        log.atInfo().log("Retrieving account with ID: {}", accountId);
        return accountService.getAccount(accountId);
    }

    @GetMapping("/all")
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }
}
