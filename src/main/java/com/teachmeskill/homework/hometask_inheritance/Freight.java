package main.java.com.teachmeskill.homework.hometask_inheritance;

import java.util.Objects;
import java.util.Scanner;

public class Freight extends Ground {

    private int carryingCapacity;

    public Freight() {
    }

    public Freight(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public Freight(int qtyWheel, int fuelConsumption, int carryingCapacity) {
        super(qtyWheel, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    public Freight(int power, int speedMax, int weight, String brand, int qtyWheel, double fuelConsumption, int carryingCapacity) {
        super(power, speedMax, weight, brand, qtyWheel, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Freight freight = (Freight) o;
        return carryingCapacity == freight.carryingCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carryingCapacity);
    }

    @Override
    public String toString() {
        return "Freight{" +
                "carryingCapacity=" + carryingCapacity +
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
        System.out.print(getCarryingCapacity() + " т");
    }

    double kWPower() {
        double kW = getPower() * 0.74;
        return kW;
    }

    void loading() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите вес (в тоннах) груза: ");
        double cargo = input.nextDouble();
        if (cargo <= getCarryingCapacity()) {
            System.out.println("Грузовик загружен.");
        } else {
            System.out.println("Вам нужен грузовик побольше.");
        }
    }

    public static void main(String[] args) {
        Freight auto = new Freight(400, 120, 8190, "Scania", 4, 25, 19);
        auto.objectDescriptionPass();
        System.out.println();
        auto.loading();
    }
}
