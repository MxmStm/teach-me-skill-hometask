package main.java.com.teachmeskill.homework.hometask4;

import java.util.Scanner;

public class SumEvenElementsOverSideDiagonal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер квадратной матрицы: ");
        int size = input.nextInt();

        int[][] twoDimArr = new int[size][size];
        int sumEvenElement = 0;
        for (int i = 0; i < twoDimArr.length; i++) {
            for (int j = 0; j < twoDimArr[0].length; j++) {
                twoDimArr[i][j] = (int) (Math.random() * 50);
                if (i + j < size - 1 && twoDimArr[i][j] % 2 == 0) {
                    sumEvenElement += twoDimArr[i][j];
                }
                System.out.print(twoDimArr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма четных элементов стоящих над побочной диагональю матрицы =  " + sumEvenElement);
    }
}
