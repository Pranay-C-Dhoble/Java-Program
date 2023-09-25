package OopsConcept;

//Java is completely object oriented programming language?
//No, Java is not completely object oriented programming language.
//Why? Because it supports primitive data types such as int, byte, short, long, etc.
//These are not objects.
//To support oops concept, java provides wrapper classes to move primitives to objects.
//eg: int to Integer, float to Float, etc.

//wrapper classes are immutable.
//why? because they don't have setter methods to change their values.
//What is wrapper class?
//A wrapper class is a class whose object wraps or contains primitive data types.
//When we create an object to a wrapper class, it contains a field and in this field, we can store primitive data types.
//In other words, we can wrap a primitive value into a wrapper class object.
//Need of wrapper class: They convert primitive data types into objects.
//They are needed because collection classes like ArrayList, LinkedList, etc. can only store objects.
//So, the wrapper classes convert primitive data types into objects.


//But, there are some limitations of java that are given below:
//1. No multiple inheritance: To reduce the complexity and simplify the language, multiple inheritance is not supported in java.
//2. No operator overloading: To simplify the language, operator overloading is not supported in java. //What is operator overloading? //Operator overloading is a compile-time polymorphism in which the operator is overloaded to provide the special meaning to the user-defined data type.
//3. No preprocessor: In java, we don't have to use preprocessor. //what is preprocessor? //preprocessor is a program that processes its input data to produce output that is used as input to another program.
//4. No pointers: To make java memory safe, pointers are restricted in java.
//5. No destructor: To reduce the complexity of the language, java does not support destructor.
//6. No goto: Java does not support goto to reduce the complexity and confusion.
//7. No structures or unions: To simplify the language, java does not support structures and unions.



//What is Procedural Programming?
//in simple words, procedural programming is a programming style in which we divide a program into functions.
//It is also known as inline programming.
//Divide a program into small parts called functions eg: main(), printf(), scanf(), etc.
//Procedural programming is a programming paradigm, derived from structured programming, based on the concept of the procedure call.
//Procedures, also known as routines, subroutines, or functions, simply contain a series of computational steps to be carried out.
//Any given procedure might be called at any point during a program's execution, including by other procedures or itself.
//eg: C, Pascal, Fortran, etc. are all procedural programming languages.



//Why we need Oops?
//1. For security: Using data hiding and abstraction mechanism, we can protect our data from the outside world.
//2. For modularity: We can separate the program into different modules. Each module can be designed, developed, and tested independently.
//3. For memory management: We don't have to use delete keyword in java. Java has an automatic garbage collector.
//4. For code reusability: We can reuse the members of parent class. So, we don't have to write the same code again and again.
//5. For flexibility: We can make the changes easily as per requirement.


//Oops --> Object Oriented Programming System
//eg: C++, Java, Python, etc. are all object oriented programming languages.

//Define Oops?
//Oops is a methodology to design a program using classes and objects.
//It simplifies the software development and maintenance by providing some concepts:
//1. Object
//2. Class
//3. Inheritance
//4. Polymorphism
//5. Abstraction
//6. Encapsulation


//Class: A class is a group of objects which have common properties. //common properties eg: name, age, color, etc.
//eg: parrot, crow, pigeon, sparrow are all objects of class bird.
//what is properties? //properties are the characteristics of an object. //eg: name, age, color, etc.
//It is a template or blueprint from which objects are created.
//It is a logical entity.
//It can't be physical.
//It is declared with the keyword class.
//It does not occupy any space in memory.
//It is a compile-time entity.
//It may contain abstract methods, concrete methods, constructors, and properties.

//Object: An object is a real-world entity.
//It is a runtime entity.
//It is an instance of a class.
//It is a physical entity.
//It is a basic unit of OOPs.
//It has state and behavior.
//Object is an instance of a class.
//eg: parrot, crow, pigeon, sparrow are all objects of class bird.
//eg: pen, pencil, chair, table are all objects of class stationary.

//When we create a class, we create a new type of data, allowing us to create new objects of that type.
//When we create an object, we create an instance of a class, thereby creating a new instance of that type of object.
//eg: class - car, object - BMW, Audi, Mercedes, etc.

//what is instance?
//An instance is a single and unique unit of a class.
//An instance is also known as an object of a class.

//What is instance variable?
//A variable which is created inside the class but outside the method is known as an instance variable.
//It is not declared as static.
//It is called an instance variable because its value is instance specific and is not shared among instances.
//It's not recommended to create an instance variable in a class. //Why? 
//It is better to create it inside the method.


//syntax to create instance variable: access_modifier data_type variable_name;
//eg: public int age;
//Instance variable is created to store the state of an object.

// class name sc = new class name();
//here sc is an object of class name.
//and sc stores the state of class name. //state eg: name, age, color, etc.


//Instance variable in Java is used by Objects to store their states. //states eg: name, age, color, etc.
//Instance variables are declared in a class, but outside a method, constructor or any block.
//Instance variables are created when an object is created with the use of the keyword 'new' and destroyed when the object is destroyed.



//Encapsulation is a process of wrapping code and data together into a single unit.
//It is a way to achieve data hiding in Java
//because other class will not be able to access the data through the private data members.
//types of modifiers: public, private, protected, default
//real life example of encapsulation: capsule, ATM machine, etc.




//Inheritance is a mechanism in which one class acquires the property of another class.
//For example, a child inherits the traits of his/her parents.
//types of inheritance: single, multilevel, hierarchical, multiple, hybrid

//****** java not support multiple inheritance. but we can achieve it by using interface.******
// multiple inheritance having 2 or more parent classes and one child class.
//Diamond problem: If there is any ambiguity due to multiple inheritance, it is known as diamond problem.

//real life example of inheritance: father and son, mother and daughter, etc.
//Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object.
//IS-A relationship: It is also known as a parent-child relationship.
//It is a relationship between two classes.

//hybrid inheritance: It is a combination of single, multilevel, hierarchical, and multiple inheritance.

// ****** parent class is also known as super class or base class.******
// ****** child class is also known as sub class or derived class.******

//vehicle is a parent class.
//car, bike, bus, truck are all child classes of vehicle class.
//properties of vehicle class: color, name, model, etc.
//properties of car class: number of seats, number of doors, number of gears, etc.


//Polymorphism is the ability of an object to take on many forms.
//eg: Mobile phone, we can use it as a camera, calculator, etc.
//in other words, one object has many forms or has one name with multiple functionalities.
//The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.
//Any Java object that can pass more than one IS-A test is considered to be polymorphic.

//Static Binding and Dynamic Binding
//Compile time polymorphism: *** method overloading
//Runtime polymorphism: *** method overriding

//method overriding rules:
//1. method name must be same.
//2. method arguments must be same.
//3. method return type must be same.
//4. method access modifier must be same or higher.
//5. method must not be static.
//6. method must not be final.
//7. method must not be private.
//8. method must not be constructor.




//Abstraction is a process of hiding the implementation details and showing only functionality to the user.
//Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where you type the text and send the message.
//You don't know the internal processing about the message delivery.
//Abstraction lets you focus on what the object does instead of how it does it.
//Ways to achieve abstraction: abstract class and interface.
// **** real life example of abstraction: ATM machine, etc.
//abstract class: A class which is declared with the abstract keyword is known as an abstract class in Java.
//fully abstraction: If we declare all the methods of a class as abstract except the main() method, it is known as fully abstraction in java.
//partial abstraction: If we declare some methods of a class as abstract, it is known as partial abstraction in java.



public class OopsInformation {
    static int count = 0;
    public static void main(String[] args) {
        count = 10;
    }
}

//ADT --> Abstract Data Type


//Define Static ?
//Static is a keyword in java.
//Static is a non-access modifier in java.
//Static variable is stored in meta space.
//what is meta space? //Meta space is a part of heap memory.
//Static variable is stored in method area.
//Static variable is stored in class area.
// it is Accessible by class name. eg: OopsInformation.count

