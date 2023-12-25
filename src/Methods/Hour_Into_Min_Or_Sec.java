package methods;
import java.util.*;
public class Hour_Into_Min_Or_Sec {
    public static void main(String[] args) {
        System.out.print("Enter the hour : ");
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        hourIntoMin(hour);
        hourIntoSec(hour);
    }

    public static void hourIntoMin(int hour){ // method
        int min = hour*60;
        System.out.println("The hour in minutes is : "+min);
    }
    public static void hourIntoSec(int hour){
        int sec = hour*3600;
        System.out.println("The hour in seconds is : "+sec);
    }
}
