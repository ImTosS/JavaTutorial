package com.tutorial.infrastructure.gateways;

import com.tutorial.domain.models.Credentials;

public class StripeGateway extends PaymentGateway{

    @Override
    public void executeCharge() {
        System.out.println("Cargo realizado con Stripe");
    }

    @Override
    protected void beforeAuthenticating() {
        System.out.println("Ejecutando antes de autenticar al usuario en Stripe");
    }

    @Override
    protected void afterAuthenticating() {
        //No specific implementation after authenticating user
    }

    @Override
    protected void afterSendingCredentials() {

    }
}
