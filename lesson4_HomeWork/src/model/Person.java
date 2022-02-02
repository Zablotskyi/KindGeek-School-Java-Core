package model;

public abstract class Person {
    private String name;
    private int balance;

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Person(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public abstract void display();
}
