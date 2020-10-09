package models;

public class StripeGateway extends PaymentGateway{

    @Override
    public void executeCharge() {
        System.out.println("Cargo realizado con Stripe");
    }

    @Override
    public void sendNotification() {
        System.out.println("Notificacion enviada con Stripe");
    }

    @Override
    public void print() {
        System.out.println("Imprimir desde Stripe");
    }
}
