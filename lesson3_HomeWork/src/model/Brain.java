package model;

public class Brain {
    Taxi taxi = new Taxi();

    public void say() {
        System.out.println("- Let's call a taxi");

        taxi.createTaxi();
    }
}
