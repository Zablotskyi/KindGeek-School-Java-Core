package model;

public class Person {
    public String name;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayName() {
        System.out.println("my name is " + this.name);
    }

    public void add(int i, int j) {
        System.out.println("Sum = " + (i + j));
    }
}
