package com.tutorial;

import com.tutorial.application.charge.ChargeService;
import com.tutorial.domain.exceptions.InvalidCredentialsException;
import com.tutorial.domain.models.Credentials;
import com.tutorial.infrastructure.gateways.*;
import com.tutorial.infrastructure.notifications.EmailNotification;
import com.tutorial.infrastructure.notifications.Notificable;
import com.tutorial.infrastructure.printing.LocalPrinter;
import com.tutorial.infrastructure.printing.Printable;

class Main {

    public static void main(String... args)
    {
//        Person person = new Customer("Antonio","Aguirre","Rivera", 172, 70, 35);
//        person.giveMeYourFullName();

//        Person person = new Customer("Antonio","Aguirre","Rivera", 172, 70, 35);

//        Athlete athlete = new Athlete();

//        House house = new House();
//        house.welcome(person);


        PaymentGateway paymentGateway = new OpenPayGateway();

        Credentials credentials = new Credentials(" ", " ");

        try{
            paymentGateway.setCredentials(credentials);
        }catch(InvalidCredentialsException invalidCredentialsException){
            System.out.println(invalidCredentialsException.getMessage());
        }

        ChargeService chargeService = new ChargeService();
        chargeService.charge(paymentGateway);


        //TODO::ADD EXAMPLE FOR ABSTRACT CLASSES

        //TODO::ADD EXAMPLE FOR INTERFACE CLASSES

        //TODO::ADD EXAMPLE FOR INHERITANCE CLASSES


    }
}
