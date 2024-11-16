package TuringAcademyTasks.TasksOfLesson9;

import java.util.Scanner;

public class WeekPlannerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Assignment of array elements.
        String[][] strArr = new String[7][2];

        strArr[0][0] = "monday";
        strArr[0][1] = "Go to the master course; Do tasks; Watch a film.";

        strArr[1][0] = "tuesday";
        strArr[1][1] = "Go to the shop; Go to the gym; Read a book.";

        strArr[2][0] = "wednesday";
        strArr[2][1] = "Watch Breaking Bad next series; Do Turing Academy home tasks.";

        strArr[3][0] = "thursday";
        strArr[3][1] = "Go to the gym; Buy protein powder; Learn to play a new song; Go to Turing Academy.";

        strArr[4][0] = "friday";
        strArr[4][1] = "Draw a picture; Listen to the podcast; Do Turing Academy home tasks.";

        strArr[5][0] = "saturday";
        strArr[5][1] = "Go to Turing Academy; Go to the gym";

        strArr[6][0] = "sunday";
        strArr[6][1] = "Go to Turing Academy; Read a book.";

        System.out.println("Please, input the day of the week:");
        String result;

        //Checking weekly plans per days.
        while (true) {

            String input = sc.nextLine();
            String dayOfWeek = input.trim().toLowerCase();

            if (dayOfWeek.equals("exit")) {

                break;
            } else if ((dayOfWeek).equals("change"+dayOfWeek)) {

                String change = sc.nextLine();
                dayOfWeek = change.trim().toLowerCase();

                switch (dayOfWeek) {

                    case "change monday" -> strArr[0][1] = change;
                    case "change tuesday" -> strArr[1][1] = change;
                    case "change wednesday" -> strArr[2][1] = change;
                    case "change thursday" -> strArr[3][1] = change;
                    case "change friday" -> strArr[4][1] = change;
                    case "change saturday" -> strArr[5][1] = change;
                    case "change sunday" -> strArr[6][1] = change;
                    default -> result = "Enter correct day of the week!";
                }
            }
            switch (dayOfWeek) {

                case "monday" -> result = strArr[0][1];
                case "tuesday" -> result = strArr[1][1];
                case "wednesday" -> result = strArr[2][1];
                case "thursday" -> result = strArr[3][1];
                case "friday" -> result = strArr[4][1];
                case "saturday" -> result = strArr[5][1];
                case "sunday" -> result = strArr[6][1];
                default -> result = "Enter correct day of the week!";
            }
            System.out.println(result);
        }
    }
}