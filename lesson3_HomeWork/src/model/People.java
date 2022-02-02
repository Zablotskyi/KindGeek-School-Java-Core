package model;

import java.util.ArrayList;
import java.util.List;

public class People {
    Application application = new Application();
    List<People> peopleList = new ArrayList<>();
    Taxi taxi = new Taxi();
    private String name;
    private int seat = 1;

    public List<People> getPeopleList() {
        return peopleList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public int getSeat() {
//        return seat;
//    }
//
//    public void setSeat(int seat) {
//        this.seat = seat;
//    }

    public void createDriverAndPassengers(int numberPeople) {
//        int numberPeople = (int) (Math.random() * 4);

        if (taxi.isCall()) {
            for (int i = 0; i < numberPeople; i++) {
                People people = new People();
                people.setName("passenger " + seat);
                seat++;
                peopleList.add(people);
                taxi.setCall(true);
            }
        } else {
            for (int i = 0; i < numberPeople; i++) {
                People people = new People();
                if (i == 0) {
                    people.setName("driver");
                } else {
                    people.setName("passenger " + seat);
                    seat++;
                }
                peopleList.add(people);
                taxi.setCall(false);
            }

            if (peopleList.size() != 0) {
                System.out.println("people who are going to go home:");
                for (int i = 0; i < peopleList.size(); i++) {
                    System.out.println(peopleList.get(i).getName());
                }
            } else {
                System.out.println("no one goes home");
                application.run();
            }
        }
    }
}