package model;

public class Taxi {
    private int countTrips = 0;
    private boolean call = false;

    public boolean isCall() {
        return call;
    }

    public void setCall(boolean call) {
        this.call = call;
    }

    public void createTaxi() {
        Car car = new Car();
        Taxi taxi = new Taxi();
        long wait = (long) (Math.random() * 1_000_000);

        if (wait > 500_000) {
            System.out.println("we don't want to wait so long, call Vasyl");
            car.createCar();
            call = false;
        }
        call = true;
        countTrips++;
    }
}
