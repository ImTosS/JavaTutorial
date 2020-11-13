package com.tutorial.infrastructure.ExampleofAbstract_Interface_Inheritance;

public class Rectangle extends Figures {

    public static String hola;
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public static void printSomething(){
        System.out.println(Rectangle.class.getSimpleName());
    }

    public static void doSomething(){
        printSomething();
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
