package main.java.com.teachmeskill.homework.hometask_string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplacementOfOccurrence {
    public static void main(String[] args) {

        String regex = "Object-Oriented Programming";

        String string = "Object-Oriented Programming refers to languages that uses objects in programming. " +
                "Object-oriented programming aims to implement real-world entities like inheritance, hiding, " +
                "polymorphism etc in programming. The main aim of object-oriented programming is to bind together " +
                "the data and the functions.";

        String subst = "OOP";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Совпадения: " + matcher.group());
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }

        System.out.println("");
        String result = matcher.replaceAll(subst);
        System.out.println(result);
    }
}
