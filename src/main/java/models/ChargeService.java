package models;

import interfaces.Chargable;

public class ProcessCharge {

    public void charge(Chargable chargable){
        chargable.executeCharge();
    }
}
