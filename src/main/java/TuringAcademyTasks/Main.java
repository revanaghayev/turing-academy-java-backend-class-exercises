package TuringAcademyTasks;

public class Main {
    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4;
        float e = 3.14159265f;
        double f = 333;
        char symbol = 'C';
        boolean isFlag = true;

        System.out.print(a+"\n");
        System.out.println(b+"\n"+c+"\n"+d+"\n"+f+"\n");
        System.out.printf("If we round pi to the decimals it will be %.0f \n", e);
        System.out.printf("Java is from %c language family. \n", symbol);
        System.out.printf("Is this %b or not?", isFlag);
    }
}