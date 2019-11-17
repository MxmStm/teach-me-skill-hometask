package main.java.com.teachmeskill.homework.hometask_interfaces_additional;

public class GuitarImpl implements MusicInstrument {

    @Override
    public void play() {
        System.out.println("Играет " + qtyString + " струнная гитара.");
    }

    int qtyString;

    public GuitarImpl(int qtyString) {
        this.qtyString = qtyString;
    }
}
