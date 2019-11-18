package main.java.com.teachmeskill.homework.hometask_interfaces_additional;

public class Drum implements MusicInstrument {

    double diameter;
    double depth;

    public Drum(double diameter, double depth) {
        this.diameter = diameter;
        this.depth = depth;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан размером " + diameter + "х" + depth + " дюймов.");
    }
}
