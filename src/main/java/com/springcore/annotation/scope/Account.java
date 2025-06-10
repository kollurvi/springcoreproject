package com.springcore.annotation.scope;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Log4j2
@Scope("prototype")
@Component
public class Account {
    public Account(){
        log.info("######### Default Constructor #########");
    }
}
