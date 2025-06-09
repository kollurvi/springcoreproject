package com.springcore.annotation.di;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class Toyota implements Vehicle{
    @Override
    public void engine() {
        log.info("Toyota");
    }
}
