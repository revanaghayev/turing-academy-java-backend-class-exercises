package TuringAcademyTasks.TasksOfLesson8;

import java.util.Scanner;

public class ReverseAndUpperTheWordApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = sc.nextLine();

        char[] charArray = str.toUpperCase().toCharArray();

        char[] reversedCharArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            reversedCharArray[charArray.length - 1 -i] = charArray[i];
        }
        String reversedString = new String(reversedCharArray);
        System.out.println("The reversed and uppercased word is: "+reversedString);
    }
}
