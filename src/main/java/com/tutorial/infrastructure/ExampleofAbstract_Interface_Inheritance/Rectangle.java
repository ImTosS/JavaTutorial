package com.tutorial.infrastructure.ExampleofAbstract_Interface_Inheritance;

public class Rectangle extends Figures {

    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    protected double calculatePerimeter() {
        return (this.height * 2) + (this.base * 2);
    }

    @Override
    protected double calculateArea() {
        return (this.base * this.height);
    }

    @Override
    public void print() {
        System.out.println("Pintando un rectángulo de color " + super.getColour());
    }
}
