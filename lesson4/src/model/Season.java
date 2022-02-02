package model;

public enum Season {
    WINTER(0), SPRING(10), SUMMER(19), AUTUMN(8);

    private int avgT;

    Season(int avgT) {
        this.avgT = avgT;
    }

    public int getAvgT() {
        return avgT;
//        System.out.println(avgT);
    }
}
