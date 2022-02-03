import model.Book;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application {
    private static final String DIRECTORY = "lesson9_HomeWork//";
    Book book;
    File file;

    public void addDescriptionBook(Book book) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String description;
        File file = new File(DIRECTORY + book.getName() + ".txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        System.out.println("Додайте опис до книги:");
        description = scanner.nextLine();

        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.append(description);

        scanner.close();
        fileWriter.close();


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
