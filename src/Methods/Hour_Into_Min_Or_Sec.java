package Methods;
import java.util.*;
public class Hour_Into_Min_Or_Sec {
    public static void main(String[] args) {
        System.out.println("Enter the hour : ");
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        hour_into_min(hour);
    }

    public static void hour_into_min(int hour){ // method
        int min = hour*60;
        System.out.println("The hour in minutes is : "+min);
        hour_into_sec(hour);
    }
    public static void hour_into_sec(int hour){
        int sec = hour*3600;
        System.out.println("The hour in seconds is : "+sec);
    }
}
