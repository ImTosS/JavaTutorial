import models.Person;

class Main {

    public static void main(String... args)
    {
        Person person = new Person("Antonio","Aguirre","Rivera", 172, 70, 35);

        person.giveMeYourFullName();
        person.giveMeYourName();
        person.giveMeYourLastName();
        person.giveMeYourMaidenName();
        person.giveMeYourHeight();
        person.giveMeYourWeight();
        person.giveMeYourDepth();
        person.eating();
        person.speaking();

    }
}
