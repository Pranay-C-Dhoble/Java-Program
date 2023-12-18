package FirstNewJavaProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddUser extends User {
    Map<Integer, User> users = new HashMap<>();
    public void addUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of users: ");
        int numberOfUsers = scanner.nextInt();

        for (int i = 0; i < numberOfUsers; i++) {
            System.out.println("Enter your name: ");
            String name = scanner.next();
            System.out.println("Enter your email: ");
            String email = scanner.next();
            System.out.println("Enter your password: ");
            String password = scanner.next();
            System.out.println("Enter your Role: ");
            String role = scanner.next();
            User user = new User();
            user.setName(name);
            user.setEmail(email);
            user.setPassword(password);
            user.setRole(role);
            users.put(i+1, user);
        }
    }
    public void readUser(int id){
        System.out.println(users.get(id));
        System.out.println("Name: " + users.get(id).getName());
        System.out.println("Email: " + users.get(id).getEmail());
        System.out.println("Password: " + users.get(id).getPassword());
        System.out.println("Role: " + users.get(id).getRole());
    }
    public void updateUser(int id){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Enter your email: ");
        String email = scanner.next();
        System.out.println("Enter your password: ");
        String password = scanner.next();
        System.out.println("Enter your Role: ");
        String role = scanner.next();
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setRole(role);
        users.put(id, user);
    }
    public void deleteUser(int id){
        users.remove(id);
    }
    public int select(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add User Information press 1");
        System.out.println("Read User Information press 2");
        System.out.println("Update User Information press 3");
        System.out.println("Delete User Information press 4");
        System.out.println("Exit press 5");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        return choice;
    }
}
