package basic_java_assignment;

public class SwapingWithoutTemp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swaping: a = " + a + " b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swaping: a = " + a + " b = " + b);
    }
}
