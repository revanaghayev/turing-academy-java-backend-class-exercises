package TuringAcademyTasks.TasksOfLesson9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SeatApp {

    public static void main(String[] args) {

        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        //Students array.
        String[] studentsAll = {"Aynur", "Dilbər", "Ella", "Əli", "Famil", "Fəxri", "Gülər", "Günay",
                                "İbrahim", "Lalə", "Məhəmməd", "Nicat", "Nihat", "Ömər", "Pərvin", "Raminə",
                                "Rəna", "Rəvan Ə.", "Rəvan A.", "Ruslan", "Seyran", "Sənubər", "Tural", "Yetər"};
        System.out.print("Press 1 for randomize. Press 0 to exit code:");

        //Randomization loop.
        outerWhile:
        while (true) {

            //User input.
            while (true) {
                String clearInput = sc.nextLine().trim();
                if (clearInput.equals("0")) {
                    break outerWhile;
                } else if (clearInput.equals("1")) {
                    break;
                } else {
                    System.out.println("Enter valid input!");
                }
            }

            //Already randomized seats.
            int[] randomizedSeats = new int[23];
            Arrays.fill(randomizedSeats, 1);

            //Randomization process.
            for  (int i = 0; i < studentsAll.length; i++) {
                    int number;

                    //Checks if random number entered twice.
                    outerLoop:
                    while (true) {
                        number = rd.nextInt(23);
                        for (int seat: randomizedSeats) {
                            if (seat == 0) {
                                continue outerLoop;
                            } else {
                                break outerLoop;
                            }
                        }
                    }

                    //Randomization operation.
                    randomizedSeats[number] = 0;
                    String temp = studentsAll[i];
                    studentsAll[i] = studentsAll[number];
                    studentsAll[number] = temp;
            }

            //Print process.
            for (int i = 0; i < studentsAll.length; i++) {
                System.out.println(studentsAll[i]+" ==> "+(i+1));
            }
        }
    }
}