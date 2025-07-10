package com.springcore.xml.di.constructor;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
public class UpiCardPaymentService implements PaymentService{
    private String number;
    private String type;

    @Override
    public void processPayment(double amount) {
        log.info("Processing UPI Card Payment of amount: {} for number: {} and type: {}", amount, number, type);
    }
}
