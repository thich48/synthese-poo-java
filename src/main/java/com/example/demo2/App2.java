package com.example.demo2;

import com.example.demo2.business.BankAccountService;
import com.example.demo2.business.BankAccountServiceImpl;
import com.example.demo2.exceptions.AccountNotFoundException;
import com.example.demo2.model.BankAccount;
import com.example.demo2.model.CurrentAccount;
import com.example.demo2.model.SavingAccount;

import java.util.List;

public class App2 {
    public static void main(String[] args) {

        BankAccountService bankAccountService =new BankAccountServiceImpl();
        bankAccountService.addBankAccount(new CurrentAccount("EUR", 62000, 100 ));
        bankAccountService.addBankAccount(new SavingAccount("EUR", 15000, 3.5 ));

        BankAccount bankAccount3 = new CurrentAccount("EUR", 76000, 300 );
        bankAccount3.setAccountId("CC3");
        bankAccountService.addBankAccount(bankAccount3);



        List<BankAccount> allAccount = bankAccountService.getAllAccount();

       /* for (int i=0; i<allAccount.size(); i++){
            System.out.println(allAccount.get(i).toString());
        }*/

        /*for (BankAccount bankAccount:allAccount)
        {
            System.out.println(bankAccount.toString());
        }*/

     /*   allAccount.forEach(new Consumer<BankAccount>() {
            @Override
            public void accept(BankAccount bankAccount) {
                System.out.println(bankAccount.toString());
            }
        });*/

       //allAccount.forEach(account -> System.out.println(account.toString()));

       allAccount.forEach(System.out::println);

        System.out.println("----------------------------------");


        try {
            BankAccount accountByID= bankAccountService.getAccountBuID("CC9");
        } catch (AccountNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


        System.out.println("***********************");
        System.out.println("Suite du programme");



    }
}
