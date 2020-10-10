package com.tutorial.infrastructure.gateways;

public class StripeGateway extends PaymentGateway{

    @Override
    public void executeCharge() {
        System.out.println("Cargo realizado con Stripe");
    }
}
