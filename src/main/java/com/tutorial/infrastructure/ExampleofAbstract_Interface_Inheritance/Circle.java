package com.tutorial.infrastructure.ExampleofAbstract_Interface_Inheritance;

import static java.lang.Math.*;

public class Circle extends Figures{

    private double radius;
    private double diameter;
    private static double pi = 3.14159;

    public Circle(double radius, double diameter, String colour) {
        this.radius = radius;
        this.diameter = diameter;
        super.colour = colour;
    }

    @Override
    protected double calculateArea() {
        return this.pi * pow(this.radius,2);
    }

    @Override
    protected double calculatePerimeter() {
        return this.pi * this.diameter;
    }

    @Override
    public void paintFigure() {
        System.out.println("Pintando un círculo de color " + super.colour);
    }
}
