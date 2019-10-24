package main.java.com.teachmeskill.homework.hometask3;

public class ArrayOddNum {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = j;
            if (j % 2 != 0) {
                System.out.print(arr[j] + " ");
            }
        }
    }
}
