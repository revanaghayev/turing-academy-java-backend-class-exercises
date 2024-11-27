package TuringAcademyTasks.Eolymp.WeeklyTasks.Week1.EasyTasks;

import java.util.Scanner;

public class BigAccuracyApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double m = in.nextDouble();
        byte n = in.nextByte();
        short k = in.nextShort();
        System.out.printf("%."+k+"f",(m / n));

        //30%
    }
}
