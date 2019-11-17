package main.java.com.teachmeskill.homework.hometask_interfaces_additional;

public class DrumImpl implements MusicInstrument {

    @Override
    public void play() {
        System.out.println("Играет барабан размером " + diameter + "х" + depth + " дюймов.");
    }

    double diameter;
    double depth;

    public DrumImpl(double diameter, double depth) {
        this.diameter = diameter;
        this.depth = depth;
    }
}
