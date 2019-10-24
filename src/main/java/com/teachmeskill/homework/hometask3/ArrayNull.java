package main.java.com.teachmeskill.homework.hometask3;

import java.util.Arrays;

public class ArrayNull {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i == 9) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
