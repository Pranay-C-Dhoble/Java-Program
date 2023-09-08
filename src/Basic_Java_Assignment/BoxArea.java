package Basic_Java_Assignment;
import java.util.*;
public class BoxArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the box: ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of the box: ");
        int b = sc.nextInt();
        System.out.print("Enter the height of the box: ");
        int h = sc.nextInt();
        int result = area(l, b, h);
        System.out.println("Area of the box is: " + result);
    }
    public static int area(int l, int b, int h){
        int result = l * b * h;
        return result;
    }
}
