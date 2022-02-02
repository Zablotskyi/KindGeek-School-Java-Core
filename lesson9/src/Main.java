import model.Person;

import java.io.*;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.net.URL;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException, NoSuchFieldException, IllegalAccessException {
        //перевірка в if чи існує у нас файл first.txt, якщо ні то створюємого його
//        File newFile = new File("lesson9//first.txt");
//        if (!newFile.exists()) {
//            newFile.createNewFile();
//        }
        //записуемо в файл символи з 65 по 90 код по таблиці ASCII, якщо такого файлу не існує він буде створений
//        FileOutputStream fos = new FileOutputStream("lesson9//second.txt");
//        for (int i = 65; i <= 90; i++) {
//            fos.write(i);
//        }
//        fos.close();
        //зчитуємо з файлу по одному символу, якщо символи скінчилися, а ми пробуємо зчитати, то буде повертатися -1
//        FileInputStream fis = new FileInputStream("lesson9//second.txt");
//        System.out.println((char) fis.read());
//        System.out.println((char) fis.read());
//        System.out.println((char) fis.read());
//        System.out.println((char) fis.read());
//        System.out.println(fis.read());
//        System.out.println(fis.read());
//        System.out.println(fis.read());
        //зчитуємо з файлу всі символи і виводимо їх по одному на екран
//        int i;
//        while ((i = fis.read()) != -1) {
//            System.out.print((char) i);
//        }
//        fis.close();
        //записуємо й дописуємо в файл символи/строки
//        FileWriter fileWriter = new FileWriter("lesson9//second.txt", true);
//        fileWriter.append("\nHello World").append("!!!");
//        fileWriter.flush();
//        fileWriter.close();
        //зчитуємо з файла по одній строчці, якщо стічки закінчилися, то ридер буде повертати null
//        FileReader fileReader = new FileReader("lesson9//second.txt");
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
        //по ссилці скачуємо картинку, зчитуємо її по байтам і пишемо в файл
        URL url = new URL("http://www.nrcu.gov.ua/images/news/big/news_1502657648_5990bc7097ef1.jpg");
        InputStream is = url.openStream();
        OutputStream os = new FileOutputStream("lesson9//img1.jpg", true);
        int next;
        while ((next = is.read()) != -1) {
            os.write(next);
        }
        is.close();
        os.close();

        Person person = new Person("Vasyl", 35);
        Class<Person> cl = Person.class;
        System.out.println(cl.getName());
        System.out.println(cl.getSuperclass().getName());
        System.out.println(Arrays.toString(cl.getInterfaces()));

//        for(Constructor<?> constructor : cl.getConstructors()) {
//            System.out.println(Arrays.toString(constructor.getParameters()));
//        }
//
//        Field field = cl.getDeclaredField("name");
//        field.setAccessible(true);
//        System.out.println(field.get(person));
//
////        for(Field nextField : cl.getDeclaredFields()) {
////            nextField.setAccessible(true);
////            System.out.println(nextField.getName() + " = " + nextField.get(person));
////        }
//        field.set(person, "Petro");
//        System.out.println(person.getName());

        for(Method method : cl.getMethods()) {
            System.out.println(method.getName());
            System.out.println(Arrays.toString(method.getParameters()));
            for(Parameter parameter : method.getParameters()) {
                System.out.println(parameter.getType() + " " + parameter.getName() + ", ");
            }
            System.out.println();
            System.out.println("______________");
        }
    }
}
