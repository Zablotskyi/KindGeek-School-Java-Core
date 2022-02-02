package model;

import java.util.Scanner;

public class Office {
    Car car = new Car();
    Keys keys = new Keys();
    Policeman policeman = new Policeman();

    public void party() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("- I forgot my car keys");
        System.out.println("- Did you drink alcohol?");
        System.out.println("If you drank alcohol press 'y' if not press 'n'");
        String answer = scanner.nextLine();

        if (answer.equals("n")) {
            System.out.println("Here are your keys");
            car.createCar();
        } else {
            callThePolice();
        }
    }

    public void callThePolice() {
        policeman.challengeAccepted();
    }
}
