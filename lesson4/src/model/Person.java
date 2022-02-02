package model;

public abstract class Person {
    public static final String ID = "12345678";
    private String firsName;
    private String secondName;
    private int balance;

    public abstract void sayMyJob();

    public Person(String firsName, String secondName, int balance) {
        this.firsName = firsName;
        this.secondName = secondName;
        this.balance = balance;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
