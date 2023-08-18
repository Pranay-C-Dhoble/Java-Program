package Methods;
import java.util.*;
public class SumFrom1ToGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        Sum(num);// calling Sum() method
    }
    public static void Sum(int num){// Sum() method
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;// sum of numbers from 1 to num
        }
        System.out.println("The sum from 1 to "+num+" is "+sum);
    }
}
