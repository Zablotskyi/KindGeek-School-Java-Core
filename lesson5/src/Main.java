import model.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> list1 = new ArrayList<>();
//        list1.add("One");
//        list1.add("Two");
//        list1.add("Three");
//
//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        list.add("4");
//        list.add("5");
//        list.add("1");
////        list.addAll(list1);
////        list.addAll(1, list1);
////        list.removeAll(list1);
////        System.out.println(list);
//        System.out.println(list.subList(1, 4));
//        System.out.println(list.contains(list1));
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);
//        list.remove("1");
//        list.add(2, "Three");
//        System.out.println(list);
//        System.out.println(list.size() + " size");
//        System.out.println(list.get(3));
//        System.out.println(list.contains("2"));
//        System.out.println(list.contains("22"));
//        list.clear();
        Person person = new Person("Vasyl", 35, 300_000);
        person.buyCar(50000);
        person.showGarage();
        person.priceOfGarage();
    }
}
