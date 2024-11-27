package TuringAcademyTasks.Eolymp.WeeklyTasks.Week1.EasyTasks;

import java.util.Scanner;

public class NumbersApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        int temp = n;
        do {
            i++;
            temp = temp / 10;
        } while (temp > 0);
        System.out.println(i);

        //100%

        /*
Second version
        String n = sc.next();
        System.out.println(n.length());
*/
    }
}