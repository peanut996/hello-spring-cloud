package com.example.hellospringcloud.spring;

import org.springframework.transaction.TransactionDefinition;

public class TransactionTest {
    void test(){
        int a =  TransactionDefinition.ISOLATION_DEFAULT;
    }
}
