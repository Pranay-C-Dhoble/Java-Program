package OopsConcept;

public class CreateOurOwnJavaClass {
    public static void main(String[] args) {
        System.out.println("This is my first java class.");
        MyFirstJavaClass obj = new MyFirstJavaClass();

        //MyFirstJavaClass is a Constructor.
        //why ? because it has the same name as its class name.
        //Constructor is a block of code that initializes the newly created object.

        //new is a keyword that is used to create an object.
        //Dynamically allocating memory for an object at runtime.
        //here obj is an object of MyFirstJavaClass class.

        //why we need to create object?
        //because we can access the data members and methods of a class through an object.

        //obj is which type of variable?
        //obj is a reference variable.

        //what is the difference between object and reference variable?
        //object is an instance of a class. reference variable is used to refer the object.
        //reference variable stores the address of the object.

        obj.id = 1;
        obj.name = "Rahul";
        System.out.println("Id: " + obj.id + " Name: " + obj.name);
    }
}

class MyFirstJavaClass { //public class MyFirstJavaClass is not allowed.//Why ?//Because we can have only one public class in a java file.

    int id;// ----->Attributes or data members or instance variables
    String name; //-----> instance variables is im

    public static void Class(String[] args) {
        int a = 10;// ----->Local variable
        System.out.println(a);
        String name = "Rohan";// ----->Local variable
    }
}
