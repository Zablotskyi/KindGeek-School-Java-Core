package model;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person implements Purchase, Salary {
    private final int START_BALANCE = 1000;
    Client client;
    private List<Client> clientsList = new ArrayList<>();
    private List<Product> productsList = new ArrayList<>();
    private String bank;

    public Client(String name, int balance, String company) {
        super(name, balance);
        this.bank = company;
    }

    public void createClient() {
        clientsList.add(client);
    }

    @Override
    public void display() {
        System.out.printf("Employee name: %s \t Bank: %s \n", super.getName(), bank);
    }

    @Override
    public void showBalanceBeforePurchase() {
        System.out.println("Employee balance: " + getBalance());
    }

    @Override
    public void showBalanceAfterPurchase() {
        System.out.println("Employee balance: " + getBalance());
    }

    @Override
    public void puy(int price) {
        setBalance(getBalance() + price);
        System.out.println("Employee balance: " + getBalance());
    }

    @Override
    public void buy(Product product, int price) {
        productsList.add(product);
        setBalance(getBalance() - price);
    }

    @Override
    public void showBalanceBeforeSalary() {
        System.out.println("Employee balance: " + getBalance());

    }

    @Override
    public void showBalanceAfterSalary() {
        System.out.println("Employee balance: " + getBalance());
    }
}
