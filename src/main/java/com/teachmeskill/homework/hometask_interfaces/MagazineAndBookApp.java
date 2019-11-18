package main.java.com.teachmeskill.homework.hometask_interfaces;

public class MagazineAndBookApp {

    static Printable[] printable = {
            new Book("Сияние"),
            new Magazine("CHIP"),
            new Book("Доктор Сон"),
            new Magazine("Охота и рыбалка"),
            new Magazine("Популярная механика"),
            new Book("Три товарища")
    };

    static void printMagazineAndBook(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            printable[i].print();
        }
    }

    public static void main(String[] args) {
        MagazineAndBookApp.printMagazineAndBook(printable);
    }
}
