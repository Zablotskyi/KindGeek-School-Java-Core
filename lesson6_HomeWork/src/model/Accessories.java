package model;

public abstract class Accessories extends Product {
    private String pluggable;

    public Accessories(String name, int price, String color, String pluggable) {
        super(name, price, color);
        this.pluggable = pluggable;
    }

    public String getPluggable() {
        return pluggable;
    }

    public void setPluggable(String pluggable) {
        this.pluggable = pluggable;
    }
}
