package com.tutorial.infrastructure.gateways;

import com.tutorial.domain.models.Credentials;

public class OpenPayGateway extends PaymentGateway{

    @Override
    public void executeCharge() {
        System.out.println("Se ha realizado el cargo con OpenPay!");
    }

    @Override
    protected void beforeAuthenticating() {
        System.out.println("Ejecutando antes de autenticar al usuario en OpenPay");
    }

    @Override
    protected void afterAuthenticating() {

    }

    @Override
    protected void afterSendingCredentials() {

    }
}
