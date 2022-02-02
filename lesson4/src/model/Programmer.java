package model;

public class Programmer extends Person implements Salary {

    public Programmer(String firsName, String secondName, int balance) {
        super(firsName, secondName, balance);
    }

    @Override
    public void sayMyJob() {
        System.out.println("I'm programmer");
    }

    @Override
    public void getSalary() {
        setBalance(getBalance() + 3000);
        System.out.println("My balance is " + getBalance() + "$");
    }
}
