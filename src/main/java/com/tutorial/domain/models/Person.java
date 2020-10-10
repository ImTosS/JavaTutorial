package com.tutorial.domain.models;

/**
 * The type Person.
 */
public class Person {

    /**
     * The Name.
     */
    protected String name;
    /**
     * The Last name.
     */
    protected String lastName;
    /**
     * The Maiden name.
     */
    protected String maidenName;
    /**
     * The Height.
     */
    protected int height;
    /**
     * The Weight.
     */
    protected int weight;
    /**
     * The Depth.
     */
    protected int depth;

    /**
     * Instantiates a new Person.
     */
    public Person() {
    }

    /**
     * Instantiates a new Person.
     *
     * @param name       the name
     * @param lastName   the last name
     * @param maidenName the maiden name
     * @param height     the height
     * @param weight     the weight
     * @param depth      the depth
     */
    public Person(String name, String lastName, String maidenName, int height, int weight, int depth){
        this.name = name;
        this.lastName = lastName;
        this.maidenName = maidenName;
        this.height = height;
        this.weight = weight;
        this.depth = depth;
    }

    /**
     * Give me your full name.
     */
    public void giveMeYourFullName(){
        System.out.println("Mi nombre es: " + this.name + " " + this.lastName);
    }

    /**
     * Give me your name.
     */
    protected void giveMeYourName(){ System.out.println("Su nombre es: " + this.name); }

    /**
     * Give me your last name.
     */
    protected void giveMeYourLastName(){ System.out.println("Su apellido paterno es: " + this.lastName); }

    /**
     * Give me your maiden name.
     */
    protected void giveMeYourMaidenName(){ System.out.println("Su apellido materno es: " + this.maidenName); }

    /**
     * Give me your height.
     */
    protected void giveMeYourHeight(){ System.out.println("Su altura es: " + this.height + " cm."); }

    /**
     * Give me your weight.
     */
    protected void giveMeYourWeight(){ System.out.println("Su peso es: " + this.weight + " Kg."); }

    /**
     * Give me your depth.
     */
    protected void giveMeYourDepth(){ System.out.println("Su profundidad que tiene es de: " + this.depth + " cm."); }

    /**
     * Eating.
     */
    protected void eating(){
        System.out.println( this.name + " está comiendo.");
    }

    /**
     * Speaking.
     */
    protected void speaking(){
        System.out.println( this.name + " está hablando.");
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Salute.
     */
    public void salute(){
        System.out.println("Soy persona y mi nombre es: " + this.name + " " + this.lastName);
    }
}
