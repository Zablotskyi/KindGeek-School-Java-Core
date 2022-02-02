package model;

public class Person {

    private String firstName;

    private String lastName;

    private boolean isDriver = false;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean sitDownOnDriverPlace(Car car) {
        this.isDriver = true;
        System.out.println(this.firstName + " is driver of " + car.getModel());
        return this.isDriver;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isDriver() {
        return isDriver;
    }

    public void setDriver(boolean driver) {
        isDriver = driver;
    }
}
