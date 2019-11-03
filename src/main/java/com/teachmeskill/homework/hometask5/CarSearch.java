package main.java.com.teachmeskill.homework.hometask5;

import java.util.Scanner;

public class CarSearch {

    public static void searchBrandCar(Car[] arrCar) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите марку автомобиля: ");
        String myBrand = in.nextLine();
        for (Car i : arrCar) {
            if (i.getBrand().equals(myBrand)) {
                System.out.print(i.getId() + " ");
                System.out.print(i.getBrand() + " ");
                System.out.print(i.getModel() + " ");
                System.out.print(i.getYearOfIssue() + "г. ");
                System.out.print(i.getColor() + " ");
                System.out.print(i.getPrice() + "$ ");
                System.out.println(i.getRegistrationNum() + " ");
            }
        }
    }

    public static void searchModelAndTimeExploitationCar(Car[] arrCar) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите модель автомобиля: ");
        String myModel = in.nextLine();
        System.out.print("Эксплуатируется больше(указать кол-во лет): ");
        int myYear = in.nextInt();
        int currentYear = 2019;
        for (Car i : arrCar) {
            if (i.getModel().equals(myModel) && i.getYearOfIssue() < currentYear - myYear) {
                System.out.print(i.getId() + " ");
                System.out.print(i.getBrand() + " ");
                System.out.print(i.getModel() + " ");
                System.out.print(i.getYearOfIssue() + "г. ");
                System.out.print(i.getColor() + " ");
                System.out.print(i.getPrice() + "$ ");
                System.out.println(i.getRegistrationNum() + " ");
            }
        }
    }

    public static void searchYearOfIssueAndPrice(Car[] arrCar) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год выпуска автомобиля: ");
        int myYearOfIssue = in.nextInt();
        System.out.print("Цена($) больше: ");
        int myPrice = in.nextInt();
        for (Car i : arrCar) {
            if (i.getYearOfIssue() == myYearOfIssue && i.getPrice() > myPrice) {
                System.out.print(i.getId() + " ");
                System.out.print(i.getBrand() + " ");
                System.out.print(i.getModel() + " ");
                System.out.print(i.getYearOfIssue() + "г. ");
                System.out.print(i.getColor() + " ");
                System.out.print(i.getPrice() + "$ ");
                System.out.println(i.getRegistrationNum() + " ");
            }
        }
    }
}
