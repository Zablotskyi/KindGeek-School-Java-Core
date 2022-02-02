package model;

public class Car {
    private String model;
    private String power;
    private int price;

    public Car(String model, String power, int price) {
        this.model = model;
        this.power = power;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
