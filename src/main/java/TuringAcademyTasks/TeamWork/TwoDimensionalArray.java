package TuringAcademyTasks.TeamWork;

import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int[][] arr = new int[num][];

        int temp;
        int i;
        int j;

        for (i = 0; i < num; i++) {
            arr[i] = new int[i+1];
            temp = i+1;
            for (j = 0; j < i+1; j++) {
                arr[i][j] = temp;
            }
        }

        for (i = 0; i < num; i++) {
            for (j = 0; j < i+1; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
