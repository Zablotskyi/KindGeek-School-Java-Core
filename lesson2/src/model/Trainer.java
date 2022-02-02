package model;

public class Trainer extends Person {
    public String nameClub;

    public Trainer(String name, int age, String nameClub) {
        super(name, age);
        this.nameClub = nameClub;
    }

    public void badWords(Player player) {
        System.out.println("********** " + player.getName());
    }
}
