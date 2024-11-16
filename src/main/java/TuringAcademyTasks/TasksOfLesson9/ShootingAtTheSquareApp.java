package TuringAcademyTasks.TasksOfLesson9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShootingAtTheSquareApp {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int targetRow = random.nextInt(5);
        int targetColumn = random.nextInt(5);
        String[][] shootingArea = new String[5][5];
        System.out.println("All set. Get ready to rumble!");
        for (String[] value : shootingArea) {
            Arrays.fill(value, " - ");
        }

        //Checks if target shot or not.
        while(true) {

            //Is line true or not.
            int targetLine = 0;
            while (true) {

                targetLine = sc.nextInt();
                if (targetLine - 1 != targetRow) {
                    System.out.println("Wrong line!");
                } else {
                    break;
                }
            }

            //Is shoot true or not.
            int targetShoot = 0;
            while (true) {

                targetShoot = sc.nextInt();
                if (targetShoot - 1 != targetColumn) {
                    shootingArea[targetLine - 1][targetShoot - 1] = " * ";
                    System.out.println("Wrong shoot!");
                } else {
                    break;
                }
                //Prints area each time.
                for (String[] strings : shootingArea) {
                    for (String string : strings) {
                        System.out.print("|" + string);
                    }
                    System.out.print("|");
                    System.out.println();
                }
            }

            if (targetLine - 1 == targetRow && targetShoot - 1 == targetColumn) {
                break;
            }
        }

        System.out.println("You have won!");
    }
}
