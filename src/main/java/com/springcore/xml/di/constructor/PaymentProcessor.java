package com.springcore.xml.di.constructor;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PaymentProcessor {
    private PaymentService paymentService;

    public void processPayment(double amount) {
        paymentService.processPayment(amount);
    }
}
