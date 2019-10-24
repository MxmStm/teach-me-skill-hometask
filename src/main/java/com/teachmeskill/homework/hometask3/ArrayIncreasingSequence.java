package main.java.com.teachmeskill.homework.hometask3;

public class ArrayIncreasingSequence {
    public static void main(String[] args) {
        int[] arr = new int[4];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = (int) (Math.random() * 10 + 1);
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
        boolean incSeq = true;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j + 1] <= arr[j]) {
                incSeq = false;
                break;
            }
        }
        if (incSeq) {
            System.out.println("Данный массив является возрастающей последовательностью");
        } else {
            System.out.println("Данный массив не является возрастающей последовательностью");
        }
    }
}
