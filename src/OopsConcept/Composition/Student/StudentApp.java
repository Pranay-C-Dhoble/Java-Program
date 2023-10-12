package OopsConcept.Composition.Student;

public class StudentApp {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "John";
        stu.books = new Book[6];
        stu.books[0] = new Book();
        stu.books[0].bookname = "Java";
        stu.books[0].author = new Author();
        stu.books[0].author.name = "James";
        stu.books[0].publisher = new Publisher();
        stu.books[0].publisher.address = "Oxford";
        stu.books[0].price = 100.00;
        stu.books[1] = new Book();
        stu.books[1].bookname = "Python";
        stu.books[1].author = new Author();
        stu.books[1].author.name = "Guido";
        stu.books[1].publisher = new Publisher();
        stu.books[1].publisher.address = "Cambridge";
        stu.books[1].price = 200.00;
        System.out.println("Student Name: " + stu.name);
        System.out.println("Book 1 Name: " + stu.books[0].bookname);
        System.out.println("Book 1 Author: " + stu.books[0].author.name);
        System.out.println("Book 1 Publisher: " + stu.books[0].publisher.name);
        System.out.println("Book 1 Price: " + stu.books[0].price);
        System.out.println("Book 2 Name: " + stu.books[1].bookname);
        System.out.println("Book 2 Author: " + stu.books[1].author.name);
        System.out.println("Book 2 Publisher: " + stu.books[1].publisher.name);
        System.out.println("Book 2 Price: " + stu.books[1].price);
    }
}
