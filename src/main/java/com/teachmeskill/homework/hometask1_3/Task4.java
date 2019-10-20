package main.java.com.teachmeskill.homework.hometask1_3;

public class Task4 {
    public static void main(String[] args) {
        double num1, num2;

        num1 = 19.5;
        num2 = 15.6175;

        System.out.println("Округление числа " + num1 + " в большую сторону = " + Math.ceil(num1));
        System.out.println("Округление числа " + num1 + " в меньшую сторону = " + Math.floor(num1));
        System.out.println("Округление числа " + num2 + " c точностью до сотых = " + Math.rint(num2 * 100) / 100);
    }
}
