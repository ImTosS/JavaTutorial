import interfaces.Printable;
import models.*;

class Main {

    public static void main(String... args)
    {
//        Person person = new Customer("Antonio","Aguirre","Rivera", 172, 70, 35);
//        person.giveMeYourFullName();

//        Person person = new Customer("Antonio","Aguirre","Rivera", 172, 70, 35);

//        Athlete athlete = new Athlete();

//        House house = new House();
//        house.welcome(person);


        StripeGateway stripeGateway = new StripeGateway();

//        Credentials credentials = new Credentials("oscar","secure-password");
//        paymentGateway.setCredentials(credentials);

        ChargeService chargeService = new ChargeService();
        chargeService.charge(stripeGateway);

        NotificationService notificationService = new NotificationService();
        notificationService.notificate(stripeGateway);

        PrintService printService = new PrintService();
        printService.printSomething(stripeGateway);
    }
}
