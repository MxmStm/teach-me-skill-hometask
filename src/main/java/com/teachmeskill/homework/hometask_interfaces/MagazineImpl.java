package main.java.com.teachmeskill.homework.hometask_interfaces;

public class MagazineImpl implements Printable {

    @Override
    public void print() {
        System.out.println(name);
    }

    String name;

    public MagazineImpl(String name) {
        this.name = name;
    }

    static void printMagazine(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            if (printable[i] instanceof MagazineImpl) {
                printable[i].print();
            }
        }
    }

    public static void main(String[] args) {
        MagazineImpl.printMagazine(MagazineAndBookApp.printable);
    }
}
