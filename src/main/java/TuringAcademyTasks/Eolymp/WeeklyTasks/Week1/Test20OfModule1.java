package TuringAcademyTasks.Eolymp.WeeklyTasks.Week1;

import java.util.Scanner;

public class Test20OfModule1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        triangle(size);
    }
    public static void triangle(int n){
        for (int j = 1; j <= n; j++) {
            for (int i = n-1; i >= j; i--) {
                System.out.print(" ");
            }
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}