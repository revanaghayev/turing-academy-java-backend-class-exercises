package TuringAcademyTasks.DuringLessonTasks;

import java.util.Scanner;

public class IfElseAndSwitchCaseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
//
//        if (value % 3 == 0) {
//            System.out.println("Value is fully divided to 3.");
//        } else if (value % 3 == 1) {
//            System.out.println("Residual value is 1.");
//        } else {
//            System.out.println("Residual value is 2.");
//        }

        String str1 = "";

        switch (value % 3) {
            case 0:
                str1 = "Value is fully divided to 3.";
                break;
            case 1:
                str1 = "Residual value is 1.";
                break;
            case 2:
                str1 = "Residual value is 2.";
                break;
        }
        System.out.println(str1);
    }
}