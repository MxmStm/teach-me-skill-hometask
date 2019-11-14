package main.java.com.teachmeskill.homework.hometask_inheritance;

import java.util.Objects;
import java.util.Scanner;

public class Military extends Air {

    private boolean availabilityBailoutSystem;
    private int qtyRocketAboard;

    public Military() {
    }

    public Military(boolean availabilityBailoutSystem, int qtyRocketAboard) {
        this.availabilityBailoutSystem = availabilityBailoutSystem;
        this.qtyRocketAboard = qtyRocketAboard;
    }

    public Military(double wingspan, int minLengthRunway, boolean availabilityBailoutSystem, int qtyRocketAboard) {
        super(wingspan, minLengthRunway);
        this.availabilityBailoutSystem = availabilityBailoutSystem;
        this.qtyRocketAboard = qtyRocketAboard;
    }

    public Military(int power, int speedMax, int weight, String brand, double wingspan, int minLengthRunway, boolean availabilityBailoutSystem, int qtyRocketAboard) {
        super(power, speedMax, weight, brand, wingspan, minLengthRunway);
        this.availabilityBailoutSystem = availabilityBailoutSystem;
        this.qtyRocketAboard = qtyRocketAboard;
    }

    public boolean isAvailabilityBailoutSystem() {
        return availabilityBailoutSystem;
    }

    public void setAvailabilityBailoutSystem(boolean availabilityBailoutSystem) {
        this.availabilityBailoutSystem = availabilityBailoutSystem;
    }

    public int getQtyRocketAboard() {
        return qtyRocketAboard;
    }

    public void setQtyRocketAboard(int qtyRocketAboard) {
        this.qtyRocketAboard = qtyRocketAboard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Military military = (Military) o;
        return availabilityBailoutSystem == military.availabilityBailoutSystem &&
                qtyRocketAboard == military.qtyRocketAboard;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), availabilityBailoutSystem, qtyRocketAboard);
    }

    @Override
    public String toString() {
        return "Military{" +
                "availabilityBailoutSystem=" + availabilityBailoutSystem +
                ", qtyRocketAboard=" + qtyRocketAboard +
                '}';
    }

    void objectDescriptionPass() {
        System.out.print(getPower() + " л.с. или ");
        System.out.print(kWPower() + " кВт, ");
        System.out.print(getSpeedMax() + " км/ч, ");
        System.out.print(getWeight() + " кг, ");
        System.out.print(getBrand() + ", ");
        System.out.print(getWingspan() + " м, ");
        System.out.print(getMinLengthRunway() + " м, ");
        System.out.print(isAvailabilityBailoutSystem() + " , ");
        System.out.print(getQtyRocketAboard() + " ракет");
    }

    double kWPower() {
        double kW = getPower() * 0.74;
        return kW;
    }

    void shot() {
        if (getQtyRocketAboard() != 0) {
            System.out.println("Ракета пошла.");
        } else {
            System.out.println("Боеприпасы отсутствуют.");
        }
    }

    void bailout() {
        if (isAvailabilityBailoutSystem()) {
            System.out.println("Катапультирование прошло успешно.");
        } else {
            System.out.println("У вас нет такой системы.");
        }
    }

    public static void main(String[] args) {
        Military airplane = new Military(38000, 2440, 18400, "Су-35", 14.75, 650, true, 12);
        airplane.objectDescriptionPass();
        System.out.println();
        airplane.shot();
        airplane.bailout();
    }
}
