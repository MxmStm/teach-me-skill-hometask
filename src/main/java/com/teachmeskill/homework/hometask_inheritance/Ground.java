package main.java.com.teachmeskill.homework.hometask_inheritance;

import java.util.Objects;

public class Ground extends Transport {

    private int qtyWheel;
    private double fuelConsumption;

    public Ground() {
    }

    public Ground(int qtyWheel, double fuelConsumption) {
        this.qtyWheel = qtyWheel;
        this.fuelConsumption = fuelConsumption;
    }

    public Ground(int power, int speedMax, int weight, String brand, int qtyWheel, double fuelConsumption) {
        super(power, speedMax, weight, brand);
        this.qtyWheel = qtyWheel;
        this.fuelConsumption = fuelConsumption;
    }

    public int getQtyWheel() {
        return qtyWheel;
    }

    public void setQtyWheel(int qtyWheel) {
        this.qtyWheel = qtyWheel;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ground ground = (Ground) o;
        return qtyWheel == ground.qtyWheel &&
                fuelConsumption == ground.fuelConsumption;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), qtyWheel, fuelConsumption);
    }

    @Override
    public String toString() {
        return "Ground{" +
                "qtyWheel=" + qtyWheel +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }
}
