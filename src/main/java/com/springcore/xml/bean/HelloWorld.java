package com.springcore.xml.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Getter
@Setter
@Log4j2
public class HelloWorld {
    private String message;

    public HelloWorld() {
        log.info("######### HelloWorld Constructor Called #########");
    }
}
