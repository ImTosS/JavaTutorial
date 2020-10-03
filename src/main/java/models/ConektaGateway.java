package models;

public class ConektaGateway extends PaymentGateway{

    @Override
    public void executeCharge(){
        System.out.println("Cargo realizado con Conekta!");
    }
}
