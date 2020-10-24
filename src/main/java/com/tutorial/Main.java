package com.tutorial;

import com.tutorial.application.charge.ChargeService;
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

        Credentials credentials = new Credentials("oscar","secure-password");
        paymentGateway.setCredentials(credentials);

        ChargeService chargeService = new ChargeService();
        chargeService.charge(paymentGateway);
    }
}
