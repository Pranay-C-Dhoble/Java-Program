package methods;

// Method Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
// When a method in a subclass has the same name, same parameters or signature and same return type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class.
// Method overriding is one of the ways in which Java supports Runtime Polymorphism.

// Rules for method overriding:
// 1. The method must have the same name as in the parent class
// 2. The method must have the same parameter as in the parent class.
// 3. There must be an IS-A relationship (inheritance).
// 4. The return type must be the same or a subtype of the return type declared in the parent class method.

// Why we use method overriding?
// 1. To provide specific implementation of a method that is already provided by its super class.
// 2. To provide the specific implementation of a method that is already provided by its parent class.
// 3. Method overriding is used for runtime polymorphism.
// 4. Method overriding is used to provide the specific implementation of a method which is already provided by its super class.
public class MethodOverriding {
    public static void main(String[] args) {
        Parent p ;
        p = new Child1();
        System.out.println(p.Mult(5, 6));
        p = new Child2();
        System.out.println(p.Mult(5, 6));
        p = new Parent();
        System.out.println(p.Mult(5, 6));
    }
}
class Parent{
    public int Mult(int a, int b){
        return a * b;

    }
}
class Child1 extends Parent{
    public int Mult(int a, int b){
        return a * b;
    }
}
class Child2 extends Parent{
    public int Mult(int a, int b){
        return a * b;
    }
}




