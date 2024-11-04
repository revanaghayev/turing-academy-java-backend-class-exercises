package TuringAcademyTasks.Eolymp.TasksOfLesson6;

import java.util.Scanner;
public class Task9SumOfDigitsApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.print(number/1000 + number%10);
    }
}
