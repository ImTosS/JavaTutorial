package models;

public class Person {

    protected String name;
    final private String lastName;
    private String maidenName;
    private int height;
    private int weight;
    private int depth;

    public Person(String name, String lastName, String maidenName, int height, int weight, int depth){
        this.name = name;
        this.lastName = lastName;
        this.maidenName = maidenName;
        this.height = height;
        this.weight = weight;
        this.depth = depth;
    }

    public void giveMeYourFullName(){
        System.out.println("Mi nombre es: " + this.name + " " + this.lastName);
    }

    public void giveMeYourName(){ System.out.println("Su nombre es: " + this.name); }

    public void giveMeYourLastName(){ System.out.println("Su apellido paterno es: " + this.lastName); }

    public void giveMeYourMaidenName(){ System.out.println("Su apellido materno es: " + this.maidenName); }

    public void giveMeYourHeight(){ System.out.println("Su altura es: " + this.height + " cm."); }

    public void giveMeYourWeight(){ System.out.println("Su peso es: " + this.weight + " Kg."); }

    public void giveMeYourDepth(){ System.out.println("Su profundidad que tiene es de: " + this.depth + " cm."); }

    public void eating(){
        System.out.println( this.name + " está comiendo.");
    }

    public void speaking(){
        System.out.println( this.name + " está hablando.");
    }

    public String getName(){
        return this.name;
    }
}
