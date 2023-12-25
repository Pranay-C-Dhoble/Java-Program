package firstnewjava_project;
import java.util.Scanner;
public class FirstUserApplication {
    public static void main(String[] args) {
        System.out.println("Add User Information press 1");
        System.out.println("Read User Information press 2");
        System.out.println("Update User Information press 3");
        System.out.println("Delete User Information press 4");
        System.out.println("Exit press 5");
        System.out.print("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();


        switch(choice){
            case 1:
                AddUser addUser = new AddUser();
                addUser.addUser();
            case 2:
                AddUser readUser = new AddUser();
                System.out.println("Enter the id of user to print: ");
                int id = scanner.nextInt();
                readUser.readUser(id);
                break;
            case 3:
                AddUser updateUser = new AddUser();
                System.out.println("Enter the id of user to update: ");
                int id1 = scanner.nextInt();
                updateUser.updateUser(id1);
                break;
            case 4:
                AddUser deleteUser = new AddUser();
                System.out.println("Enter the id of user to delete: ");
                int id2 = scanner.nextInt();
                deleteUser.deleteUser(id2);
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        }
//        if(choice == 1){
//            AddUser addUser = new AddUser();
//            addUser.addUser();
//        }
//        else if(choice == 2){
//            AddUser readUser = new AddUser();
//            System.out.println("Enter the id of user to print: ");
//            int id = scanner.nextInt();
//            readUser.readUser(id);
//        }
//        else if(choice == 3){
//            AddUser updateUser = new AddUser();
//            System.out.println("Enter the id of user to update: ");
//            int id = scanner.nextInt();
//            updateUser.updateUser(id);
//        }
//        else if(choice == 4){
//            AddUser deleteUser = new AddUser();
//            System.out.println("Enter the id of user to delete: ");
//            int id = scanner.nextInt();
//            deleteUser.deleteUser(id);
//        }
//        else if(choice == 5){
//            System.exit(0);
//        }


    }
}
