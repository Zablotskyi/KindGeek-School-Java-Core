import model.Author;
import model.Book;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class Application {
    private static final String DIRECTORY = "lesson9_HomeWork//";
    Book book;
    File file;

    public void addDescriptionBook(Book book) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String description;
        File file = new File(DIRECTORY + "description_" + book.getName() + ".txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        System.out.println("Додайте опис до книги:");
        description = scanner.nextLine();

        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.append(description + "\n");

        scanner.close();
        fileWriter.close();
    }

    public void addCoverBook(Book book) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String cover;
        File file = new File(DIRECTORY + "cover" + book.getName() + ".jpg");
        if (!file.exists()) {
            file.createNewFile();
        }
        System.out.println("Вставте лінк на обкладинку до книги в форматі .jpg:");
        cover = scanner.nextLine();
        URL url = new URL(cover);
        InputStream inputStream = url.openStream();
        OutputStream outputStream = new FileOutputStream(DIRECTORY + "cover" + book.getName() + ".jpg");
        int next;
        while ((next = inputStream.read()) != -1) {
            outputStream.write(next);
        }

        scanner.close();
        inputStream.close();
        outputStream.close();
    }

//    REFLECTION    //
    public void reflection() throws NoSuchFieldException, IllegalAccessException {
        Book bookReflection = new Book("Base Java", 2017,  new Author("Mykola", "Prokhorenko"));
        Class<Book> cl = Book.class;
        //витягаємо назву нашого класу
        System.out.println("Клас нашого об'єкту: " + cl.getName());
        //витягаємо суперклас (батько нашого класу)
        System.out.println("Клас нашого предка: " + cl.getSuperclass().getName());
        //витягаємо інтерфейс котрий імплементує наш клас
        System.out.println("Інтерфейс котрий ми імплементуємо у нашого класа: " + Arrays.toString(cl.getInterfaces()));
        //витягаємо всі конструктори котрі є в нашому класі
        System.out.println("конструктори котрі є в нашому класі");
        for(Constructor<?> constructor : cl.getConstructors()) {
            System.out.println(Arrays.toString(constructor.getParameters()));
        }
        //витягаємо наші публічні філди нашого класу
//        Field publicFieldName = cl.getField("name");
        //витягаємо наші приватні філди нашого класу
        //якщо треба витягнути одне поле
        Field privateFieldName = cl.getDeclaredField("name");
        privateFieldName.setAccessible(true);
        //витягаємо поле name нашої книги
        System.out.println(privateFieldName.get(bookReflection));
        //якщо треба витягнути всі поля нашого класу
//        for(Field nextField : cl.getDeclaredFields()) {
//            nextField.setAccessible(true);
//            System.out.println(nextField.getName() + " = " + nextField.get(bookReflection));
//        }
        //змінюємо наше приватне поле
        privateFieldName.set(bookReflection, "Java Base Java");
        System.out.println("Нова назва книги: " + bookReflection.getName());
        //витягаємо методи нашого класу
        for (Method method : cl.getMethods()) {
            System.out.println(method.getName());
            System.out.println(Arrays.toString(method.getParameters()));
            //витягаємо параментри, котрі передаються в методи (якщо вони є)
            for (Parameter parameter : method.getParameters()) {
                System.out.println(parameter.getType() + " " + parameter.getName() + " ,");
            }
            System.out.println();
            System.out.println("________________________________________________________");
        }
    }
}
