package com.springcore.annotation.scope;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@Scope("prototype") // or "prototype", "request", "session", etc.)
public class Customer {
    private String name;
    private String email;

    public Customer() {
        log.info("####### Customer object created #######");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
>>>>>>> 795a7a6729ed606eedad25119a3f94ec8e7d1890
}
