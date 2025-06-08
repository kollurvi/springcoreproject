package com.springcore.xml.di.setter;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Setter
public class Customer {
    private int customerId;
    private String customerName;

    public void getCustomer(){
        log.info("Customer Id;{} and customer name:{}", customerId, customerName);
    }
}
