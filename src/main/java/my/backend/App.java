package my.backend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    private static final String TERMINATION_WORD = "stop";

    public static void main(String[] args) {
        System.out.println("Hi! I'm a Day of week translator! Please write name of the day in English. To exit print '" + TERMINATION_WORD + "'");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while (true) {
            try {
                input = reader.readLine();
                if (input.equals(TERMINATION_WORD)) {
                    return;
                }
                System.out.println(translateDayOfWeek(input));
            } catch (IOException e) {
                throw new RuntimeException("Failed to read input string");
            }
        }
    }

    private static String translateDayOfWeek(String dayOfWeekRussian) {
        switch (dayOfWeekRussian.toLowerCase()) {
            case "monday":
                return ("Понедельник");
            case "tuesday":
                return ("Вторник");
            case "wednesday":
                return ("Среда");
            case "thursday":
                return ("Четверг");
            case "friday":
                return ("Пятница");
            case "saturday":
                return ("Суббота");
            case "sunday":
                return ("Воскресенье");
            default:
                return "Incorrect input. Please input correct day of week.";
        }
    }
}
