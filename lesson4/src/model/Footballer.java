package model;

public class Footballer extends Person implements Salary {

    public Footballer(String firsName, String secondName, int balance) {
        super(firsName, secondName, balance);
    }

    @Override
    public void sayMyJob() {
        System.out.println("I'm footballer");
    }

    @Override
    public void getSalary() {
        setBalance(getBalance() + 1000);
        System.out.println("I'm footballer and my balance is " + getBalance() + "$");
    }
}
