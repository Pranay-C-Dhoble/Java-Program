package methods;
import java.util.*;// importing all classes of java.util package
public class SumOfEvenNumberFrom2ToGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        Sum(num);// calling Sum() method
    }
    public static void Sum(int num){// Sum() method
        int sum=0;
        for(int i=2;i<=num;i=i+2){
            sum=sum+i;// sum of even numbers from 2 to num
        }
        System.out.println("The sum of even numbers from 2 to "+num+" is "+sum);
    }
}
