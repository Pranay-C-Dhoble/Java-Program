package Basic_Java_Assignment;
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int val = sc.nextInt();
        int i = 2;
        boolean p = true;
        while (i < val){
            if(val % i == 0){
                p = false;
                break;
            }
            i++;
        }
        if(p){
            System.out.println("Given Number is Prime Number: "+val);
        }
        else{
            System.out.println("Given Number is not a Prime Number :"+val);
        }
    }
}