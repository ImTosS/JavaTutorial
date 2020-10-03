package models;

public class OpenPayGateway extends PaymentGateway{

    @Override
    public void executeCharge(){
        System.out.println("Se ha realizado el cargo con Open Pay!");
    }
}
