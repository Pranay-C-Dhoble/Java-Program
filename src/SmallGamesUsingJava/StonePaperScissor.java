package SmallGamesUsingJava;
import java.util.Random;
import java.util.Scanner;
public class StonePaperScissor {
    public static void main(String[] args) {
        System.out.println("Welcome to Stone Paper Scissor Game.");
        System.out.print("Enter 0 for Stone, 1 for Paper, 2 for Scissor : ");
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt(); // sc is reference variable of Scanner class.
        String r = Result(user);
        System.out.println(r);
    }
    static String Result(int user){
        if(user < 0 || user > 2){
            return "Invalid Input";
        }
        Random random = new Random();
        int computer = random.nextInt(3); //output will be 1, 2, 3.
        System.out.println("Computer: " + computer);
        if(user == computer){
            return "Draw";
        }
        else if(user == 0 && computer == 2 || user == 1 && computer == 0 || user == 2 && computer == 1){
            return "******** You Won ********";
        }
        else{
            return "Computer Won";
        }
    }
}
