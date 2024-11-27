package TuringAcademyTasks.DuringLessonTasks;

import java.util.Scanner;

public class Pyramids {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("1)");
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("2)");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
