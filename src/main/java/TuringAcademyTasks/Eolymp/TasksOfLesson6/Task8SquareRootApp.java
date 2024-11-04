package TuringAcademyTasks.Eolymp.TasksOfLesson6;

import java.util.Scanner;

public class Task8SquareRootApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int sum = (number / 100) + (number % 10) + ((number / 10) - (number / 100));

        System.out.printf("%.3f",Math.sqrt(sum));
    }
}