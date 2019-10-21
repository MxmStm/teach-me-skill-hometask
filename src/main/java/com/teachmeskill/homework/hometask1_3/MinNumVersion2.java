package main.java.com.teachmeskill.homework.hometask1_3;

public class MinNumVersion2 {
    public static void main(String[] args) {
        int value1, value2;

        value1 = 90;
        value2 = 77;

        int isMinValue = value1 >= value2
                ? value2
                : value1;

            System.out.println("Наименьшее из заданных чисел = " + isMinValue);
    }
}
