package com.springcore.annotation.postconstrcuctandpresdestroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class DBConnection {
    @PostConstruct
    public void getConnection(){
        log.info("##### Connect to database #####");
    }

    @PreDestroy
    public void closeConnection(){
        log.info("######### Close DB connection ########");
    }
}
