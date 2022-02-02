package model;

public class Car {

    private String model;

    private int power;

    private Engine engine;

    private Person[] persons = new Person[5];

    public Car(String model, int power, Engine engine) {
        this.model = model;
        this.power = power;
        this.engine = engine;
    }

    public void startCar() {
        if (engine.startEngine()) {
            System.out.println("Car started.");
        }else {
            System.out.println("Error");
        }
    }

    public void setDriver(Person person){
        if(persons[0] != null) {
            System.out.println("Place of driver is not empty");
            return;
        }
        person.sitDownOnDriverPlace(this);
        persons[0] = person;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }
}
