package methods;

// Method Overloading
// Method Overloading is a feature that allows a class to have more than one method having the same name,
// if their argument lists are different.
// It is similar to constructor overloading in Java, that allows a class to have more than one constructor

// Method Overloading is a compile-time polymorphism.

//why we use method overloading?
//1. To achieve compile time polymorphism.
//2. To improve code readability.
//3. To achieve consistency in naming.
//4. To differentiate between similar methods having same name.
//5. To achieve flexibility in programming.


public class MethodOverloading {
    public static void main(String[] args) {  //static method can be called without creating an object.
        int a = add(5, 6);
        System.out.println(a);

        int b = add(5, 6, 7);// ----> Arguments
        System.out.println(b);

        double c = add(5.5, 6.6);
        System.out.println(c);
    }
    static int add(int a, int b){
        return a + b;
    } // ----> Parameters
    static int add(int a, int b, int c){
        return a + b + c;
    }
    static double add(double a, double b){
        return a + b;
    }
}
