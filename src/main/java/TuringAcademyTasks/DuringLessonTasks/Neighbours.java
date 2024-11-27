package TuringAcademyTasks.DuringLessonTasks;

import java.util.Scanner;

public class Neighbours {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of numbers: ");
        int size = sc.nextInt();
        int[] neighbourNumbers = new int[size];
        System.out.println("Enter neighbour numbers: ");
        for (int i = 0; i < size; i++) {
            neighbourNumbers[i] = sc.nextInt();
        }
        System.out.println(": "+ageSelector(neighbourNumbers));
    }

    public static int ageSelector(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                count++;
            }
        }
        return count;
    }
}
