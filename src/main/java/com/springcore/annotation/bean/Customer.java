package com.springcore.annotation.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Log4j2
@Component
public class Customer {
    private long customerId;
    private String customerName;

    public Customer() {
        log.info("Customer object created");
    }
}
