package lambda.lambdaStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Petro", 20));
        list.add(new Person("Ivan", 10));
        list.add(new Person("Tania", 18));
        list.add(new Person("Vasyl", 35));
        list.add(new Person("Mykola", 13));

//        List<Person> person18 = list.stream().filter(p -> p.getAge() >= 18).collect(Collectors.toList());
//        for (Person person : list) {
//            if (person.getAge() >= 18) {
//                System.out.println(person);
//            }
//        }
//        //той самий запис що й вище але скорочений
//        list.stream().filter(p -> p.getAge() >= 18).forEach(System.out::println);
        list.stream()
                .filter(p -> p.getAge() >= 18)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);

        List<String> names = list.stream().map(Person::getName).collect(Collectors.toList());
    }
}
