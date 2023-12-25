package basic_java_assignment;
import java.util.*;
public class Armstrong{
    public static void main(String []a){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number ");
        int val = sc.nextInt();
        int count = 0;
        int temp = val;
        int E = val;
        int i = 0;
        int n = 1;
        int cub;
        int p = 0;
        while(val != 0)
        {
            val = val /10;
            count++;
        }
        System.out.println("Total count is "+count);
        while(temp !=0)
        {
            cub = temp % 10;
            while(i < count)
            {
                n = n * cub;
                i++;
            }
            System.out.println("Digit "+n);
            p = p + n;
            n = 1;
            i = 0;
            temp = temp / 10;
        }
        System.out.println("Armstrong Number is "+p);
        if( E == p)
        {
            System.out.println("Given number is Armstrong Number "+p);
        }
        else
        {
            System.out.println("Given Number is Not an Armstrong Number "+p);
        }
    }
}