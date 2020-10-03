package models;

public class ProcessCharge {

    public void charge(PaymentGateway paymentGateway){
        paymentGateway.executeCharge();
    }
}
