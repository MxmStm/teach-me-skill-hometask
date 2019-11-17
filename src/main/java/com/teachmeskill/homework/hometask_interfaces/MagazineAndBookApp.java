package main.java.com.teachmeskill.homework.hometask_interfaces;

public class MagazineAndBookApp {
    static Printable[] printable = {
            new BookImpl("Сияние"),
            new MagazineImpl("CHIP"),
            new BookImpl("Доктор Сон"),
            new MagazineImpl("Охота и рыбалка"),
            new MagazineImpl("Популярная механика"),
            new BookImpl("Три товарища")
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
