package Basic_Java_Assignment;
import java.util.Scanner;

public class SystemClassInfo {
    // System class in Java
    // System class is a final class in java.lang package.
    // System class is used to access system resources.
    // System class is used to access standard input, standard output, error output streams, current time in milliseconds, environment variables, system properties etc.
    // System class is used to load files and libraries.
    public static void main(String[] args) {
        System.out.println("Hello World");
        //here out is a static member field of System class and it's type PrintStream.
        //println() is a method of PrintStream class.
        //here out is a reference variable of PrintStream class.
        System.err.println("Error Message");
        //here err is a static member field of System class and it's type PrintStream.
        //here err is a reference variable of PrintStream class.
        //err is used to display error message.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);

        //here in is a static member field of System class and it's type InputStream.
        //here in is a reference variable of InputStream class.
        //here in is used to take input from keyboard.
        //here nextLine() is a method of Scanner class.
        //here nextLine() is used to take input from keyboard.
        //here name is a reference variable of String class.
    }
}
