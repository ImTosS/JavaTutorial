package com.tutorial;

import com.tutorial.infrastructure.ExampleofAbstract_Interface_Inheritance.*;

class Main {

    public static void main(String... args)
    {
//        Person person = new Customer("Antonio","Aguirre","Rivera", 172, 70, 35);
//        person.giveMeYourFullName();

//        Person person = new Customer("Antonio","Aguirre","Rivera", 172, 70, 35);

//        Athlete athlete = new Athlete();

//        House house = new House();
//        house.welcome(person);

        /*
        PaymentGateway paymentGateway = new OpenPayGateway();

        Credentials credentials = new Credentials(" ", " ");

        try{
            paymentGateway.setCredentials(credentials);
        }catch(InvalidCredentialsException invalidCredentialsException){
            System.out.println(invalidCredentialsException.getMessage());
        }

        ChargeService chargeService = new ChargeService();
        chargeService.charge(paymentGateway);
        */

        // Testing..
        //Person person = new Athlete("Antonio","Aguirre","Rivera", 172, 70, 35);
        //person.salute();

        //TODO::ADD EXAMPLE FOR ABSTRACT CLASSES
        //TODO::ADD EXAMPLE FOR INTERFACE CLASSES
        //TODO::ADD EXAMPLE FOR INHERITANCE CLASSES


        // In case of rectangle figure, asume sideA and sideB are a pair of equals sides
        Figures circle = new Circle(6,10, "verde");
        circle.infoFigure();

        //Circle circle = new Circle(3,6);
        //circle.infoCircle();

    }
}
