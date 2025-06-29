package com.springcore.annotation.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Log4j2
@Component
public class HelloWorld {
    private String message;

    public void getLogMessage() {
        log.info("Hello World! Message: {}", message);
    }
}
