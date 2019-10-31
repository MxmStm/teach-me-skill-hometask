package main.java.com.teachmeskill.homework.hometask4;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер квадратной матрицы: ");
        int size = input.nextInt();

        int[][] twoDimArr = new int[size][size];
        for (int i = 0; i < twoDimArr.length; i++) {
            for (int j = 0; j < twoDimArr[0].length; j++) {
                twoDimArr[i][j] = (int) (Math.random() * 50);
                System.out.print(twoDimArr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Транспонированная матрица:");
        for (int i = 0; i < twoDimArr.length; i++) {
            for (int j = i + 1; j < twoDimArr[0].length; j++) {
                int temp = twoDimArr[i][j];
                twoDimArr[i][j] = twoDimArr[j][i];
                twoDimArr[j][i] = temp;
            }
        }
        for (int i = 0; i < twoDimArr.length; i++) {
            for (int j = 0; j < twoDimArr[0].length; j++) {
                System.out.print(twoDimArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
