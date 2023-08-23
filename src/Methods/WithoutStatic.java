package Methods;

public class WithoutStatic {
    public static void main(String[] args) {
        int num = 5;
        //Method Invocation using object creation.
        WithoutStatic obj = new WithoutStatic();// Creating an object of the class.
        int result = obj.Square(num);// Calling the method.
        System.out.println(result);
    }
    int Square(int num){// Without static keyword, we can't call this method in main method.
        //static shows that the method belongs to the class, not an object.
        //Without creating an object, we can't call this method in main method.
        //because main method is static.

        //what is mean by static?
        //static means that the method belongs to the class and not an object of the class.
        return num * num;
    }
}
