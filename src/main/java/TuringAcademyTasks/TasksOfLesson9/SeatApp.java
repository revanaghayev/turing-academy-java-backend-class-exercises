package TuringAcademyTasks.TasksOfLesson9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SeatApp {

    public static void main(String[] args) {

        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        String[] studentsRow1 = {"Aynur", "Dilbər", "Ella", "Əli", "Famil", "Fəxri", "Gülər", "Günay"};
        String[] studentsRow2 = {"İbrahim", "Lalə", "Məhəmməd", "Nicat", "Nihat", "Ömər", "Pərvin", "Raminə"};
        String[] studentsRow3 = {"Rəna", "Rəvan Ə.", "Rəvan A.", "Ruslan", "Seyran", "Sənubər", "Tural", "Yetər"};

        String[][] studentsAll = new String[3][8];

        studentsAll[0] = studentsRow1;
        studentsAll[1] = studentsRow2;
        studentsAll[2] = studentsRow3;

        while (true) {

            String userInput = sc.nextLine();
            String clearInput = userInput.trim().toLowerCase();
            if (clearInput.equals("exit")) {
                break;
            } else if (!clearInput.equals("random")) {
                System.out.println("Enter valid input!");
            }

            int[][] randomizedSeats = new int[3][8];

            Arrays.fill(randomizedSeats[0], 1);
            Arrays.fill(randomizedSeats[1], 1);
            Arrays.fill(randomizedSeats[2], 1);

            for (int i = 0; i < studentsAll.length; i++) {

                outerLoop:
                for (int j = 0; j < studentsAll[i].length; j++) {

                    int rows = rd.nextInt(3);
                    int columns = rd.nextInt(8);
                    System.out.println("Works");

                    for (int k = 0; k < randomizedSeats.length; k++) {
                        for (int l = 0; l < randomizedSeats[k].length; l++) {
                            if (randomizedSeats[k][l] == 0) {
                                continue outerLoop;
                            }
                        }
                    }

                    randomizedSeats[rows][columns] = 0;
                    String temp = studentsAll[i][j];
                    studentsAll[i][j] = studentsAll[rows][columns];
                    System.out.println(studentsAll[i][j]);
                    studentsAll[rows][columns] = temp;
                }
            }

            for (int i = 0; i < studentsAll.length; i++) {

                System.out.println("----------------------------------------------------------------------------------");
                for (int j = 0; j < studentsAll[i].length; j++) {
                    System.out.print("| " + studentsAll[i][j] + " ");
                }
                System.out.print("|");
                System.out.println();
            }
            System.out.println("----------------------------------------------------------------------------------");
        }

        for (int i = 0; i < studentsAll.length; i++) {

            System.out.println("----------------------------------------------------------------------------------");
            for (int j = 0; j < studentsAll[i].length; j++) {
                System.out.print("| " + studentsAll[i][j] + " ");
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
