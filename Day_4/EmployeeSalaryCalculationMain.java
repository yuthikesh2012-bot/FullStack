package Day_4;

class EmployeeSalaryCalculation {
    String name;
    double salary;
    EmployeeSalaryCalculation(String name) {
        this.name = name;
    }
    void calculateSalary() {
        System.out.println("Calculating employee salary..." + " for " + String.valueOf(name));
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
class FullTimeEmployee extends EmployeeSalaryCalculation {
    @Override
    void calculateSalary() {
        double salary = 40000.0;
        setSalary(salary);
        System.out.println("Calculating full-time employee salary...");
    }
}
class PartTimeEmployee extends EmployeeSalaryCalculation {
    @Override
    void calculateSalary() {
        int hours = 80;
        double hourlyRate = 300.0;
        double salary = hours * hourlyRate;
        setSalary(salary);
        System.out.println("Calculating part-time employee salary...");
    }
}
public class EmployeeSalaryCalculationMain {
    public static void main(String[] args) {
        EmployeeSalaryCalculation fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.calculateSalary();
        System.out.println("The salary of the full-time employee is: " + fullTimeEmployee.getSalary());
        EmployeeSalaryCalculation partTimeEmployee = new PartTimeEmployee();
        partTimeEmployee.calculateSalary();
        System.out.println("The salary of the part-time employee is: " + partTimeEmployee.getSalary());
    }
}