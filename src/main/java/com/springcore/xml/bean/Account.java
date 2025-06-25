package com.springcore.xml.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Getter
@Setter
public class Account {
    private long accountNumber;
    private String accountType;
    private String customerName;

    public Account(){
        log.info("######### Account Constructor Called #########");
    }


}
