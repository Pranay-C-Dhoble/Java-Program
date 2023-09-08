package Basic_Java_Assignment;
import java.util.*;
public class BoxArea {
    int length;
    int breadth;
    int height;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the box: ");
        int length = sc.nextInt();
        System.out.print("Enter the breadth of the box: ");
        int breadth = sc.nextInt();
        System.out.print("Enter the height of the box: ");
        int height = sc.nextInt();
        
        BoxArea obj = new BoxArea();
        int result = obj.area(length, breadth, height);
        System.out.println("Area of the box is: " + result);
    }
    private int area(int l, int b, int h){
        int result = l * b * h;
        return result;
    }
}
