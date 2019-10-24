package main.java.com.teachmeskill.homework.hometask3;

public class ArrayQuantityEvenElement {
    public static void main(String[] args) {
        int qtyEven = 0;
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 99 + 1);
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0) {
                qtyEven++;
            }
        }
        System.out.println("");
        System.out.println("Кол-во четных элементов массива = " + qtyEven);
    }
}
