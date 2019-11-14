package main.java.com.teachmeskill.homework.hometask_inheritance;

import java.util.Objects;

public class Air extends Transport {

    private double wingspan;
    private int minLengthRunway;

    public Air() {
    }

    public Air(double wingspan, int minLengthRunway) {
        this.wingspan = wingspan;
        this.minLengthRunway = minLengthRunway;
    }

    public Air(int power, int speedMax, int weight, String brand, double wingspan, int minLengthRunway) {
        super(power, speedMax, weight, brand);
        this.wingspan = wingspan;
        this.minLengthRunway = minLengthRunway;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinLengthRunway() {
        return minLengthRunway;
    }

    public void setMinLengthRunway(int minLengthRunway) {
        this.minLengthRunway = minLengthRunway;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Air air = (Air) o;
        return wingspan == air.wingspan &&
                minLengthRunway == air.minLengthRunway;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wingspan, minLengthRunway);
    }

    @Override
    public String toString() {
        return "Air{" +
                "wingspan=" + wingspan +
                ", minLengthRunway=" + minLengthRunway +
                '}';
    }
}
