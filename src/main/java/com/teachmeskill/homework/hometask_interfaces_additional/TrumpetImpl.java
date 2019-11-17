package main.java.com.teachmeskill.homework.hometask_interfaces_additional;

public class TrumpetImpl implements MusicInstrument {

    @Override
    public void play() {
        System.out.println("Играет труба диаметром " + diameter + " см.");
    }

    double diameter;

    public TrumpetImpl(double diameter) {
        this.diameter = diameter;
    }
}
