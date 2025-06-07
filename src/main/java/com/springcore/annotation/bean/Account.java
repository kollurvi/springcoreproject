package com.springcore.annotation.bean;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;


@Log4j2
@Setter
@Component
public class Account {  // bean name - "account"
    private long accountNumber;
    private String accountName;

    public void getAccountDetails() {
        log.info("Account Number: {}, Account Name: {}", accountNumber, accountName);
    }
}
