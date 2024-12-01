package TuringAcademyTasks.OOP.EmployeeSystem;

public class EmployeeApp {

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Manager("John", 4000, 2);
        employees[1] = new Developer("Amir", 2000, "Java");
        employees[2] = new Developer("Fakhri",3000, "Java");

        for (Employee employer: employees) {
            employer.displayInfo();
            System.out.println("Bonus percent: "+employer.calculateBonus(20)+";"
            +"Fixed amount: "+employer.calculateBonus(20));
        }
    }
}
