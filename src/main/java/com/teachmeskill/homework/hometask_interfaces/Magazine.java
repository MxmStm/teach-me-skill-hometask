package main.java.com.teachmeskill.homework.hometask_interfaces;

public class Magazine implements Printable {

    String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    static void printMagazine(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof Magazine) {
                printable[i].print();
            }
        }
    }

    public static void main(String[] args) {
        Magazine.printMagazine(MagazineAndBookApp.printable);
    }
}
