package main.java.com.teachmeskill.homework.hometask_string;

import java.util.Scanner;

public class HalfWordMerger {

    void firstWayMerger() {

        Scanner input = new Scanner(System.in);
        System.out.println("Способ первый:");
        System.out.print("Введите первое слово состоящее из четного кол-ва букв: ");
        String firstWord = input.nextLine();
        System.out.print("Введите второе слово состоящее из четного кол-ва букв: ");
        String secondWord = input.nextLine();

        System.out.println("Итоговое слово в результате слияния половин двух слов: " +
                firstWord.substring(0, firstWord.length() / 2) +
                secondWord.substring(secondWord.length() / 2, secondWord.length()));
    }

    void secondWayMerger() {

        Scanner input = new Scanner(System.in);
        System.out.println("Способ второй:");
        System.out.print("Введите первое слово состоящее из четного кол-ва букв: ");
        String firstWord = input.nextLine();
        System.out.print("Введите второе слово состоящее из четного кол-ва букв: ");
        String secondWord = input.nextLine();

        StringBuffer firstWordStrBuf = new StringBuffer(firstWord);
        StringBuffer secondWordStrBuf = new StringBuffer(secondWord);

        int halfFirstWord = firstWordStrBuf.length() / 2;
        int halfSecondWord = secondWordStrBuf.length() / 2;

        System.out.println("Итоговое слово в результате слияния половин двух слов: " +
                firstWordStrBuf.delete(halfFirstWord, firstWordStrBuf.length()) +
                secondWordStrBuf.delete(0, halfSecondWord));
    }

    public static void main(String[] args) {

        HalfWordMerger finalWord = new HalfWordMerger();
        finalWord.firstWayMerger();
        finalWord.secondWayMerger();
    }
}
