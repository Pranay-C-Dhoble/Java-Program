package composition.CompositionUsingConstructor;

public class StudentMain {
    public static void main(String[] args) {
        Book book = new Book("Java", "James Gosling");
        Student student = new Student("Raj", book);
        student.getBook();
    }
}
