package main.java.com.teachmeskill.homework.hometask1;

public class Task1 {
    public static void main(String[] args) {
        int switchx = 0;
        long x;

        x = -25; //Ввести число

        if (x == 0) {
            switchx = 0;
        } else if (x < 0 && x > -10) {
            switchx = 1;
        } else if (x > 0 && x < 10) {
            switchx = 2;
        } else if (x < 0 && x > -100) {
            switchx = 3;
        } else if (x > 0 && x < 100) {
            switchx = 4;
        } else if (x < -99) {
            switchx = 5;
        } else if (x > 99) {
            switchx = 6;
        }

        switch (switchx) {
            case 0:
                System.out.println("Это однозначное неотрицательное и неположительное число");
                break;
            case 1:
                System.out.println("Это однозначное отрицательное число");
                break;
            case 2:
                System.out.println("Это однозначное положительное число");
                break;
            case 3:
                System.out.println("Это двухзначное отрицательное число");
                break;
            case 4:
                System.out.println("Это двухзначное положительное число");
                break;
            case 5:
                System.out.println("Это трехзначное и более отрицательное число");
                break;
            case 6:
                System.out.println("Это трехзначное и более положительное число");
                break;
        }
    }
}
