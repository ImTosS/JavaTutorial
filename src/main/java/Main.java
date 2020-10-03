import models.*;

import javax.swing.*;
import java.text.CollationKey;

class Main {

    public static void main(String... args)
    {
//        Person person = new Customer("Antonio","Aguirre","Rivera", 172, 70, 35);
//        person.giveMeYourFullName();


//        Person person = new Customer("Antonio","Aguirre","Rivera", 172, 70, 35);

//        Athlete athlete = new Athlete();

//        House house = new House();
//        house.welcome(person);
        PaymentGateway paymentGateway = new PaypalGateway();

        ProcessCharge processCharge = new ProcessCharge();
        processCharge.charge(paymentGateway);
    }
}
