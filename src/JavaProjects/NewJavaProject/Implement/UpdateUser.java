package JavaProjects.NewJavaProject.Implement;
import JavaProjects.NewJavaProject.Model.Result;
import JavaProjects.NewJavaProject.Model.User;
import JavaProjects.NewJavaProject.Storage;
import JavaProjects.NewJavaProject.Validator.Command;
import JavaProjects.NewJavaProject.Validator.CommandValidator;

public class UpdateUser implements Command, CommandValidator {
    public void execute(String[] attributes) {
        // write logic for update user
        //i for id, update user by id
        //-f fieldName
        //-v value of that field
        String id = Storage.getValue(attributes, "-i");
        String field = Storage.getValue(attributes, "-f");
        String value = Storage.getValue(attributes, "-v");
        String[] args = {id, field, value};
        if (validate(args)) {
            User user = findUser(id, null, 0);
            if (user == null) {
                System.out.println("User not found");
            } else {
                updateUser(user, field, value);
            }
        }
    }

    @Override
    public boolean validate(String[] attributes) {
        String id = attributes[0];
        String field = attributes[1];
        String value = attributes[2];
        // write logic for validate
        if (id == null || field == null || value == null) {
            System.err.println("Missing required parameters. Please provide -i, -f, -v");
            return false;
        }
        if (!field.equals("name") && !field.equals("phone") && !field.equals("address")) {
            System.err.println("Invalid field name. Please provide -f as name, phone, or address");
            return false;
        }
        if (!userExists(id)) {
            System.err.println("User not found with ID: " + id);
            return false;
        }
        return true;
    }
    private boolean userExists(String id) {
        for (User existingUser : Storage.users) {
            if (existingUser.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
private User findUser(String id, String name, long phone) {
        for (User existingUser : Storage.users) {
            if (existingUser.getId().equals(id)) {
                return existingUser;
            } else if (existingUser.getName().equals(name)) {
                return existingUser;
            } else if (existingUser.getPhone() == (phone)) {
                return existingUser;
            }
        }
        return null;
    }
    private void updateUser(User user, String field, String value) {
        switch (field) {
            case "name" -> user.setName(value);
            case "phone" -> user.setPhone(Long.parseLong(value));
            case "address" -> user.setAddress(value);
        }//here -> is the arrow operator use to replace the switch case
        //why we use arrow operator here?
        //because we are using java 14 and switch case is not supported in java 14
        System.out.println("User updated successfully.");
    }

}
