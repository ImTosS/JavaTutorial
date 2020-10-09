package models;

public class OpenPayGateway extends PaymentGateway{

    @Override
    public void executeCharge() {
        System.out.println("Se ha realizado el cargo con OpenPay!");
    }

    @Override
    public void sendNotification() {
        System.out.println("Notificacion enviada con Open Pay");
    }

    @Override
    public void print() {
        System.out.println("Imprimir desde Open Pay");
    }
}
