import model.Person;

public class Main {

    public static void main(String[] args) {
        Person myPerson = new Person("Vasyl", 35);
        myPerson.sayName();
        myPerson.add(5, 10);
    }
}
