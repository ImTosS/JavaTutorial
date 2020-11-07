package com.tutorial.infrastructure.ExampleofAbstract_Interface_Inheritance;

public abstract class Figures implements Paintable{

    protected String colour;

    final public void infoFigure(){
        this.paintFigure();
        System.out.println("El perímetro es: " + this.calculatePerimeter() + " unidades.");
        System.out.println("El área es: " +this.calculateArea() + " unidades cuadradas.");
    }

    abstract protected double calculateArea();

    abstract protected double calculatePerimeter();
}
