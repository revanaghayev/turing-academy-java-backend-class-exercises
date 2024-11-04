package TuringAcademyTasks.Eolymp.TasksOfLesson6;

import java.util.Scanner;

public class Task3BucksInTheBankApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long S = in.nextLong();
        long N = 0;
        long sumLastYear = 1;
        long sumTotal = 1;
        for (; N <= 100; N++) {
            sumLastYear = sumLastYear * 2 + N;
            sumTotal += sumLastYear;
            if (S <= sumTotal) {
                System.out.println(++N);
                break;
            }
        }
    }
}