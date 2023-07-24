package com.example.demo2;

import com.example.demo2.business.BankAccountService;
import com.example.demo2.business.BankAccountServiceImpl;
import com.example.demo2.utils.DataTransformationUtils;

public class App3 {
    public static void main(String[] args) {
        BankAccountService bankAccountService = new BankAccountServiceImpl();
        bankAccountService.addRandomData(20);
        //bankAccountService.getAllAccount().forEach(account -> System.out.println(DataTransformationUtils.toJson(account)));
        bankAccountService.getAllAccount()
                .stream()
                .map(DataTransformationUtils::toJson)
                .forEach(System.out::println);

    }
}
