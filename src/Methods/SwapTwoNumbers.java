package methods;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Swap(10,20);
    }
    public static void Swap(int a,int b){
        System.out.println("Before Swapping "+"a = "+a +" "+"b = "+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping "+"a = "+a+" b = "+b);
    }
}
