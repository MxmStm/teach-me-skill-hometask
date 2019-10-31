package main.java.com.teachmeskill.homework.hometask4;

public class TwoDimArrayZeroOne {
    public static void main(String[] args) {
        int[][] twoDimArr = new int[3][4];
        for (int i = 0; i < twoDimArr.length; i++) {
            for (int j = 0; j < twoDimArr[0].length; j++) {
                twoDimArr[0][0] = 1;
                twoDimArr[0][3] = 1;
                twoDimArr[2][0] = 1;
                twoDimArr[2][3] = 1;
                System.out.print(twoDimArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
