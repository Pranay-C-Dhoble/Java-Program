package String;
import java.util.*;
public class VowelsOfAString {
    public static void main(String[] args) {
        System.out.print("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                System.out.print(str.charAt(i)+" "+i);// charAt() method returns the character at the specified index in a string.
                System.out.println();
            }
        }
    }
}
