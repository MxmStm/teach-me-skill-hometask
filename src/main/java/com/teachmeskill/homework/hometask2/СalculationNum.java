package main.java.com.teachmeskill.homework.hometask2;

public class СalculationNum {
    public static void main(String[] args) {

        int x = 1;
        int y = 1;

        do {
            x = x * 2;
            y = y + x;
        } while (x <= 256);
        System.out.println(y);
    }
}
