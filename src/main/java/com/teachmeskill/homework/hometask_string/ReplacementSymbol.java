package main.java.com.teachmeskill.homework.hometask_string;

import java.util.Scanner;

public class ReplacementSymbol {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите любое слово: ");
        String line = input.nextLine();

        char symbol0 = line.charAt(0);
        char symbol3 = line.charAt(3);
        String sym0 = String.valueOf(symbol0);
        String sym3 = String.valueOf(symbol3);

        System.out.println(line.replaceAll(sym3, sym0));
    }
}
