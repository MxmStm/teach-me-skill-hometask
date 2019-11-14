package main.java.com.teachmeskill.homework.hometask_inheritance;

import java.util.Objects;
import java.util.Scanner;

public class Civic extends Air {

    private int qtyPassenger;
    private boolean availabilityBusinessClass;

    public Civic() {
    }

    public Civic(int qtyPassenger, boolean availabilityBusinessClass) {
        this.qtyPassenger = qtyPassenger;
        this.availabilityBusinessClass = availabilityBusinessClass;
    }

    public Civic(double wingspan, int minLengthRunway, int qtyPassenger, boolean availabilityBusinessClass) {
        super(wingspan, minLengthRunway);
        this.qtyPassenger = qtyPassenger;
        this.availabilityBusinessClass = availabilityBusinessClass;
    }

    public Civic(int power, int speedMax, int weight, String brand, double wingspan, int minLengthRunway, int qtyPassenger, boolean availabilityBusinessClass) {
        super(power, speedMax, weight, brand, wingspan, minLengthRunway);
        this.qtyPassenger = qtyPassenger;
        this.availabilityBusinessClass = availabilityBusinessClass;
    }

    public int getQtyPassenger() {
        return qtyPassenger;
    }

    public void setQtyPassenger(int qtyPassenger) {
        this.qtyPassenger = qtyPassenger;
    }

    public boolean isAvailabilityBusinessClass() {
        return availabilityBusinessClass;
    }

    public void setAvailabilityBusinessClass(boolean availabilityBusinessClass) {
        this.availabilityBusinessClass = availabilityBusinessClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Civic civic = (Civic) o;
        return qtyPassenger == civic.qtyPassenger &&
                availabilityBusinessClass == civic.availabilityBusinessClass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), qtyPassenger, availabilityBusinessClass);
    }

    @Override
    public String toString() {
        return "Civic{" +
                "qtyPassenger=" + qtyPassenger +
                ", availabilityBusinessClass=" + availabilityBusinessClass +
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
        System.out.print(getQtyPassenger() + " пассажиров, ");
        System.out.print(isAvailabilityBusinessClass());
    }

    double kWPower() {
        double kW = getPower() * 0.74;
        return kW;
    }

    void capacity() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите кол-во пассажиров: ");
        double enterQty = input.nextDouble();
        if (enterQty <= getQtyPassenger()) {
            System.out.println("Самолет загружен.");
        } else {
            System.out.println("Вам нужен самолет побольше.");
        }
    }

    public static void main(String[] args) {
        Civic airplane = new Civic(88000, 945, 155500, "Boeing", 60.9, 3700, 550, true);
        airplane.objectDescriptionPass();
        System.out.println();
        airplane.capacity();
    }
}
