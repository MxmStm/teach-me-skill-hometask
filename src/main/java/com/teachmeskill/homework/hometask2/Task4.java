package main.java.com.teachmeskill.homework.hometask2;

public class Task4 {
    public static void main(String[] args) {
        int A, B, result;

        A = 5;
        B = 1;
        result = 0;

        do {
            result = A + result;
            B++;
        } while (B <= 9);
        System.out.println(result);
    }
}


