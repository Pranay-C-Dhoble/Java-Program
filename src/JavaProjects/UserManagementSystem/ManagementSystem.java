package JavaProjects.UserManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class ManagementSystem {

    private static Map<String, User> users = new HashMap<>();

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java UserManagement --action [create|update|delete|read] --n \"name\" --p \"phone\" --a \"address\" --id \"userId\"");
            return;
        }

        String action = args[1];
        switch (action) {
            case "create":
                createUser(args);
                break;
            case "update":
                updateUser(args);
                break;
            case "delete":
                deleteUser(args);
                break;
            case "read":
                readUser(args);
                break;
            default:
                System.out.println("Invalid action. Supported actions: create, update, delete, read");
        }
    }

    private static void createUser(String[] args) {
        String name = getValue(args, "--n"); // getValue is a method that returns the value of the key passed in the args array
        String phone = getValue(args, "--p");
        String address = getValue(args, "--a");
        String id = getValue(args, "--id");

        if (name == null || phone == null || address == null || id == null) {
            System.out.println("Missing required parameters. Please provide --n, --p, --a");
            return;
        }

        User user = new User(name, id, address, phone); // generateUserId is a method that returns a unique user ID
        users.put(user.getId(), user);
        System.out.println("User created successfully. ID: " + user.getId());
        readUser(args);
        updateUser(args);
    }

    private static void updateUser(String[] args) {
        String userId = getValue(args, "--id");
        if (userId == null) {
            System.out.println("Missing required parameter. Please provide --id");
            return;
        }

        User user = users.get(userId); //user is a variable that stores the value of the key userId
        if (user == null) {
            System.out.println("User not found with ID: " + userId);
            return;
        }

        if (args.length > 3) {
            user.setName(getValue(args, "--n"));
            user.setPhone(getValue(args, "--p"));
            user.setAddress(getValue(args, "--a"));
            System.out.println("User updated successfully.");
        } else {
            System.out.println("No update parameters provided.");
        }
    }

    private static void deleteUser(String[] args) {
        String userId = getValue(args, "--id");
        if (userId == null) {
            System.out.println("Missing required parameter. Please provide --id");
            return;
        }

        User user = users.remove(userId); //here user returns the value of the key userId
        if (user == null) {
            System.out.println("User not found with ID: " + userId);
        } else {
            System.out.println("User deleted successfully.");
        }
    }

    private static void readUser(String[] args) {
        String userId = getValue(args, "--id");
        if (userId == null) {
            System.out.println("Missing required parameter. Please provide --id");
            return;
        }

        User user = users.get(userId);
        if (user == null) {
            System.out.println("User not found with ID: " + userId);
        } else {
            System.out.println("User Information:");
            System.out.println("ID: " + user.getId());
            System.out.println("Name: " + user.getName());
            System.out.println("Phone: " + user.getPhone());
            System.out.println("Address: " + user.getAddress());
        }
    }

    public static String getValue(String[] args, String key) {
        for (int i = 0; i < args.length - 1; i++) {
            if (args[i].equals(key)) {
                return args[i + 1];
            }
        }
        return null;
    }

    public static String generateUserId() {
        // This is a simple method to generate a unique user ID. You might want to use a better approach in a real application.
        return "U" + System.currentTimeMillis(); // System.currentTimeMillis() returns the current time in milliseconds
    }
}