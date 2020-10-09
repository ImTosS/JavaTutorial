package models;

public class ConektaGateway extends PaymentGateway{

    @Override
    public void executeCharge(){
        System.out.println("Cargo realizado con Conekta!");
    }

    @Override
    public void sendNotification() {
        System.out.println("Notificacion enviada con Conekta");
    }

    @Override
    public void print() {
        System.out.println("Imprimir desde Paypal");
    }
}
