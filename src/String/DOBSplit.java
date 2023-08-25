package String;
import java.util.Scanner;
public class DOBSplit {
    public static void main(String[] args) {
        String s = Dob();
        System.out.println(s);
    }
    static String Dob(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your DOB in dd/mm/yyyy format: ");
        String dob = sc.nextLine(); //nextLine() method is used to get the input as a string.
        //dob is a string variable that stores the date of birth in dd/mm/yyyy format.
        String [] arr = dob.split("/");
        //split() method splits the string based on the given regular expression or delimiter, and returns the tokens in the form of array.
        return "Date: " + arr[0] + "\nMonth: " + arr[1] + "\nYear: " + arr[2];
    }
}