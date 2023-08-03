package Array_Programs;

public class Array_Palindrom_No {
    public static void main(String[] args) {
        int []a = {121, 345, 343, 769, 444};
        int n ;
        int p = 0;
        for (int i = 0; i < a.length; i++){

            int temp = a[i];
            while (a[i] != 0) {
                n = a[i] % 10;
                p = (p * 10) + n;
                a[i] = a[i] / 10;

            }
            if(temp == p){
                System.out.println("Palimdrom Number is :"+temp);
            }
            p = 0;
        }
    }
}
