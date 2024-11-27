package TuringAcademyTasks.DuringLessonTasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BiggestElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of elements: ");
        int size = sc.nextInt();
        int[] elements = new int[size];
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            elements[i] = sc.nextInt();
        }
        System.out.println(selectionSort(elements));
    }

    public static int selectionSort(int[] arr) {

        int minIndex = arr[0];
        int temp =0;
        for (int i = 0; i < arr.length; i++) {
            if (minIndex > arr[i+1]) {
                arr[i+1] = minIndex;
            } else {
                return arr[i+1];
            }
            temp = arr[i+1];
        }
        return temp;
    }
}
