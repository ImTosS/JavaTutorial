package com.tutorial.infrastructure.gateways;

public class OpenPayGateway extends PaymentGateway{

    @Override
    public void executeCharge() {
        System.out.println("Se ha realizado el cargo con OpenPay!");
    }
}
