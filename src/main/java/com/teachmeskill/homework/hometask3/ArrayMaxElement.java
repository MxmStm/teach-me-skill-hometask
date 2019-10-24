package main.java.com.teachmeskill.homework.hometask3;

public class ArrayMaxElement {
    public static void main(String[] args) {
        int maxEl = 0;
        int indexForMaxEl = 0;
        int[] arr = new int[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 15 + 1);
            if (maxEl <= arr[i]) {
                maxEl = arr[i];
                indexForMaxEl = i;
            }
        }
        System.out.println("Индекс последнего вхождения в массив максимального элемента = " + indexForMaxEl);
    }
}
