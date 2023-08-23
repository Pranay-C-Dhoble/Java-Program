package Methods;

// Method Overloading
// Method Overloading is a feature that allows a class to have more than one method having the same name,
// if their argument lists are different.
// It is similar to constructor overloading in Java, that allows a class to have more than one constructor

// Method Overloading is a compile-time polymorphism.


public class MethodOverloading {
    public static void main(String[] args) {
        int a = add(5, 6);
        System.out.println(a);

        int b = add(5, 6, 7);
        System.out.println(b);

        double c = add(5.5, 6.6);
        System.out.println(c);
    }
    static int add(int a, int b){
        return a + b;
    }
    static int add(int a, int b, int c){
        return a + b + c;
    }
    static double add(double a, double b){
        return a + b;
    }
}
