package com.example.demo2.business;

import com.example.demo2.exceptions.AccountNotFoundException;
import com.example.demo2.model.AccountStatus;
import com.example.demo2.model.BankAccount;
import com.example.demo2.model.CurrentAccount;
import com.example.demo2.model.SavingAccount;

import java.nio.channels.AcceptPendingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankAccountServiceImpl implements BankAccountService{

    private List<BankAccount> bankAccountList = new ArrayList<>();

    @Override
    public BankAccount addBankAccount(BankAccount account) {
        bankAccountList.add(account);
        return account;
    }

    @Override
    public List<BankAccount> getAllAccount() {
        return bankAccountList;
    }

    @Override
    public BankAccount getAccountBuID(String id) throws AccountNotFoundException{
        for (BankAccount bankAccount: bankAccountList)
            if(bankAccount.getAccountId().equals(id)){
                return bankAccount;
            }
        throw new AccountNotFoundException("BankAccount not found");
    }

    @Override
    public void addRandomData(int size) {
        AccountStatus[] values = AccountStatus.values();
        Random random = new Random();


        for (int i=0; i<size; i++){
            BankAccount bankAccount;
            if(Math.random()>0.5){
                bankAccount = new CurrentAccount(Math.random()>0.5?"EUR":"USD", Math.random()*1000000,Math.random()*50000);
               bankAccount.setStatus(values[random.nextInt(values.length)]);
            }
            else {
                bankAccount = new SavingAccount(Math.random()>0.5?"EUR":"USD", Math.random()*1000000,3+Math.random()*7);
                bankAccount.setStatus(values[random.nextInt(values.length)]);
            }

            bankAccountList.add(bankAccount);

            }
        }


    @Override
    public void credit(String accountId, double amount) {

    }

    @Override
    public void debit(String accountId, double amount) {

    }

    @Override
    public void transfer(String accountSource, String accountDestination, double amount) {

    }
}
