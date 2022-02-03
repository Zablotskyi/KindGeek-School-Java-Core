import model.Author;
import model.Book;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Application application = new Application();
        Author author1 = new Author("Taras", "Shevchenko", "Kobzar");
        Author author2 = new Author("Viktor", "Pilevin", "Generation P");
        Author author3 = new Author("Robert", "Martin", "Clean code");
        Book book1 = new Book("Perfect programmer", new Author("Robert", "Martin"));
        Book book2 = new Book("Database Basics", new Author("Olga", "Piniagina"));
        Book book3 = new Book("GIT for a professional programmer", new Author("Scott", "Chacon"));

        application.addDescriptionBook(book1);
    }
}