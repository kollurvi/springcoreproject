package com.springcore.xml.di.constructor;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Qualifier;

@Log4j2
@AllArgsConstructor
public class CreditCardPaymentService implements PaymentService{
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;

    @Override
    @Qualifier
    public void processPayment(double amount) {
        log.info("Processing credit card payment of amount: {} for card holder: {} with card number: {} and expiry date: {}",
            amount, cardHolderName, cardNumber, expiryDate);
    }
}
