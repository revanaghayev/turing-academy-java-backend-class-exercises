package TuringAcademyTasks.TasksOfLesson5;

import java.util.Scanner;

public class NumberCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String result = "";
        int num = sc.nextInt();

        //Checks number if it is even, odd, negative, positive or zero
//        if (num % 2 == 0 && num >= 0 && num != 0) {
//            result ="Entered number is even and positive.";
//        } else if (num % 2 == 0 && num <= 0 && num != 0) {
//            result = "Entered number is even and negative.";
//        } else if (num >= 0 && num != 0) {
//            result = "Entered number is odd and positive.";
//        } else if (num <= 0 && num != 0) {
//            result = "Entered number is odd and negative.";
//        } else {
//            result = "Entered number is zero.";
//        }

//        result = num % 2 == 0 && num > 0 ? "Entered number is even and positive" : (num % 2 == 0 && num < 0 ? "Entered number is even and negative" : (num > 0 ? "Entered number is odd and positive" : (num < 0 ? "Entered number is odd and negative" : "Entered number is zero!!")));
//        System.out.println(result);

        result = num > 0 && num != 0  ? "Entered number is positive" : (num < 0 && num != 0 ? "Entered number is negative" : "Entered number is zero");
        System.out.println(result);
    }
}
