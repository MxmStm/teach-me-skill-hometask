package main.java.com.teachmeskill.homework.hometask_interfaces_additional;

import java.util.Objects;

public class Guitar implements MusicInstrument {

    private int qtyString;

    public Guitar() {
    }

    public Guitar(int qtyString) {
        this.qtyString = qtyString;
    }

    public int getQtyString() {
        return qtyString;
    }

    public void setQtyString(int qtyString) {
        this.qtyString = qtyString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guitar guitar = (Guitar) o;
        return qtyString == guitar.qtyString;
    }

    @Override
    public int hashCode() {
        return Objects.hash(qtyString);
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "qtyString=" + qtyString +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Играет " + qtyString + " струнная гитара.");
    }
}
