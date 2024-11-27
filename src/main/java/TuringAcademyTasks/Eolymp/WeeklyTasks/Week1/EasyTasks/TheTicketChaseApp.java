package TuringAcademyTasks.Eolymp.WeeklyTasks.Week1.EasyTasks;

import java.util.Scanner;

public class TheTicketChaseApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int ticket = in.nextInt();
        int count = 0;
        int res = 0;

        for (int i = ticket+1; i <= (ticket+N-1); i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                res = i - ticket - 1;
                break;
            } else {
                res = -1;
            }
            count = 0;
        }
        System.out.println(res);

        //100%
    }
}