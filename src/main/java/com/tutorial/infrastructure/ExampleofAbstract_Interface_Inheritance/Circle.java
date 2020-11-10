package com.tutorial.infrastructure.ExampleofAbstract_Interface_Inheritance;

import static java.lang.Math.*;

public class Circle extends Figures{

    private double radius;
    private static double pi = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected double calculateArea() {
        return this.pi * pow(this.radius,2);
    }

    @Override
    protected double calculatePerimeter() {
        return this.pi * (this.radius * 2);
    }

    @Override
    public void print() {
        System.out.println("Pintando un círculo de color " + super.getColour());
    }
}
