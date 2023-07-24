package com.example.demo2.exceptions;

public class AccountNotFoundException extends Exception{
    public AccountNotFoundException(String message){
        super(message);
    }

}
