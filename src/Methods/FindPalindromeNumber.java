package methods;
import java.util.*;
public class FindPalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();//Palindromic number is a number that is same after reverse
        Palindrome(num);// calling Palindrome() method
    }
    public static void Palindrome(int num){
        int temp=num;
        int rev=0;// rev is reverse of num
        while(num!=0){
            int rem=num%10;// rem is remainder//num%10 gives last digit of num//eg: 123%10=3
            rev=rev*10+rem;// rev*10+rem gives reverse of num//eg: 0*10+3=3//eg: 3*10+2=32//eg: 32*10+1=321
            num=num/10;// num/10 gives num without last digit//eg: 123/10=12//eg: 12/10=1//eg: 1/10=0
        }
        if(temp==rev){
            System.out.println("The number is Palindrome");
        }
        else{
            System.out.println("The number is not Palindrome");
        }
    }
}
