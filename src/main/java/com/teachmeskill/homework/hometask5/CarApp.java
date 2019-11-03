package main.java.com.teachmeskill.homework.hometask5;

import java.util.Scanner;

public class CarApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Варианты вывода списка автомобилей: ");
        System.out.println("1. Список автомобилей заданной марки.");
        System.out.println("2. Список автомобилей заданной модели, которые эксплуатируются больше указанных лет.");
        System.out.println("3. Список автомобилей заданного года выпуска, цена которых больше указанной.");
        System.out.print("Выберите вариант: ");
        int variant = input.nextInt();

        switch (variant) {
            case 1:
                CarSearch.searchBrandCar(CarDataBase.arrCar);
                break;
            case 2:
                CarSearch.searchModelAndTimeExploitationCar(CarDataBase.arrCar);
                break;
            case 3:
                CarSearch.searchYearOfIssueAndPrice(CarDataBase.arrCar);
                break;
        }
    }
}