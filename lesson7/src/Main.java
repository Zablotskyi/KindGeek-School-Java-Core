import exception.MyException;
import model.Person;

import java.util.*;

public class Main {

    public static void main(String[] args) throws MyException {
        Map<Person, Integer> map = new HashMap<>();
        map.put(new Person("Vasyl", 24), 2);
        map.put(new Person("Ivan", 13), 5);
        map.put(new Person("Ostap", 33), 8);
//        System.out.println(map.get(new Person("Vasyl", 24)));
//        Set<Map.Entry<Person, Integer>> entrySet = map.entrySet();
//        for (Map.Entry<Person, Integer> personIntegerEntry : entrySet) {
//            System.out.println(personIntegerEntry.getKey());
//            System.out.println(personIntegerEntry.getValue());
//        }
//        Set<Person> personSet = map.keySet();
//        for (Person person : personSet) {
//            System.out.println(map.get(person));
//        }
//        List<Integer> list = new ArrayList<>(map.values());
//        System.out.println(list);

//        Integer[] arr = new Integer[3];
//        arr[0] = 5;
//        arr[1] = 15;
//        arr[2] = 10;
//
//        try {
//            System.out.println(arr[4]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Комірка не існує");
//        }
//
//        System.out.println("Кінець програми");

        Person person = new Person(null, 35);
        person.sayMyName();
    }
}
