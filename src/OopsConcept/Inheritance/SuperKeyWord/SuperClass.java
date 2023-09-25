package OopsConcept.Inheritance.SuperKeyWord;
//Super keyword is used to refer to the immediate parent class instance variable.
//Super keyword is used to invoke the immediate parent class method.
//Super keyword is used to invoke the immediate parent class constructor.
//Super keyword is used to differentiate the members of superclass from the members of subclass, if they have same names.
//Super keyword is used to invoke the constructor of immediate parent class.
public class SuperClass {
    public static void main(String[] args) {
        ShoppingDiscount sd = new ShoppingDiscount();
        ShoppingDiscount sd1 = new ShoppingDiscount(10);
    }
}


//Advantages of hirerachical inheritance:
//1. Code reusability
//2. Method overriding
//3. Polymorphism
//4. Flexibility
//5. Less memory consumption