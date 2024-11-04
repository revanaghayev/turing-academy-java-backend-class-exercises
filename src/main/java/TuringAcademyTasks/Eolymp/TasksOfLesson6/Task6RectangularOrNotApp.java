package TuringAcademyTasks.Eolymp.TasksOfLesson6;

import java.util.Scanner;

public class Task6RectangularOrNotApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if ((num3 * num3) == ((num2 * num2) + (num1 * num1))){
            System.out.print("YES");
        } else if (num2 * num2 == ((num1 *num1) + (num3 * num3))) {
            System.out.print("YES");
        } else if (num1 * num1 == ((num2 *num2) + (num3 * num3))) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
