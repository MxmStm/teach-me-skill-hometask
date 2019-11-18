package main.java.com.teachmeskill.homework.hometask_interfaces;

public class Book implements Printable {

    String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    static void printBook(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof Book) {
                printable[i].print();
            }
        }
    }

    public static void main(String[] args) {
        Book.printBook(MagazineAndBookApp.printable);
    }
}
