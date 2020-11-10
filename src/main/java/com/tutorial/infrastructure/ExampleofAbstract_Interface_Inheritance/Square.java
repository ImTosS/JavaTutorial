package com.tutorial.infrastructure.ExampleofAbstract_Interface_Inheritance;

public class Square extends Figures {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    protected double calculatePerimeter() {
        return this.side * 4;
    }

    @Override
    protected double calculateArea() { return Math.pow(this.side, 2); }

    @Override
    public void print() {
        System.out.println("Pintando un Cuadrado de color " + super.getColour());
    }

}
