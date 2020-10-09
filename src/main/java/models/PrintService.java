package models;

import interfaces.Printable;

public class PrintService {

    public void printSomething(Printable printable){
        printable.print();
    }
}
