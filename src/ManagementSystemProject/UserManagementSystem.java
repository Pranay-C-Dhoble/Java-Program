package ManagementSystemProject;

import java.util.HashMap;
import java.util.Map;

public class UserManagementSystem {

    private static Map<Integer, User> userDatabase = new HashMap<>();
    private static int userIdCounter = 1;

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java UserManagementSystem <command> [--n <name>] [--p <phone>] [--a <age>] [--e <email>] [--d <address>]");
            System.exit(1);
        }

        String command = args[0].toLowerCase();
        Map<String, String> params = parseCommandArgs(args);

        switch (command) {
            case "create":
                createUser(params);
                break;
            case "update":
                updateUser(params);
                break;
            case "delete":
                deleteUser(params);
                break;
            default:
                System.out.println("Invalid command. Use create, update, or delete.");
        }
    }

    private static void createUser(Map<String, String> params) {
        String name = params.get("--n");
        String phone = params.get("--p");
        String age = params.get("--a");
        String email = params.get("--e");
        String address = params.get("--d");

        User user = new User(userIdCounter, name, phone, age, email, address);
        userDatabase.put(userIdCounter, user);

        System.out.println("User created successfully. User ID: " + userIdCounter);
        userIdCounter++;
    }

    private static void updateUser(Map<String, String> params) {
        String userIdStr = params.get("--id");
        if (userIdStr == null) {
            System.out.println("Usage: java UserManagementSystem update --id <userId> [--n <name>] [--p <phone>] [--a <age>] [--e <email>] [--d <address>]");
            System.exit(1);
        }

        int userId = Integer.parseInt(userIdStr);
        if (!userDatabase.containsKey(userId)) {
            System.out.println("User not found with ID: " + userId);
            System.exit(1);
        }

        String name = params.get("--n");
        String phone = params.get("--p");
        String age = params.get("--a");
        String email = params.get("--e");
        String address = params.get("--d");

        User updatedUser = new User(userId, name, phone, age, email, address);
        userDatabase.put(userId, updatedUser);

        System.out.println("User updated successfully. User ID: " + userId);
    }

    private static void deleteUser(Map<String, String> params) {
        String userIdStr = params.get("--id");
        if (userIdStr == null) {
            System.out.println("Usage: java UserManagementSystem delete --id <userId>");
            System.exit(1);
        }

        int userId = Integer.parseInt(userIdStr);
        if (!userDatabase.containsKey(userId)) {
            System.out.println("User not found with ID: " + userId);
            System.exit(1);
        }

        userDatabase.remove(userId);
        System.out.println("User deleted successfully. User ID: " + userId);
    }

    private static Map<String, String> parseCommandArgs(String[] args) {
        Map<String, String> params = new HashMap<>();
        String currentFlag = null;

        for (String arg : args) {
            if (arg.startsWith("--")) {
                currentFlag = arg;
            } else if (currentFlag != null) {
                params.put(currentFlag, arg);
                currentFlag = null;
            }
        }

        return params;
    }

    private static class User {
        private int id;
        private String name;
        private String phone;
        private String age;
        private String email;
        private String address;

        public User(int id, String name, String phone, String age, String email, String address) {
            this.id = id;
            this.name = name;
            this.phone = phone;
            this.age = age;
            this.email = email;
            this.address = address;
        }
    }
}
