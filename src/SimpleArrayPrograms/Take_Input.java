package SimpleArrayPrograms;
import java.util.*;
public class Take_Input {
    public static void main(String[] args) {
        int [] array = takeInput();
           System.out.print("the array output are : ");
           for(int j : array){
               System.out.print(j +" ");
           }
    }

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = sc.nextInt();
        System.out.print("Enter Elements in Array : ");
        int [] array = new int[n]; //array is a object of array class
           for (int i= 0;i<n;i++) {
               array[i] = sc.nextInt();
           }
        return array;
    }
}
