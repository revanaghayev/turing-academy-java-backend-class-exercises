package TuringAcademyTasks.TasksOfLesson8;

import java.util.Scanner;

public class VowelOrNotApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = sc.nextLine();

        String result = "";
        char[] chars = str.toLowerCase().toCharArray();

        char char2 = 0;
        for (char char1 : chars) {
            char2 = char1;
        }

        if (!Character.isLetter(char2)) {
            result = "Entered word is symbol or number!!!";
        } else if (char2 == 'a' || char2 == 'e' || char2 == 'i' || char2 == 'u' || char2 == 'o'){
            result = "Entered word is vowel.";
        } else {
            result = "Entered word is consonant.";
        }

        System.out.println(result);
    }
}