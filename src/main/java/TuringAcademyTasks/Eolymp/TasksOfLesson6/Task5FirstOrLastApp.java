package TuringAcademyTasks.Eolymp.TasksOfLesson6;

import java.util.Scanner;
public class Task5FirstOrLastApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number / 100 > number % 10) {
            System.out.print(number / 100);
        } else if (number / 100 < number % 10) {
            System.out.print(number % 10);
        } else {
            System.out.print("=");
        }
    }
}