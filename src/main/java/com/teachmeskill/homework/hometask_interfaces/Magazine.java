package main.java.com.teachmeskill.homework.hometask_interfaces;

import java.util.Objects;

public class Magazine implements Printable {

    private String name;

    public Magazine() {
    }

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(name, magazine.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
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
