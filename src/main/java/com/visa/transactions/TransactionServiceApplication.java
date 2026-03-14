package com.visa.transactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransactionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransactionServiceApplication.class, args);
        System.out.println("Starting Transaction Service...");
        System.out.println("Transaction Service is running...");
        System.out.println("Transaction Service started successfully.");
    }

}
