import model.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Person> personSet = new TreeSet<>();
        Person person1 = new Person("Vasyl", 35);
        Person person2 = new Person("Yaromyr", 24);
        Person person3 = new Person("Oksana", 37);
        Person person4 = new Person("Mykola", 15);
        Person person5 = new Person("Ihor", 20);
        Person person6 = new Person("Sasha", 13);
        Person person7 = new Person("Maryna", 5);
        Person person8 = new Person("Anna", 40);

        List<Person> personWithAgeGreatherThan18 = new ArrayList<>();

        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);
        personSet.add(person6);
        personSet.add(person7);
        personSet.add(person8);

//        Iterator<Person> iterator = personSet.iterator();
//        while (iterator.hasNext()) {
//            Person person = iterator.next();
//            if (person.getName().equals("Vasyl")) {
//                System.out.println("We found Petro");
//            }
//        }

        Iterator<Person> iterator = personSet.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getAge() > 18) {
                personWithAgeGreatherThan18.add(person);
            }
        }
        for (Person person : personWithAgeGreatherThan18) {
            System.out.println(person);
        }
    }
}
