package TuringAcademyTasks.TasksOfLesson9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SeatApp {

    public static void main(String[] args) {

        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        //Students array.
        String[] studentsRow1 = {"Aynur", "Dilbər", "Ella", "Əli", "Famil", "Fəxri", "Gülər", "Günay"};
        String[] studentsRow2 = {"İbrahim", "Lalə", "Məhəmməd", "Nicat", "Nihat", "Ömər", "Pərvin", "Raminə"};
        String[] studentsRow3 = {"Rəna", "Rəvan Ə.", "Rəvan A.", "Ruslan", "Seyran", "Sənubər", "Tural", "Yetər"};

        String[][] studentsAll = new String[3][8];

        studentsAll[0] = studentsRow1;
        studentsAll[1] = studentsRow2;
        studentsAll[2] = studentsRow3;

        //Only teacher can randomize. So it checks if you are Vüsal or not.
        System.out.println("Enter your name: ");
        while (true) {

            String name = sc.nextLine().trim().toLowerCase();
            if (name.equals("vüsal") || name.equals("vusal")) {
                System.out.println("Welcome to class Vusal!");
                break;
            } else {
                System.out.println("Access denied!");
            }
        }
        System.out.println("Enter random keyword to randomize seats. If you want to exit enter exit keyword:");

        //Randomization loop.
        outerWhile:
        while (true) {

            //User input.
            while (true) {

                String clearInput = sc.nextLine().trim().toLowerCase();

                if (clearInput.equals("exit")) {
                    System.out.println("Randomization ended successfully!");
                    break outerWhile;
                } else if (clearInput.equals("random")) {
                    break;
                } else {
                    System.out.println("Enter valid input!");
                }
            }

            //Already randomized seats.
            int[][] randomizedSeats = new int[3][8];

            Arrays.fill(randomizedSeats[0], 1);
            Arrays.fill(randomizedSeats[1], 1);
            Arrays.fill(randomizedSeats[2], 1);

            //Randomization process.
            for (int i = 0; i < studentsAll.length; i++) {

                for (int j = 0; j < studentsAll[i].length; j++) {

                    int rows;
                    int columns;

                    //Checks if random number entered twice.
                    outerLoop:
                    while (true) {

                        rows = rd.nextInt(3);
                        columns = rd.nextInt(8);
                        for (int[] randomizedSeat : randomizedSeats) {
                            for (int seat : randomizedSeat) {
                                if (seat == 0) {
                                    continue outerLoop;
                                } else {
                                    break outerLoop;
                                }
                            }
                        }
                    }

                    //Randomization operation.
                    randomizedSeats[rows][columns] = 0;
                    String temp = studentsAll[i][j];
                    studentsAll[i][j] = studentsAll[rows][columns];
                    studentsAll[rows][columns] = temp;
                }
            }

            //Updated students seats: each time when changed.
            System.out.println("Randomized variant of seats: ");
            for (String[] strings : studentsAll) {

                System.out.println("----------------------------------------------------------------------------------");
                for (String string : strings) {
                    System.out.print("| " + string + " ");
                }
                System.out.print("|");
                System.out.println();
            }
            System.out.println("----------------------------------------------------------------------------------");
        }

        //Updated students seats: last variant.
        System.out.println("Last variant of seats: ");
        for (String[] strings : studentsAll) {

            System.out.println("----------------------------------------------------------------------------------");
            for (String string : strings) {
                System.out.print("| " + string + " ");
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------");

//        for (String[] seatRows: studentsAll) {
//            for (String seatColumns: seatRows) {
//                seatRows =
//            }
//        }
    }
}