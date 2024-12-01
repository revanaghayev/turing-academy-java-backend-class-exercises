package TuringAcademyTasks.OOP.EmployeeSystem;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, int salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage(String programmingLanguage) {
        return programmingLanguage;
    }

    public void setProgrammingLanguage() {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInfo() {
        System.out.println("{Name: " + super.getName() +
                "; Salary: " + super.getSalary() + "; Programming language: " + this.programmingLanguage + "}");
    }

    public double calculateBonus(double percentage, double fixedAmount) {
        fixedAmount = super.getSalary() + super.calculateBonus(percentage);
        return fixedAmount;
    }
}
