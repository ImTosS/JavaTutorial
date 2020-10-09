package models;

import interfaces.Chargable;
import interfaces.Notificable;
import interfaces.Printable;

public abstract class PaymentGateway implements Chargable, Notificable, Printable {

    @Override
    public void executeCharge() {

    }

    @Override
    public void sendNotification() {

    }

    @Override
    public void print() {

    }

    @Override
    public void hello() {

    }
}
