package OopsConcept;

//What is Constructor?
//Constructor is a block of code that initializes the newly created object.
//A constructor resembles an instance method in java but it’s not a method as it doesn’t have a return type.

//1> to create an object of a class.
//2> Initialize properties of an (class) object.

//In short constructor and method are different.
//Constructor name must be the same as its class name.
//A Constructor must have no explicit return type.
//A Java constructor cannot be abstract, static, final, and synchronized.
//A constructor can have access modifiers or can be without access modifiers (default).
//A constructor is only called once while a method can be called multiple times.
//A constructor does not have a return type; not even void but a method has a return type.
//The constructor is called implicitly whereas the method is called explicitly.
//implicitly means automatically and explicitly means manually.
//The purpose of the constructor is to initialize the object of a class while the purpose of the method is to perform a task by executing java code


//Constructor overloading is a technique in Java in which a class can have any number of constructors that differ in parameter lists.


public class Constructors {
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj2 = new Student(1, "Rahul", 18);
        System.out.println(obj2.getId() + " " + obj2.getName()+ " " + obj2.getAge());
        System.out.println(obj.getId() + " " + obj.getName()+ " " + obj.getAge());
    }
}

class Student{
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Student(){//default constructor or No-Arg Constructor
        id = 1;
        name = "Default";
        age = 18;
        System.out.println("Default constructor");
    }
    public Student(int i, String n, int a){ //parameterized constructor
                                            // here Student is a constructor
                                            // why ?
                                            // because it has the same name as its class name.
        id = i;
        name = n;
        age = a;
        System.out.println("Parameterized constructor");
    }
}


//there are 2 types of constructors:
//1. Default constructor
//2. Parameterized constructor


//Why Constructor is not final?
//Constructor is not final because it can't be inherited.
//Constructor is not static because static keyword is used to allocate memory for static variables.


//which class in java is final?
//String class is final in java.
//String class is immutable in java.

//can we use final keyword with main method?
//yes, we can use final keyword with main method.

//Constructor Chainig?
//Constructor chaining is the process of calling one constructor from another constructor with respect to current object.
//Constructor chaining can be done in two ways:
//1. Within same class: It can be done using this() keyword for constructors in same class
//2. From base class: by using super() keyword to call constructor from the base class.--->super() must be the first statement in constructor.

//this keyword must be the first statement in constructor.
//super keyword must be the first statement in constructor.


//**********************************************************************************//

// A(int age){ <----|
// }                |
// A(){             |
// this(10);  >-----|
// }

//***********************************************************************************//