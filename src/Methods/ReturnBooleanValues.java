package methods;
import java.util.Scanner;// importing Scanner class
public class ReturnBooleanValues {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9,10};// declaring and initializing array
        Scanner sc = new Scanner(System.in);// creating object of Scanner class
        System.out.print("Find Element in Array : ");
        int find = sc.nextInt();// taking input from user
        boolean pre = findElement(arr,find);// calling findElement() method
    }
    public static boolean findElement(int []arr,int find){// method to find element in array
        for(int i=0;i<arr.length;i++){
            if(arr[i]==find){
                System.out.println("Element "+find+" is present in array");
                return true;
            }
        }
        System.out.println("Element "+find+" is not present in array");
        return false;
    }
}
