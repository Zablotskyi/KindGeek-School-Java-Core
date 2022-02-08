package model;

public abstract class Computer extends Product {
    public Computer(String name, int price, String color, String group, String pluggable) {
        super(name, price, color, group, pluggable);
    }

    public Computer(String name, int price, String color, String group) {
        super(name, price, color, group);
    }
}
