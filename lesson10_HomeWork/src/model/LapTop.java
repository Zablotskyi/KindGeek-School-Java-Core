package model;

public class LapTop extends Computer {
    public LapTop(String name, int price, String color, String group, String pluggable) {
        super(name, price, color, group, pluggable);
    }

    public LapTop(String name, int price, String color, String group) {
        super(name, price, color, group);
    }
}
