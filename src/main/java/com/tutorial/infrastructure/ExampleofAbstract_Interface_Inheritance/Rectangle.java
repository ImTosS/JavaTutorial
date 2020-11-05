package com.tutorial.infrastructure.ExampleofAbstract_Interface_Inheritance;

public class Rectangle extends QuadrilateralFigure {


    public Rectangle(double sideA, double sideB, double sideC, double sideD) {
        super(sideA, sideB, sideC, sideD);
    }

    @Override
    protected double calculateArea() {
        return super.sideA * super.sideC;
    }

    @Override
    public void paintFigure() {
        System.out.println("Pintando un rectangulo");
    }
}
