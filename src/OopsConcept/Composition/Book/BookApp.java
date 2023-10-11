package OopsConcept.Composition.Book;

public class BookApp {
    public static void main(String[] args) {
        Author author = new Author();
        author.name = "J.K. Rowling";
        author.address = "London";
        author.email = "jkrowling@gmail.com";
        author.phone = "1234567890";
        Publisher publisher = new Publisher();
        publisher.name = "Bloomsbury";
        publisher.address = "London";
        Book book = new Book();
        book.NoPages = 500;
        book.Title = "Harry Potter and the Philosopher's Stone";
        book.author = author;
        //*******//What is the difference between this and the next line?
        //book.author = new Author();
        //book.author.name = "J.K. Rowling";
        //book.author.address = "London";
        //book.author.email = "jkrowling@gmail";
        //book.author.phone = "1234567890";
        //Here We are creating a new Author object and assigning it to the book.author property
        book.publisher = publisher;
        //********//Here We are creating a new Publisher object and assigning it to the book.publisher property
        System.out.println("Book Title: " + book.Title);
        System.out.println("Book No. of Pages: " + book.NoPages);
        System.out.println("Book Author: " + book.author.name);
        System.out.println("Book Author Address: " + book.author.address);
        System.out.println("Book Author Email: " + book.author.email);
        System.out.println("Book Author Phone: " + book.author.phone);
        System.out.println("Book Publisher: " + book.publisher.name);
        System.out.println("Book Publisher Address: " + book.publisher.address);
    }
}
