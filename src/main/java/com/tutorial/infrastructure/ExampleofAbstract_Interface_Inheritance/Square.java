package com.tutorial.infrastructure.ExampleofAbstract_Interface_Inheritance;

public class Square extends QuadrilateralFigure{


    public Square(double sideA, double sideB, double sideC, double sideD) {
        super(sideA, sideB, sideC, sideD);
    }

    @Override
    protected double calculateArea() { return super.sideA * super.sideB; }

    @Override
    public void paintFigure() {
        System.out.println("Pintando un Cuadrado");
    }
}
