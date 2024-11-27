package TuringAcademyTasks.OOP;

public class Class {

    private int sameName;

    public int Sum(int sameName) {
        this.sameName = sameName;
        return sameName;
    }

    public static void main(String[] args) {

    }

    public int getSameName() {
        return sameName;
    }

    public void setSameName(int sameName) {
        this.sameName = sameName;
    }
}
