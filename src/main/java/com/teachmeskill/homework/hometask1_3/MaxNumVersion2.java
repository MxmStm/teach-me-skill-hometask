package main.java.com.teachmeskill.homework.hometask1_3;

public class MaxNumVersion2 {
    public static void main(String[] args) {
        int value1, value2;

        value1 = 500;
        value2 = 77;

        int isMaxValue = value1 >= value2
                ? value1
                : value2;

        System.out.println("Наибольшее из заданных чисел = " + isMaxValue);
    }
}

