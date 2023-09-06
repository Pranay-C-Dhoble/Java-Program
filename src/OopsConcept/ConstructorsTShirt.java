package OopsConcept;
//What is Constructor?
//Constructor is a block of code that initializes the newly created object.
//A constructor resembles an instance method in java but it’s not a method as it doesn’t have a return type.
public class ConstructorsTShirt {
    String color;
    String material;
    String design;
    String size;
    public ConstructorsTShirt(){
        System.out.println("Default constructor");
    }
    public ConstructorsTShirt(String c, String m){
        this();
        color = c;
        material = m;
        System.out.println("2 Parameterized constructor");
        System.out.println("Color: " + color + " Material: " + material);
    }
    public ConstructorsTShirt(String c, String m, String d){
        this(c, m);
        design = d;
        System.out.println("3 Parameterized constructor");
        System.out.println("Color: " + color + " Material: " + material + " Design: " + design );
    }
    public ConstructorsTShirt(String c, String m, String d, String s){
        this(c, m ,d);
        design = d;
        size = s;
        System.out.println("4 Parameterized constructor");
        System.out.println("Color: " + color + " Material: " + material + " Design: " + design + " Size: " + size);
    }
    public static void main(String[] args) {
        ConstructorsTShirt obj = new ConstructorsTShirt("Red", "Cotton", "Plain", "M");
        //here obj is a reference variable
        //reference variable is a variable that refers to the object
        //reference variable is a variable that stores the address of the object
        //reference variable is a variable that stores the hashcode of the object
        //reference variable is stored in heap memory.
    }
}
