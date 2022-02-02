import model.Book;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Application {
    Book book;
    File file;

    public void addDescriptionBook(Book book) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String description;
        File file = new File("//lesson9_HomeWork/" + book.getName() + ".txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        System.out.println("Додайте опис до книги:");
        description = scanner.nextLine();

        scanner.close();
//        System.out.println("Введіть Призвище автора або назву книги до яких треба додати опис:");
//        name = scanner.nextLine();
    }

//    public Author findAuthor(String authorName) {
//        for (Author author : book.getAuthorList()) {
//            if (author.getName().equals(authorName)) {
//                file = new File("//lesson9_HomeWork/" + author.getName() + ".txt");
//                if (isFileExists(file.getName()))
//            }
//        }
//
//        return ;
//    }
//
//    public boolean isFileExists(String fileName) {
//        File file = new File(fileName);
//        if (!file.exists()) {
//            return false;
//        }
//        return true;
//    }
}
