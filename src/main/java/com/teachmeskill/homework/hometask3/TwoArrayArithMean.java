package main.java.com.teachmeskill.homework.hometask3;

public class TwoArrayArithMean {
    public static void main(String[] args) {
        double aritnMeanArr1 = 0;
        double aritnMeanArr2 = 0;
        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 15 + 1);
            System.out.print(arr1[i] + " ");
            aritnMeanArr1 += (double) arr1[i] / arr1.length;
        }
        System.out.println("");
        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * 15 + 1);
            System.out.print(arr2[i] + " ");
            aritnMeanArr2 += (double) arr2[i] / arr2.length;
        }
        System.out.println("");
        if (aritnMeanArr1 > aritnMeanArr2) {
            System.out.println("Среднее арифметическое элементов первого массива больше");
        } else if (aritnMeanArr1 < aritnMeanArr2) {
            System.out.println("Среднее арифметическое элементов второго массива больше");
        } else {
            System.out.println("Среднее арифметическое элементов массивов равны");
        }
    }
}