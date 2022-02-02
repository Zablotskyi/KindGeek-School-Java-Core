package model;

import java.util.Scanner;

public class Policeman {

    public void challengeAccepted() {
//        People people = new People();
        Car car = new Car();
        Brain brain = new Brain();

        System.out.println("- You can't drive like this or I'll have to arrest you. " +
                "Find another driver.");
        brain.say();
        car.createCar();
//        people.createDriverAndPassengers();
    }
}
