package Methods;
import java.util.Scanner;// importing Scanner class
public class TakeInputUsingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// creating object of Scanner class
        System.out.print("Enter the value of a = ");
        int a = sc.nextInt();// taking input from user
        System.out.print("Enter the value of b = ");
        int b = sc.nextInt();// taking input from user
        sum(a,b);// calling sum() method
    }
    public static void sum(int a, int b){// method to find sum of two numbers
        int sum = a+b;
        System.out.println("The sum of "+a+" and "+b+" is "+sum);
    }
}
