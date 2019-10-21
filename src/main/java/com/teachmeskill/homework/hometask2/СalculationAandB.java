package main.java.com.teachmeskill.homework.hometask2;

public class СalculationAandB {
    public static void main(String[] args) {
        int isA, isB, result;

        isA = 5;
        isB = 1;
        result = 0;

        do {
            result = isA + result;
            isB++;
        } while (isB <= 9);
        System.out.println(result);
    }
}


