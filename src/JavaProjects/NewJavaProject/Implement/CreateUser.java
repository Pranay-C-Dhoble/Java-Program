package javaprojects.newjavaproject.implement;
import javaprojects.newjavaproject.Storage;
import javaprojects.newjavaproject.validator.Command;
import javaprojects.newjavaproject.validator.CommandValidator;
import javaprojects.newjavaproject.model.User;

public class CreateUser implements Command, CommandValidator {
    public void execute(String[] args){
        String name = Storage.getValue(args, "-n");
        String phone = Storage.getValue(args, "-p");
        String address = Storage.getValue(args, "-a");
        String[] array = {name, phone, address};
        if (validate(array)) {
            long phone1 = Long.parseLong(phone);
            User user = new User(name, generateUserId(), address, phone1); // generateUserId is a method that returns a unique user ID
            Storage.users.add(user);
            System.out.println("User created successfully. ID: " + user.getId());
        }
        else {
            System.err.println("Missing required parameters. Please provide -n, -p, -a");
        }
    }
    @Override
    public boolean validate(String[] args) {
        String name = args[0];
        String phone = args[1];
        String address = args[2];

        if (name == null || phone == null || address == null) {
            System.err.println("Missing required parameters. Please provide -n, -p, -a");
            return false;
        }
        if (userExists(name, phone)) {
            System.err.println("User with the same name or phone number already exists. Cannot create duplicate users.");
            return false;
        }
        return true;
    }
    private boolean userExists(String name, String phone) {
        long phone1 = Long.parseLong(phone);
        for (User existingUser : Storage.users) {
            if (existingUser.getName().equals(name) || existingUser.getPhone() == phone1) {
                return true;
            }
        }
        return false;
    }

    public static String generateUserId() {
        // This is a simple method to generate a unique user ID. You might want to use a better approach in a real application.
        return "U" + System.currentTimeMillis(); // System.currentTimeMillis() returns the current time in milliseconds
    }

}
