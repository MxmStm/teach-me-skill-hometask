package main.java.com.teachmeskill.homework.hometask_string;

import java.util.Scanner;

public class MaxMinString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите кол-во строк: ");
        int n = Integer.parseInt(input.nextLine());
        System.out.println("Введите текст для указанного кол-ва (" + n + ") строк:");

        String[] line = new String[n];
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < n; i++) {
            line[i] = input.nextLine();
            if (line[i].length() <= line[indexMin].length()) {
                indexMin = i;
            } else if (line[i].length() >= line[indexMax].length()) {
                indexMax = i;
            }
        }

        System.out.println("Самая длинная строка:\n" + line[indexMax] +
                " (Ее длина = " + line[indexMax].length() + ")");
        System.out.println("Самая короткая строка:\n" + line[indexMin] +
                " (Ее длина = " + line[indexMin].length() + ")");
    }
}
