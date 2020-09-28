package models;

public class Person {

    protected String name;
    final private String lastName;
    private String maidenName;
    private int height;
    private int width;
    private int depth;

    public Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
        //TODO::Asignar valores a atributos.
    }

    //TODO::Crear métodos para obtener los demás atributos.
    public void giveMeYourFullName(){
        System.out.println("Mi nombre es:" + this.name + " " + this.lastName);
    }

    public void eating(){
        System.out.println("Esta comiendo");
    }

    public void speaking(){
        System.out.println("Esta hablando");
    }

    public String getName(){
        return this.name;
    }
}
