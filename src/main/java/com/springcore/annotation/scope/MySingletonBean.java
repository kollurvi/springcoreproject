package com.springcore.annotation.scope;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class MySingletonBean {
    private int counter = 0;

    public void incrCounterAndGetValue() {
        counter++;
        log.info("Singleton Bean Counter value: {}", counter);
    }
}