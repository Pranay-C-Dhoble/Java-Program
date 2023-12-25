package methods;
import java.util.*;
public class ConvertSquareOfAGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        Square(num);// calling Square() method
    }
    public static void Square(int num){// Square() method
        int square=num*num;// square of a number is the number multiplied by itself
        System.out.println("The square of "+num+" is "+square);
    }
}
