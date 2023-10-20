package Composition.CompositionUsingConstructor;

public class Student {
    //properties for Student
     private String name;
     private Book book;

     //Composition using method
    public void setBook(String name, Book book) {
        this.name = name;
        this.book = book;
    }
    //Composition using Constructor
    Student(String name, Book book){
        this.name = name;
        this.book = book;
    }
    public void getBook() {
        System.out.println(name + " Have a Book is " + book.name);
    }

}
