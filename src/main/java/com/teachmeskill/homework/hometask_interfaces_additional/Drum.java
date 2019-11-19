package main.java.com.teachmeskill.homework.hometask_interfaces_additional;

import java.util.Objects;

public class Drum implements MusicInstrument {

    private double diameter;
    private double depth;

    public Drum() {
    }

    public Drum(double diameter, double depth) {
        this.diameter = diameter;
        this.depth = depth;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drum drum = (Drum) o;
        return Double.compare(drum.diameter, diameter) == 0 &&
                Double.compare(drum.depth, depth) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diameter, depth);
    }

    @Override
    public String toString() {
        return "Drum{" +
                "diameter=" + diameter +
                ", depth=" + depth +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Играет барабан размером " + diameter + "х" + depth + " дюймов.");
    }
}
