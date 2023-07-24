package com.example.demo2.model;

import java.util.Objects;
import java.util.UUID;

public abstract class BankAccount {

    private String accountId;
    private double initialBalance;
    private String currency;
    private AccountStatus accountStatus;

    public BankAccount() {
        this.accountId= UUID.randomUUID().toString();
        this.accountStatus = AccountStatus.CREATED;
    }

    public BankAccount(String currency, double initialBalance) {
        this();
        this.initialBalance = initialBalance;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "accountId='" + accountId + '\'' +
                ", balance=" + initialBalance +
                ", currency='" + currency + '\'' +
                ", status=" + accountStatus +
                '}';
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public AccountStatus getStatus() {
        return accountStatus;
    }

    public void setStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.accountId)+
                Objects.hashCode(this.initialBalance)+
                Objects.hashCode(this.accountStatus)+
                Objects.hashCode(this.currency);
    }

    public abstract String getType();

    public final void print(){
        System.out.println("===============  BANK ==================");
    }

}
