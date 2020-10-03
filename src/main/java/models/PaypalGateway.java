package models;

public class PaypalGateway extends PaymentGateway{

    @Override
    public void executeCharge(){
        System.out.println("Se ha realizado el cargo con Paypal!");
    }
}
