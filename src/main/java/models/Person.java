package models;

/**
 * The type Person.
 */
public class Person {

    /**
     * The Name.
     */
    protected String name;
    final private String lastName;
    private String maidenName;
    private int height;
    private int weight;
    private int depth;

    /**
     * Instantiates a new Person.
     *
     * @param name       the name
     * @param lastName   the last name
     * @param maidenName the maiden name
     * @param height     the height
     * @param weight     the weight
     * @param depth      the depth
     */
    public Person(String name, String lastName, String maidenName, int height, int weight, int depth){
        this.name = name;
        this.lastName = lastName;
        this.maidenName = maidenName;
        this.height = height;
        this.weight = weight;
        this.depth = depth;
    }

    /**
     * Give me your full name.
     */
    public void giveMeYourFullName(){
        System.out.println("Mi nombre es: " + this.name + " " + this.lastName);
    }

    /**
     * Give me your name.
     */
    public void giveMeYourName(){ System.out.println("Su nombre es: " + this.name); }

    /**
     * Give me your last name.
     */
    public void giveMeYourLastName(){ System.out.println("Su apellido paterno es: " + this.lastName); }

    /**
     * Give me your maiden name.
     */
    public void giveMeYourMaidenName(){ System.out.println("Su apellido materno es: " + this.maidenName); }

    /**
     * Give me your height.
     */
    public void giveMeYourHeight(){ System.out.println("Su altura es: " + this.height + " cm."); }

    /**
     * Give me your weight.
     */
    public void giveMeYourWeight(){ System.out.println("Su peso es: " + this.weight + " Kg."); }

    /**
     * Give me your depth.
     */
    public void giveMeYourDepth(){ System.out.println("Su profundidad que tiene es de: " + this.depth + " cm."); }

    /**
     * Eating.
     */
    public void eating(){
        System.out.println( this.name + " está comiendo.");
    }

    /**
     * Speaking.
     */
    public void speaking(){
        System.out.println( this.name + " está hablando.");
    }

    /**
     * Get name string.
     *
     * @return the string
     */
    public String getName(){
        return this.name;
    }
}
