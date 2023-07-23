package com.example.demo2.model;

public class SavingAccount extends BankAccount{

    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingAccount() {
        super();

    }

    public SavingAccount(String currency, double initialBalance, double interestRate) {
        super(currency, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "Saving Account, Interest Rate= "+interestRate+", "+super.toString();
    }

    @Override
    public String getType() {
        return "SAVING_ACCOUNT";
    }
}
