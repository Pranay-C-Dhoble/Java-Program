package Array_Programs;
public class Array_Simple {
    public static void main(String[] args) {
        int []a = {10,20,30,40,50};
        int sum = 0;
        for (int j : a) {
            sum = sum + j;
        }
        System.out.println("Sum of all Element is :"+sum);
    }
}
