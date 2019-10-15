package main.java.com.teachmeskill.homework.hometask1;

public class Task2 {
    public static void main(String[] arg) {
        int a, b, c;

        a = 5; //Задать длину стороны треугольника
        b = 15; //Задать длину стороны треугольника
        c = 25; //Задать длину стороны треугольника

        boolean condition = a + b > c && a + c > b && b + c > a;

        if (condition) {
            System.out.println("Треугольник c такими сторонами существует");
        } else {
            System.out.println("Треугольника с такими сторонами не существует");
        }
    }
}
