package main.java.com.teachmeskill.homework.hometask1;

public class Task4 {
    public static void main(String[] arg) {
        int x, num1, num2, num3;
        x = 0;

        num1 = -3; //Ввести целое число
        num2 = 7; //Ввести целое число
        num3 = 9; //Ввести целое число

        if (num1 > 0) {
            x++;
        }
        if (num2 > 0) {
            x++;
        }
        if (num3 > 0) {
            x++;
        }

        System.out.println("Количество положительных чисел равно " + x);
    }
}
