package SimpleArrayPrograms;
import java.util.*;
public class Search_Element {
    public static void main(String[] args) {
        int []a = {20,50,70,80,40,20,4,60,3,8,5,10,9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Find Number : ");
        int val = sc.nextInt();
        boolean present = false;

        for(int i = 0; i < a.length; i++){
            if(val == a[i]){
                present = true;
                System.out.println("Given Element is Present in Array and its Index Number is  :"+ i);
            }
        }
        if(!present){
            System.out.println("Given Element is Absent in Array ");
        }
    }
}