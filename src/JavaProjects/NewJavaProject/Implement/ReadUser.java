package JavaProjects.NewJavaProject.Implement;
import JavaProjects.NewJavaProject.Model.User;
import JavaProjects.NewJavaProject.Storage;
import JavaProjects.NewJavaProject.Validator.Command;
import JavaProjects.NewJavaProject.Validator.CommandValidator;

public class ReadUser implements Command, CommandValidator {
    public void execute(String[] args) {
        // write logic for read user
        String id = Storage.getValue(args, "-i");
        String name = Storage.getValue(args, "-n");
        String phone = Storage.getValue(args, "-p");
        String getAllUsers;
        if (args[2].equals("-all")) {
            id = null;
            name = null;
            phone = null;
            getAllUsers = args[2];
        } else {
            getAllUsers = null;
        }
        String[] attributes = {id, name, getAllUsers, phone};
        if (validate(attributes)) {
            if (id != null) {
                User user = findUser(id, null, null);
                if (user == null) {
                    System.out.println("User not found");
                } else {
                    displayUserInfo(user);
                }
            } else if (name != null) {
                User user = findUser(null, name, null);
                if (user == null) {
                    System.out.println("User not found");
                } else {
                    displayUserInfo(user);
                }
            } else if(phone != null){
                User user = findUser(null, null, phone);
                if (user == null) {
                    System.out.println("User not found");
                } else {
                    displayUserInfo(user);
                }
            } else {
                displayAllUsers();
            }
        }
    }

    @Override
    public boolean validate(String[] attributes) {
        String id = attributes[0];
        String name = attributes[1];
        String getAllUsers = attributes[2];
        String phone = attributes[3];
        // write logic for validate
        if (id == null && name == null && getAllUsers == null && phone == null) {
            System.err.println("Missing required parameter. Please provide -i, -n, or -all");
            return false;
        }
        if (id != null && name != null) {
            System.err.println("Please provide either -i or -n. Both cannot be provided at the same time.");
            return false;
        }
        if (id != null && getAllUsers != null) {
            System.err.println("Please provide either -i or -all. Both cannot be provided at the same time.");
            return false;
        }
        if (name != null && getAllUsers != null) {
            System.err.println("Please provide either -n or -all. Both cannot be provided at the same time.");
            return false;
        }
        return true;
    }

    private User findUser(String id, String name, String phone) {
        for (User user : Storage.users) {
            if ((user.getId().equals(id)) || (user.getName().equals(name)) || (user.getPhone() == Long.parseLong(phone))) {
                return user;
            }
        }
        return null;
    }
    private void displayAllUsers() {
        if (Storage.users.isEmpty()) {
            System.out.println("No users available.");
        } else {
            System.out.println("All Users:");
            for (User user : Storage.users) {
                displayUserInfo(user);
                System.out.println("----------------");
            }
        }
    }

    private void displayUserInfo(User user) {
        System.out.println("User Information:");
        System.out.println("ID: " + user.getId());
        System.out.println("Name: " + user.getName());
        System.out.println("Phone: " + user.getPhone());
        System.out.println("Address: " + user.getAddress());
    }

}
