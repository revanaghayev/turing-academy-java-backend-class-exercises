package TuringAcademyTasks.Eolymp.TasksOfLesson6;

import java.util.Scanner;

public class Task2MedianNumberApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();

        if ((number2 >= number1 && number2 <= number3) || (number2 <= number1 && number2 >= number3)) {
            System.out.println(number2);
        } else if ((number3 >= number1 && number3 <= number2) || (number3 >= number2 && number3 <= number1)) {
            System.out.println(number3);
        } else if ((number1 >= number2 && number1 <= number3) || (number1 <= number2 && number1 >= number3)) {
            System.out.println(number1);
        }
    }
}