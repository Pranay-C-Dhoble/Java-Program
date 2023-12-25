package condition;
import java.util.Scanner;

//difference between if else and switch case:
//if else is used when we have to check multiple conditions.
//switch case is used when we have to check only one variable.
//which one is faster? switch case is faster than if else.

public class GradeUsingSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        Grade(marks);
    }
    static void Grade(int marks){
        switch(marks){
            case 10:
                System.out.println("Grade: A+");
                break;
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B+");
                break;
            case 7:
                System.out.println("Grade: B");
                break;
            case 6:
                System.out.println("Grade: C+");
                break;
            case 5:
                System.out.println("Grade: C");
                break;
            case 4:
                System.out.println("Grade: D+");
                break;
            case 3:
                System.out.println("Grade: D");
                break;
            case 2:
                System.out.println("Grade: E+");
                break;
            case 1:
                System.out.println("Grade: E");
                break;
            case 0:
                System.out.println("Grade: F");
                break;
            default:
                System.out.println("Invalid marks");
        }
    }
}
