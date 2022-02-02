package model;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private int balance;
    private List<Car> cars;

    public Person(String name, int age, int balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
        this.cars = new ArrayList<>();
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

    public void setAge(int age) {
        this.age = age;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void buyCar(int price) {
        cars.add(new Car("Sprinter", "100", price));
        setBalance(getBalance() - price);
        System.out.println("Куплена маниша: " + cars.get(0).getModel() + " За " + cars.get(0).getPrice() + "$");
        System.out.println("На рахунку залишилось: " + getBalance() + "$");
    }

    public void showGarage() {
        for (Car car : cars) {
            System.out.println("В гаражі є такі авто: ");
            System.out.println("Model: " + car.getModel() + " Power: " + car.getPower() + " Price: " + car.getPrice() + "$");
        }
    }

    public void priceOfGarage() {
        int sum = 0;
        for (Car car : cars) {
            sum += car.getPrice();
            System.out.println("Всього авто на суму: " + sum + "$");
        }
    }
}
