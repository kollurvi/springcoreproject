package com.springcore.annotation.componentscan;

import com.springcore.tranction.Transaction;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan("com.springcore.tranction")
@Log4j2
@Component
public class ApacReport {

    @Autowired
    private Transaction transaction;

    public void getReport(){
        transaction.getTransaction();
    }

}
