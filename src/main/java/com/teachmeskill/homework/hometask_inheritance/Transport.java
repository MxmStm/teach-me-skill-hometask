package main.java.com.teachmeskill.homework.hometask_inheritance;

import java.util.Objects;

public class Transport {

    private int power;
    private int speedMax;
    private int weight;
    private String brand;

    public Transport() {
    }

    public Transport(int power, int speedMax, int weight, String brand) {
        this.power = power;
        this.speedMax = speedMax;
        this.weight = weight;
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public int getWeight() {
        return weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setSpeedMax(int speedMax) {
        this.speedMax = speedMax;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return power == transport.power &&
                speedMax == transport.speedMax &&
                weight == transport.weight &&
                Objects.equals(brand, transport.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, speedMax, weight, brand);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "power=" + power +
                ", speedMax=" + speedMax +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }
}
