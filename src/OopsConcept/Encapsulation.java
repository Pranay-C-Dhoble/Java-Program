package OopsConcept;
//Encapsulation is a process of wrapping code and data together into a single unit.
//Encapsulation is a process of binding the data (i.e. variables) with the code (i.e. methods) that manipulates the data.
//Encapsulation is defined as the wrapping up of data under a single unit.
//It is the mechanism that binds together code and the data it manipulates.
//In a different way, encapsulation is a protective shield that prevents the data from being accessed by the code outside this shield.
//Technically in encapsulation, the variables or data of a class are hidden from any other class and can be accessed only through any member function of own class in which they are declared.
//As in encapsulation, the data in a class is hidden from other classes, so it is also known as data-hiding.

//Why Encapsulation is used?
//Encapsulation is used to hide the data or information in a system from the other modules or objects.
//Encapsulation is used to protect the data from the outside world.
//Encapsulation is used to access the data through the methods of the class.
//Encapsulation is used to achieve data hiding in a system.
//Encapsulation is used to improve the maintainability and flexibility of the system.
//Encapsulation is used to improve the re-usability of the code.
//Encapsulation is used to reduce the complexity of the system.
//Encapsulation is used to increase the reliability of the system.
//Encapsulation is used to improve the performance of the system.
//Encapsulation is used to improve the security of the system.
//Encapsulation is used to improve the modularity of the system.
public class Encapsulation {
    int age;
    String name;
    String address;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setAge(20);
        obj.setName("Rahul");
        obj.setAddress("Delhi");
        System.out.println("Age: " + obj.getAge() + " Name: " + obj.getName() + " Address: " + obj.getAddress());
    }
}
