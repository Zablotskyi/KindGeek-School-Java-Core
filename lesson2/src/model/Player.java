package model;

public class Player extends Person {
    public int number;

    public Player() {
    }

    public Player(int number) {
        this.number = number;
    }

    public Player(String name, int age, int number) {
        super(name, age);
        this.number = number;
    }

    @Override
    public void sayName() {
        System.out.println("I'm player and my name is " + this.getName());
    }


    public void gol() {
        System.out.println("GOOOL!!!");
    }

    public void gol(int countOfGoals) {
        System.out.println("GOALS: " + countOfGoals);
    }
}
