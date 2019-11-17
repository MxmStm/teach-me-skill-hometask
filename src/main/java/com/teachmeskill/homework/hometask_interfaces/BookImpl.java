package main.java.com.teachmeskill.homework.hometask_interfaces;

public class BookImpl implements Printable {

    @Override
    public void print() {
        System.out.println(name);
    }

    String name;

    public BookImpl(String name) {
        this.name = name;
    }

    static void printBook(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof BookImpl) {
                printable[i].print();
            }
        }
    }

    public static void main(String[] args) {
        BookImpl.printBook(MagazineAndBookApp.printable);
    }
}
