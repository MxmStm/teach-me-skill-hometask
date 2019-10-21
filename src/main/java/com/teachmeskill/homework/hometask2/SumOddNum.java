package main.java.com.teachmeskill.homework.hometask2;

public class SumOddNum {
    public static void main(String[] args) {
        int i, n;

        i = 1;
        n = 0;

        do {
            if (i % 2 != 0) {
                n = i + n;
            }
            i++;
        } while (i <= 99);
        System.out.println(n);
    }
}

