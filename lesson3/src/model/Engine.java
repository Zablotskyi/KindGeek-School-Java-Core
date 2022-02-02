package model;

public class Engine {

    private String type;

    private int volume;

    private boolean isStarted = false;

    public Engine(String type, int volume) {
        this.type = type;
        this.volume = volume;
    }

    public boolean startEngine() {
        if(isStarted){
            System.out.println("Engine is already started.");
            return isStarted;
        }
        isStarted = true;
        System.out.println("Engine is started.");
        return isStarted;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public void setStarted(boolean started) {
        isStarted = started;
    }
}
