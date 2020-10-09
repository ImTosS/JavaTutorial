package models;

import interfaces.Chargable;

public class ChargeService {

    public void charge(Chargable chargable){
        chargable.executeCharge();
    }
}
