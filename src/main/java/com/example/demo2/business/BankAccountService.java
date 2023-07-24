package com.example.demo2.business;

import com.example.demo2.exceptions.AccountNotFoundException;
import com.example.demo2.model.BankAccount;

import java.util.List;

public interface BankAccountService {
    BankAccount addBankAccount(BankAccount account);
    List<BankAccount> getAllAccount() ;
    BankAccount getAccountBuID(String id) throws AccountNotFoundException;
    void addRandomData(int size);
    void credit(String accountId, double amount);
    void debit(String accountId, double amount);
    void transfer(String accountSource, String accountDestination, double amount);
}
