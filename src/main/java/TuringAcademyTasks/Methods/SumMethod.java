package TuringAcademyTasks.Methods;

public class SumMethod {

    public static void main(String[] args) {

        int[] nums = {5, 6};
        
        int sums = Sum(nums);
        System.out.println(sums);
    }

    public static int Sum(int[] arr) {
        int sum = arr[0] + arr[1];
        return sum;
    }
}
