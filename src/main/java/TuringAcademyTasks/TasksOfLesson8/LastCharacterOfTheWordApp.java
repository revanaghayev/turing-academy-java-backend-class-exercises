package TuringAcademyTasks.TasksOfLesson8;

import java.util.Scanner;

public class LastCharacterOfTheWordApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();

        char lastChar = 0;
        for (char ch : charArray) {
            lastChar = ch;
        }

        System.out.println("The last character of the entered word is: " + lastChar);
    }
}
