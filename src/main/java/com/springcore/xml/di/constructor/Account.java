package com.springcore.xml.di.constructor;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
public class Account {
    private long accountNo;
    private String accountType;
    private Customer customer;

    public void getAccountDetails(){
        customer.getCustomer();
        log.info("Account no:{} and account type:{}", accountNo, accountType);
    }
}
