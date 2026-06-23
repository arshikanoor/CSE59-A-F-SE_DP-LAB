import java.util.List;
abstract class Employee{
    protected String name;
    public Employee(String name){
        this.name = name;
    }
    public abstract double getSalary();
}
class FullTimeEmployee extends Employee {
    private double baseSalary;

    public FullTimeEmployee(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getSalary() {
        return baseSalary;
    }
}


class Contractor extends Employee {

    private double hourlyRate;
    private int hoursWorked;

    public Contractor(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getSalary() {
        return hourlyRate * hoursWorked;
    }
}
class PayrollSystem {

    public double calculateTotalPayroll(List<Employee> employees) {
        double total = 0;

        for (Employee e : employees) {
            total += e.getSalary();
        }

        return total;
    }
}


public class Main2{

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new FullTimeEmployee("Alice", 5000),
                new Contractor("Bob", 20, 100)
        );

        PayrollSystem payroll = new PayrollSystem();

        double totalPayroll = payroll.calculateTotalPayroll(employees);

System.out.println("Total Payroll: "+ totalPayroll);
    }
}
