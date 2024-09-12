// Before Refactoring to Better Design

package open_closed_principles;

public class SalaryCalculator {
    public double calculateSalary(String employeeType, double baseSalary, double hoursWorked) {
        if (employeeType.equals("fixed")) {
            return baseSalary; // Gaji tetap
        } else if (employeeType.equals("hourly")) {
            return baseSalary * hoursWorked; // Gaji per jam
        } else {
            throw new IllegalArgumentException("Unknown employee type");
        }
    }

    public static void main(String[] args) {
        SalaryCalculator calculator = new SalaryCalculator();
        
        double fixedSalary = calculator.calculateSalary("fixed", 5000, 0);
        System.out.println("Fixed Salary: " + fixedSalary);
        
        double hourlySalary = calculator.calculateSalary("hourly", 20, 160);
        System.out.println("Hourly Salary: " + hourlySalary);
    }
}

