package main.java.com.teachmeskill.homework.hometask1;

public class Task7 {
    public static void main(String[] arg) {
        int x, n, y;
        x = 0;
        y = 0;

        n = 11; //Ввести количество программистов

        if (n < 20) {
            y = n;
        } else if (n > 20 && n < 100) {
            y = n % 10;
        } else if (n > 100) {
            y = n % 100;
        }

        if (y == 1) {
            x = 0;
        } else if (y > 1 && y < 5) {
            x = 1;
        } else if (y == 0 || y > 4 && y < 21) {
            x = 2;
        }

        switch (x) {
            case 0:
                System.out.println(n + " программист");
                break;
            case 1:
                System.out.println(n + " программиста");
                break;
            case 2:
                System.out.println(n + " программистов");
                break;
        }
    }
}
