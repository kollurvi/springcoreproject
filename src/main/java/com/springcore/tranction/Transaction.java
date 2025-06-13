package com.springcore.tranction;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class Transaction {

    public void getTransaction(){
        log.info("##### Transaction #####");
    }
}
