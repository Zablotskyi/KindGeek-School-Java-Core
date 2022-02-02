package model;

public abstract class Product {
    private String name;
    private int price;
    private String color;
    private String group;
    private String pluggable;

    public Product(String name, int price, String color, String group, String pluggable) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.group = group;
        this.pluggable = pluggable;
    }

    public Product(String name, int price, String color, String group) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPluggable() {
        return pluggable;
    }

    public void setPluggable(String pluggable) {
        this.pluggable = pluggable;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", group='" + group + '\'' +
                ", pluggable='" + pluggable + '\'' +
                '}';
    }
}
