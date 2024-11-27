package TuringAcademyTasks.Eolymp.WeeklyTasks.Week1.EasyTasks;

import java.util.Scanner;

public class GardenerPainterApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte N = in.nextByte();
        long temp = 1;
        for (int i = 1; i < N; i++) {
            temp *= 2;
        }
        System.out.println(3 * temp);

        //100%
    }
}