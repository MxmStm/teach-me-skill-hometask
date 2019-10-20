package main.java.com.teachmeskill.homework.hometask1_3;

public class Task2_2 {
    public static void main(String[] args) {
        int value1, value2;

        value1 = 90;
        value2 = 77;

        boolean x = value1 > value2;
        boolean y = value1 < value2;

        if (x) {
            System.out.println("Наименьшее из заданных чисел = " + value2);
        } else if (y) {
            System.out.println("Наименьшее из заданных чисел = " + value1);
        }
    }
}
