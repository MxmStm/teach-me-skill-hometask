package main.java.com.teachmeskill.homework.hometask4;

import java.util.Scanner;

public class MultiplicationElementsDiagonals {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер квадратной матрицы: ");
        int size = input.nextInt();

        int multMainDiag = 1;
        int multSideDiag = 1;
        int[][] twoDimArr = new int[size][size];
        for (int i = 0; i < twoDimArr.length; i++) {
            for (int j = 0; j < twoDimArr[0].length; j++) {
                twoDimArr[i][j] = (int) (Math.random() * 50);
                System.out.print(twoDimArr[i][j] + " ");
            }
            System.out.println();
            multMainDiag = multMainDiag * twoDimArr[i][i];
            multSideDiag = multSideDiag * twoDimArr[i][size - 1 - i];
        }
        if (multMainDiag > multSideDiag) {
            System.out.println("Произведение элементов главной диагонали матрицы больше, чем побочной.");
        } else if (multMainDiag < multSideDiag) {
            System.out.println("Произведение элементов побочной диагонали матрицы больше, чем главной.");
        } else {
            System.out.println("Произведения элементов главной и побочной матрицы равны.");
        }
    }
}
