package TypeCasting;
//What is Type Casting?
//Type casting is when you assign a value of one primitive data type to another type.

//In Java, there are two types of casting:
//Widening Casting (automatically) - converting a smaller type to a larger type size
//byte -> short -> char -> int -> long -> float -> double

//Narrowing Casting (manually) - converting a larger type to a smaller size type
//double -> float -> long -> int -> char -> short -> byte


//Widening Casting
//Widening casting is done automatically when passing a smaller size type to a larger size type:


//Narrowing Casting
//Narrowing casting must be done manually by placing the type in parentheses in front of the value:


//Example
//Widening Casting
//int myInt = 9;
//double myDouble = myInt; // Automatic casting: int to double
//System.out.println(myInt);      // Outputs 9
//System.out.println(myDouble);   // Outputs 9.0


//Example
//Narrowing Casting
//double myDouble = 9.78;
//int myInt = (int) myDouble; // Manual casting: double to int
//System.out.println(myDouble);   // Outputs 9.78
//System.out.println(myInt);      // Outputs 9


//Example
//Type Casting in Java
//public class MyClass {
//  public static void main(String[] args) {
//    int myInt = 9;
//    double myDouble = myInt; // Automatic casting: int to double
//    System.out.println(myInt);      // Outputs 9
//    System.out.println(myDouble);   // Outputs 9.0
//  }
//}


//Example
//Narrowing Casting
//public class MyClass {
//  public static void main(String[] args) {
//    double myDouble = 9.78;
//    int myInt = (int) myDouble; // Manual casting: double to int
//    System.out.println(myDouble);   // Outputs 9.78
//    System.out.println(myInt);      // Outputs 9
//  }
//}


public class TypeCastingInfo {
    public static void main(String[] args) {
        WideningCasting();
        NarrowingCasting();
    }
    public static void WideningCasting(){
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt+" myInt");      // Outputs 9
        System.out.println(myDouble+" myInt value is Assign to myDouble Variable"+"\n");   // Outputs 9.0
    }
    public static void NarrowingCasting(){
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Manual casting: double to int
        System.out.println(myDouble+" myDouble");   // Outputs 9.78
        System.out.println(myInt+" myDouble value is Assign to myInt Variable"+"\n");   // Outputs 9
    }
}
