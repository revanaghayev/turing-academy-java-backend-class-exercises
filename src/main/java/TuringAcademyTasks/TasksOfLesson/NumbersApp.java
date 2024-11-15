package TuringAcademyTasks.TasksOfLesson;

import javax.naming.PartialResultException;
import java.util.Random;
import java.util.Scanner;

public class NumbersApp {

    public static void main(String[] args) {

        //Generates random number in a range of [0 - 100].
        Random random = new Random();
        int targetNumber = random.nextInt(100);

        //There is input.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name player:");
        String name = sc.nextLine();
        System.out.println("Let the game begin!");
        int[] allGuessed = new int[100];
        String result = "";

        //Checks the number if it is small, large or true guessed.
        while (true) {

            int guessedNumber;
            while (true) {
                guessedNumber = sc.nextInt();
                if (!sc.hasNextInt()) {
                    System.out.println("Enter number");
                } else {
                    break;
                }
            }

            if (guessedNumber < targetNumber) {
                result = "Your number is too small";
            } else if (guessedNumber > targetNumber) {
                result = "Your number is too large";
            } else {
                break;
            }
//            String result = guessedNumber < targetNumber ? "small" : guessedNumber > targetNumber ? "large" : ("Congratulations, %s!"+name);
            System.out.println(result);
        }

        System.out.println("Congratulations, "+name+"!");

        //Sorts array's element from small to large.
        for (int g = 0; g < allGuessed.length; g++) {

            int minIndex = g;
            for (int j = 1; j < allGuessed.length - 1; j++) {

                if (allGuessed[j] < allGuessed[minIndex]) {

                    minIndex = j;
                }

                int temp = allGuessed[minIndex];
                allGuessed[minIndex] = allGuessed[g];
                allGuessed[g] = temp;
            }
        }

        //All guessed numbers.
        System.out.println("Your numbers: ");
        for (int i : allGuessed) {

            if (i != 0) {

                System.out.print(i + " ");
            }
        }
    }
}