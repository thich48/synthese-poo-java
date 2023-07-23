package com.example.demo2.model;

import java.util.Objects;
import java.util.UUID;

public abstract class BankAccount {

    private String accountId;
    private double initialBalance;
    private String currency;
    private Status status;

    public BankAccount() {
        this.accountId= UUID.randomUUID().toString();
        this.status=Status.CREATED;
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
                ", status=" + status +
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.accountId)+
                Objects.hashCode(this.initialBalance)+
                Objects.hashCode(this.status)+
                Objects.hashCode(this.currency);
    }

    public abstract String getType();
}
