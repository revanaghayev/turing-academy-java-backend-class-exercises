package TuringAcademyTasks.TaskOfLesson4;

import java.util.Scanner;

public class OperatorsTask2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value1: ");
        int intValue1 = scanner.nextInt();
        System.out.println("Enter value2: ");
        int intValue2 = scanner.nextInt();
        System.out.println("Enter value3: ");
        int intValue3 = scanner.nextInt();
        System.out.println("Enter value4: ");
        int intValue4 = scanner.nextInt();
        System.out.println("Enter value6: ");
        int intValue6 = scanner.nextInt();

        int intValue5 = 0;

        intValue1 %= intValue6;
        intValue2 /= intValue3;
        intValue3 -= intValue1;
        intValue5 += intValue1;
        intValue4++;

        String str = (intValue4 >= 3) ? "higher" : "lower";

        System.out.println("The calculated value of value1 is " + intValue1);
        System.out.println("The calculated value of value2 is " + intValue2);
        System.out.println("The calculated value of value3 is " + intValue3);
        System.out.println("The calculated value of value5 is " + intValue5);
        System.out.println("The calculated value of value4 is " + intValue6);
        System.out.println("Value4 is "+str+" than 3");
    }
}
