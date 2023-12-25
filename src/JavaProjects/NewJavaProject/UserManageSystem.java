package javaprojects.newjavaproject;

import javaprojects.newjavaproject.implement.CreateUser;
import javaprojects.newjavaproject.implement.DeleteUser;
import javaprojects.newjavaproject.implement.ReadUser;
import javaprojects.newjavaproject.implement.UpdateUser;

import java.util.Scanner;

public class UserManageSystem {
    public static void main(String[] ar) {
        while(true) {
            System.out.println("Welcome to the User Management System");
            System.out.println("Enter the action you want to perform: -action [create|update|delete|read]");
            Scanner sc = new Scanner(System.in);
            String action1 = sc.nextLine();
            //Splitting the string into an array of strings
            String[] args = action1.split(" ");

            if (args.length < 2) {
                System.out.println("Usage: java UserManagement -action [create|update|delete|read] -n \"name\" -p \"phone\" -a \"address\"");
                return;
            }
            String action = args[1];
            switch (action) {
                case "create":
                    CreateUser createUser = new CreateUser();
                    createUser.execute(args);
                    break;
                case "update":
                    UpdateUser updateUser = new UpdateUser();
                    updateUser.execute(args);
                    break;
                case "delete":
                    DeleteUser deleteUser = new DeleteUser();
                    deleteUser.execute(args);
                    break;
                case "read":
                    ReadUser readUser = new ReadUser();
                    readUser.execute(args);
                    break;
                default:
                    System.out.println("Invalid action. Supported actions: create, update, delete, read");
            }
            System.out.println("Do you want to continue? (Y/N)");
            Scanner sc1 = new Scanner(System.in);
            //convert into Upper case
            String choice = sc1.nextLine();
            choice = choice.toUpperCase();
            if (choice.equals("N")) {
                System.exit(0);
            } else if (choice.equals("Y")) {
                continue;
            } else {
                System.out.println("Invalid choice");
                System.exit(0);
            }
        }
    }
}
