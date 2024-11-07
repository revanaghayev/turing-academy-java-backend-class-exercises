package TuringAcademyTasks.DuringLessonTasks;

public class ArrayTaskApp {

    public static void main(String[] args) {

        int[] names = new int[] {99, 1, 2, 19, 0, 12};

        int nameMax = names[0];
        for (int i = 0; i < names.length; i++) {
            if (nameMax < names[i]) {
                nameMax = names[i];
            }
        }
        System.out.println(nameMax);
    }
}
