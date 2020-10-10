package com.tutorial.domain.models;

/**
 * The type Customer.
 */
public class Customer extends Person{

    /**
     * Instantiates a new Customer.
     */
    public Customer(){
        super();
    }

    /**
     * Instantiates a new Customer.
     *
     * @param name       the name
     * @param lastName   the last name
     * @param maidenName the maiden name
     * @param height     the height
     * @param weight     the weight
     * @param depth      the depth
     */
    public Customer(String name, String lastName, String maidenName, int height, int weight, int depth){
        super(name, lastName, maidenName, height, weight, depth);
    }

    @Override
    public void salute(){
        System.out.println("Soy CUSTOMER y mi nombre es: " + super.name + " " + super.lastName);
    }
}
