package TuringAcademyTasks.TasksOfLesson5;

import java.util.Scanner;

public class MonthAndSeasonPredictorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int month = sc.nextInt();
        String result = "";

        if (month != 0) {
            switch (month) {
                case 1:
                    result = "Entered month is January, season is Winter.";
                    break;
                case 2:
                    result = "Entered month is Feburary, season is Winter.";
                    break;
                case 3:
                    result = "Entered month is March, season is Spring.";
                    break;
                case 4:
                    result = "Entered month is April, season is Spring.";
                    break;
                case 5:
                    result = "Entered month is May, season is Spring.";
                    break;
                case 6:
                    result = "Entered month is June, season is Summer.";
                    break;
                case 7:
                    result = "Entered month is July, season is Summer.";
                    break;
                case 8:
                    result = "Entered month is August, season is Summer.";
                    break;
                case 9:
                    result = "Entered month is September, season is Autumn.";
                    break;
                case 10:
                    result = "Entered month is October, season is Autumn.";
                    break;
                case 11:
                    result = "Entered month is November, season is Autumn.";
                    break;
                case 12:
                    result = "Entered month is December, season is Winter.";
                    break;
            }
        } else {
            result = "Entered month is not correct!!!";
        }

        System.out.println(result);
    }
}
