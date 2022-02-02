package model;

import java.util.Objects;

public class Person implements Comparable<Person> {
    String name;
    Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
//        if(this.getAge() < o.getAge()) {
//            return -1;
//        } else if(this.getAge() > o.getAge()) {
//            return 1;
//        } else {
//            return 0;
//        }
//        return this.getName().compareTo(o.getName());
//        return o.getName().compareTo(this.getName());
//        return getAge().compareTo(o.getAge());
        if (getAge().compareTo(o.getAge()) == 0) {
            return o.getName().compareTo(this.getName());
        }
        return getAge().compareTo(o.getAge());
    }
}

