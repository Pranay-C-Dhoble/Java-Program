package JavaProjects.NewJavaProject.Implement;
import JavaProjects.NewJavaProject.Model.Result;
import JavaProjects.NewJavaProject.Model.User;
import JavaProjects.NewJavaProject.Storage;
import JavaProjects.NewJavaProject.Validator.Command;
import JavaProjects.NewJavaProject.Validator.CommandValidator;

public class DeleteUser implements Command, CommandValidator {
    public void execute(String[] args) {
        // write logic for delete user
        //-i for id, delete user by id
        String userId = Storage.getValue(args, "-id");
        if(validate(args)){
            User user = findUser(userId);
            System.out.println(user);
            if(user == null){
                System.out.println("User not found");
            } else {
                displayUserInfo(user);
                deleteUser(user);
            }
        }
    }


    @Override
    public boolean validate(String[] attributes) {
        String userId = attributes[3];
        if (userId == null) {
            System.out.println("Missing required parameter. Please provide --id");
            return false;
        }
        return true;
    }
    private User findUser(String userId) {
        for (User existingUser : Storage.users) {
            if (existingUser.getId().equals(userId)) {
                return existingUser;
            }
        }
        return null;
    }
    private void deleteUser(User user){
        Storage.users.remove(user);
        System.out.println("User deleted successfully.");
    }
    private void displayUserInfo(User user) {
        System.out.println("User ID: " + user.getId());
        System.out.println("User Name: " + user.getName());
        System.out.println("User Phone: " + user.getPhone());
        System.out.println("User Address: " + user.getAddress());
    }
}
