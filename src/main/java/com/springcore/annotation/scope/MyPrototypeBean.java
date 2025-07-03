package com.springcore.annotation.scope;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Log4j2
@Scope("prototype") // This annotation indicates that a new instance of this bean will be created each time it is requested.
public class MyPrototypeBean {
    private int counter = 0;

    public void incrCounterAndGetValue() {
        counter++;
        log.info("Prototype Bean Counter value: {}", counter);
    }
}