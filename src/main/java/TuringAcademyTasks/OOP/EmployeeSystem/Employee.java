package TuringAcademyTasks.OOP.EmployeeSystem;

public class Employee {

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("{Name: "+this.name+
                "; Salary: "+this.salary+"}");
    }

    public double calculateBonus(double percentage) {
        return (this.salary * percentage) / 100;
    }
}