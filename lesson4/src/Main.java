import model.Footballer;
import model.Person;
import model.Programmer;
import model.Season;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person("Vasyl", "Vasyliovich");
//        System.out.println(person.getFirsName());
//        System.out.println(Person.ID);
////        Person.id = "87654321";
//        System.out.println(Person.ID);
//
//        System.out.println(Season.WINTER.name());
//        System.out.println(Season.WINTER.ordinal());
//        System.out.println(Arrays.stream(Season.values()).toList());
//        for (int i = 0; i < Season.values().length; i++) {
//            System.out.println(Arrays.stream(Season.values()).toList().get(i).name() + " " +
//                    Arrays.stream(Season.values()).toList().get(i).ordinal());
//        Season[] seasons = Season.values();
//        for (Season season : seasons) {
//            System.out.println(season.name() + " " + season.ordinal());
//            System.out.println("AVG temperature is " + season.getAvgT() + "C");
//        }
        Programmer person1 = new Programmer("Vasyl", "Vasyliovich", 20000);
        Footballer person2 = new Footballer("Vasyl", "Vasyliovich", 20000);
        person1.getSalary();
        person2.getSalary();
    }
}


