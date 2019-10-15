package main.java.com.teachmeskill.homework.hometask1;

public class Task3 {
    public static void main(String[] arg) {
        int num;

        num = 0; //Ввести целое число

        if (num > 0) {
            num = num + 1;
        } else if (num < 0) {
            num = num - 2;
        } else {
            num = 10;
        }
        System.out.println("Полученное число равно " + num);
    }
}
