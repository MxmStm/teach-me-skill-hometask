package main.java.com.teachmeskill.homework.hometask_interfaces_additional;

public class Trumpet implements MusicInstrument {

    double diameter;

    public Trumpet(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба диаметром " + diameter + " см.");
    }
}
