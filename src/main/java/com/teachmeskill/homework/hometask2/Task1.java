package main.java.com.teachmeskill.homework.hometask2;

public class Task1 {
    public static void main(String[] args) {
        double s, d, i, result;

        s = 10; // расстояние в первый день
        d = 1;
        result = 0;

        do {
            i = s / 100 * 10;
            s = s + i;
            result = s + result;
            d++;
        } while (d <= 7);
        System.out.println(result);
    }
}
