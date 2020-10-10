package com.tutorial.domain.models;

public class Athlete extends Person{

    public Athlete(String name, String lastName, String maidenName, int height, int weight, int depth){
        super(name, lastName, maidenName, height, weight, depth);
    }

    @Override
    public void salute(){
        System.out.println("Soy ATLETA y mi nombre es: " + super.name + " " + super.lastName);
    }
}
