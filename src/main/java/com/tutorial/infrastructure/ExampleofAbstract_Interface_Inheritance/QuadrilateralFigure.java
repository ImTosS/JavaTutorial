package com.tutorial.infrastructure.ExampleofAbstract_Interface_Inheritance;

public abstract class QuadrilateralFigure implements Paintable{

    protected double sideA;
    protected double sideB;
    protected double sideC;
    protected double sideD;


    protected QuadrilateralFigure(double sideA, double sideB, double sideC, double sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }


    final protected double perimeter(double sideA, double sideB, double sideC, double sideD){
        return sideA + sideB + sideC + sideD;
    }

    final public void infoFigure(){
        this.paintFigure();
        System.out.println("El perímetro es: " + this.perimeter(this.sideA, this.sideB, this.sideC, this.sideD) + " unidades.");
        System.out.println("El área es: " +this.calculateArea() + " unidades cuadradas.");
    }

    abstract protected double calculateArea();
}
