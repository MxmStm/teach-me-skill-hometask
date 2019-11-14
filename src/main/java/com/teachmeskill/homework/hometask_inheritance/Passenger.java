package main.java.com.teachmeskill.homework.hometask_inheritance;

import java.util.Objects;
import java.util.Scanner;

public class Passenger extends Ground {

    private String bodyType;
    private int qtyPassenger;

    public Passenger() {
    }

    public Passenger(String bodyType, int qtyPassenger) {
        this.bodyType = bodyType;
        this.qtyPassenger = qtyPassenger;
    }

    public Passenger(int qtyWheel, double fuelConsumption, String bodyType, int qtyPassenger) {
        super(qtyWheel, fuelConsumption);
        this.bodyType = bodyType;
        this.qtyPassenger = qtyPassenger;
    }

    public Passenger(int power, int speedMax, int weight, String brand, int qtyWheel, double fuelConsumption, String bodyType, int qtyPassenger) {
        super(power, speedMax, weight, brand, qtyWheel, fuelConsumption);
        this.bodyType = bodyType;
        this.qtyPassenger = qtyPassenger;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getQtyPassenger() {
        return qtyPassenger;
    }

    public void setQtyPassenger(int qtyPassenger) {
        this.qtyPassenger = qtyPassenger;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Passenger passenger = (Passenger) o;
        return qtyPassenger == passenger.qtyPassenger &&
                Objects.equals(bodyType, passenger.bodyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bodyType, qtyPassenger);
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "bodyType='" + bodyType + '\'' +
                ", qtyPassenger=" + qtyPassenger +
                '}';
    }

    void objectDescriptionPass() {
        System.out.print(getPower() + " л.с. или ");
        System.out.print(kWPower() + " кВт, ");
        System.out.print(getSpeedMax() + " км/ч, ");
        System.out.print(getWeight() + " кг, ");
        System.out.print(getBrand() + ", ");
        System.out.print(getQtyWheel() + " колеса, ");
        System.out.print(getFuelConsumption() + " л/100км, ");
        System.out.print("тип кузова: " + getBodyType() + ", ");
        System.out.print("кол-во пассажиров: " + getQtyPassenger());
    }

    double kWPower() {
        double kW = getPower() * 0.74;
        return kW;
    }


    void distance() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите время (в часах), в течение которого движется автомобиль с максимальной скоростью: ");
        double time = input.nextDouble();
        double dist = getSpeedMax() * time;
        System.out.println("За время " + time + " ч, автомобиль " + getBrand() + " двигаясь с максимальной скоростью " +
                getSpeedMax() + " км/ч " + "проедет " + dist + " км и израсходует " + dist * fuelDistance() + " литров топлива.");
    }

    private double fuelDistance() {
        double fuel = getFuelConsumption() / 100;
        return fuel;
    }

    public static void main(String[] args) {
        Passenger auto = new Passenger(313, 250, 1534, "Nissan", 4, 11.4, "Coupe", 2);
        auto.objectDescriptionPass();
        System.out.println();
        auto.distance();
    }
}
