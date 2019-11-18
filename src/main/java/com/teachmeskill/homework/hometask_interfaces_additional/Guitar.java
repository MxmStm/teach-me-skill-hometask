package main.java.com.teachmeskill.homework.hometask_interfaces_additional;

public class Guitar implements MusicInstrument {

    int qtyString;

    public Guitar(int qtyString) {
        this.qtyString = qtyString;
    }

    @Override
    public void play() {
        System.out.println("Играет " + qtyString + " струнная гитара.");
    }
}
