package models;

public class Dog extends Animal{

    //Constructor vacio
    //El constructor vacio de Doc, apunta al constructor vacio de Animal

    public Dog(String name) {
        //Aqui Java sabe que el constructor de Dog apunta al constructor de Animal
        super(name);
    }
}
