package TuringAcademyTasks.OOP.EmployeeSystem;

public class Manager extends Employee{

    private int teamSize;

    public Manager(String name, int salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public void displayInfo() {
        System.out.println("{Name: "+super.getName()+
                "; Salary: "+super.getSalary()+"; Teamsize: "+this.teamSize+"}");
    }

    public double calculateBonus(double percentage, double fixedAmount) {
        fixedAmount = super.getSalary()+super.calculateBonus(percentage);
        return fixedAmount;
    }
}
