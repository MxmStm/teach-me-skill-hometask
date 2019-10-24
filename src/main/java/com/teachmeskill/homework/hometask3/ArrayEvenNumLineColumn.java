package main.java.com.teachmeskill.homework.hometask3;

public class ArrayEvenNumLineColumn {
    public static void main(String[] args) {
        int[] arr = new int[21];
        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("");
        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
