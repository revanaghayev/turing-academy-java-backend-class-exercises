package TuringAcademyTasks.Eolymp.TasksOfLesson6;

import java.util.Scanner;

public class Task7SeasonApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        switch(number) {
            case 12, 1, 2 -> {
                System.out.print("Winter");
                break;
            }

            case 3, 4, 5 -> {
                System.out.print("Spring");
                break;
            }

            case 6, 7, 8 -> {
                System.out.print("Summer");
                break;
            }

            case 9, 10, 11 -> {
                System.out.print("Autumn");
                break;
            }
        }
    }
}
