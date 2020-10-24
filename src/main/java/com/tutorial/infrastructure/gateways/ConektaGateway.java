package com.tutorial.infrastructure.gateways;

import com.tutorial.domain.models.Credentials;

public class ConektaGateway extends PaymentGateway{

    @Override
    public void executeCharge(){
        System.out.println("Cargo realizado con Conekta!");
    }

    @Override
    protected void beforeAuthenticating() {
        System.out.println("Ejecutando antes de autenticar al usuario en Conekta");
    }

    @Override
    protected void afterAuthenticating() {
        System.out.println("Codigo de CONEKTA");
    }

    @Override
    protected String afterSendingCredentials(String username) {
        return "Some String from Conekta for USERNAME::"+username;
    }
}
