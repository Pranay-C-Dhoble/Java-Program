package Methods;
import java.util.Random;// importing Random class
public class SumOfEvenNumberRandomClass {
    public static void main(String[] args) {
        Random rand = new Random();// creating object of Random class
        int num = 10+ rand.nextInt(20);// generating random number from 10 to 30
        System.out.println("The random number is : "+num);
        evenSum(num);// calling evenSum() method
    }
    public static void evenSum(int num){
        int sum=0;
        for(int i=2;i<=num;i=i+2){
            sum=sum+i;
        }
        System.out.println("The sum of even numbers from 2 to "+num+" is "+sum);
    }
}
