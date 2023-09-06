package OopsConcept;

public class ConstructorsWindow {
    int length; //instance variables //global variables//default values are 0 //default values are assigned by JVM
    int breadth;
    int height;
    public ConstructorsWindow(){
        System.out.println("Default constructor");
    }
    public ConstructorsWindow(int l, int b){
        this();
        System.out.println("2 Parameterized constructor");
    }
    public ConstructorsWindow(int l, int b, int h){
        this(l, b);
        System.out.println("3 Parameterized constructor");
    }
    public static void main(String[] args) {
        ConstructorsWindow obj = new ConstructorsWindow(1, 2, 3); //Constructor Chaining
        //here obj is a reference variable
        //new is a keyword
        //ConstructorsWindow() is a constructor
        //ConstructorsWindow is a class name
        //1, 2, 3 are arguments
        //obj is an object
    }

}

// Output:
// Default constructor
// 2 Parameterized constructor
// 3 Parameterized constructor

//This is Constructor Chaining.
//Constructor Chaining is the process of calling one constructor from another constructor with respect to current object.
//Constructor Chaining can be done in 2 ways:
//1. Within same class: It can be done using this() keyword for constructors in same class
//2. From base class: by using super() keyword to call constructor from the base class.

//this keyword must be the first statement in constructor.
//super keyword must be the first statement in constructor.

