package com.example.demo2;

import com.example.demo2.model.BankAccount;
import com.example.demo2.model.CurrentAccount;
import com.example.demo2.model.SavingAccount;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) throws JsonProcessingException {

        Map<String, BankAccount> comptMap = new HashMap<>();

        comptMap.put("cc1", new CurrentAccount("DA", 37000, 4000));
        comptMap.put("cc2", new CurrentAccount( "EU",25000, 3000));
        comptMap.put("cc3", new CurrentAccount("RS",72000, 2500));
        comptMap.put("cc4", new CurrentAccount("DK",32000,5000));

        comptMap.put("cc5", new SavingAccount("DA", 85000, 3.4));
        comptMap.put("cc6", new SavingAccount( "EU",125000, 3.2));
        comptMap.put("cc7", new SavingAccount("RS",135200, 3.3));
        comptMap.put("cc8", new SavingAccount("DK",95000,3.1));

        for (String key: comptMap.keySet()){
            System.out.println(comptMap.get(key));

        }

        System.out.println("=================================");

        for (BankAccount c: comptMap.values()){
            System.out.println(toJson(c));
        }


    }

    public static String toJson(Object o) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(o);
    }

}


