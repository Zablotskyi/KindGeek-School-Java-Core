package model;

public class Car {
    People people = new People();
    private String name = "Car";
    private int count = people.getPeopleList().size() / 4;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public void createCar() {
        int numberPeople = (int) (Math.random() * 4);

        people.createDriverAndPassengers(numberPeople);

        for (int i = 0; i < count; i++) {
            Car car = new Car(name + i);
            System.out.println("need " + count + " drivers");
        }
    }
}
