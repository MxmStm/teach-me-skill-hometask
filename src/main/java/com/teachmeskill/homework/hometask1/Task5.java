package main.java.com.teachmeskill.homework.hometask1;

public class Task5 {
    public static void main(String[] arg) {
        int x, y, num1, num2, num3;
        x = 0;
        y = 0;

        num1 = 1; //Ввести целое число
        num2 = -15; //Ввести целое число
        num3 = 18; //Ввести целое число

        if (num1 > 0) {
            x++;
        } else if (num1 < 0) {
            y++;
        } else {
            x = x;
            y = y;
        }
        if (num2 > 0) {
            x++;
        } else if (num2 < 0) {
            y++;
        } else {
            x = x;
            y = y;
        }
        if (num3 > 0) {
            x++;
        } else if (num3 < 0) {
            y++;
        } else {
            x = x;
            y = y;
        }

        System.out.println("Количество положительных чисел равно " + x);
        System.out.println("Количество отрицательных чисел равно " + y);
    }
}
