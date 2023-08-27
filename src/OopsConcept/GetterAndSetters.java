package OopsConcept;

//What is Access Modifier?
//Access modifiers are used to set the accessibility (visibility) of classes, interfaces, methods, and constructors.
//We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.
//There are four types of access modifiers in Java:

//1. Private: The access level of a private modifier is only within the class.
//It cannot be accessed from outside the class.

//2. Default: The access level of a default modifier is only within the package.
//It cannot be accessed from outside the package.
//If you do not specify any access level, it will be the default.

//3. Protected: The access level of a protected modifier is within the package and outside the package through child class.
//If you do not make the child class, it cannot be accessed from outside the package.

//4. Public: The access level of a public modifier is everywhere.
//It can be accessed from within the class, outside the class, within the package and outside the package.







//Getter and Setter methods are used to get and set the values of variables.
//Getter method is used to get the value of a variable.
//Setter method is used to set the value of a variable.
//Getter and Setter methods are also known as accessor and mutator methods.
//Getter and Setter methods are used to provide the security of data.
//Getter and Setter methods are used to access the private data members of a class.
//Getter and Setter methods are also known as accessors and mutators.
//Getter and Setter methods are used to set and get the data of a class.


//Why we use Getter and Setter methods?
//Getter and Setter methods are used to provide the security of data.
//Getter and Setter methods are used to access the private data members of a class.

//Real Life Example of Getter and Setter methods:
//Suppose we have a bank account class and it has a private data member balance.
//Now we want to access the balance of a particular account.
//So we will use the getter method to get the balance of a particular account.
//Now we want to update the balance of a particular account.
//So we will use the setter method to set the balance of a particular account.

//One of the major benefits of using getter and setter methods is that it provides the control over the data.
//It means we can set the value of a variable according to our requirement.
//For example, if we want to set the value of a variable age, we can pass the condition in the setter method.
//If the age is greater than 18, then we can set the value of age otherwise we can show the error message.




public class GetterAndSetters{
    public static void main(String[] args) {
        Students obj = new Students();
        obj.setId(1);
        obj.setName("Rahul");
        obj.setAge(20);
        System.out.println("Id: " + obj.getId() + " Name: " + obj.getName() + " Age: " + obj.getAge());
    }
}

class Students{
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id; //this keyword is used to refer the current object.
        // this keyword is used to refer the current class instance variable.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
