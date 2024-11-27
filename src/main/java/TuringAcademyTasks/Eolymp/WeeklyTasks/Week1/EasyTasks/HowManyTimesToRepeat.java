package TuringAcademyTasks.Eolymp.WeeklyTasks.Week1.EasyTasks;

import java.util.Scanner;
public class HowManyTimesToRepeat {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int count = 0;
        for (int i = 1; i < 2000000; i++) {
            number -= NumberSum(number);
            if (number > 0) {
                count++;
            }
        }
    }

    public static int NumberSum(int num) {
        int temp = 0;
        int dec = 1;
        String str = String.valueOf(num);
        for (int i = 1; i <= str.length(); i++) {
            dec *= 10;
            temp += (num % dec) - (dec / 10);
        }
        return temp;
    }
}