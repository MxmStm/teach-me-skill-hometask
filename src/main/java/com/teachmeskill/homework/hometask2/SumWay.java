package main.java.com.teachmeskill.homework.hometask2;

public class SumWay {
    public static void main(String[] args) {
        double isDistance, is10Percent, isSumDistance;
        int day;

        isDistance = 10; // 10км пробежавшие в первый день
        day = 1;
        isSumDistance = 10;

        do {
            is10Percent = isDistance / 100 * 10;
            isDistance = isDistance + is10Percent;
            isSumDistance = isDistance + isSumDistance; //расстояние за 6 дней + 10км пробежавшие в первый день
            day++;
        } while (day <= 6);
        System.out.println(isSumDistance);
    }
}
