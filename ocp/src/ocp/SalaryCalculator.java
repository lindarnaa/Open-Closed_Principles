// Refactoring to Better Design
package ocp;

// Define an interface for salary calculation
interface SalaryStrategy {
    double calculateSalary(double baseSalary, double hoursWorked);
}

// Implementation for Fixed Salary
class FixedSalaryStrategy implements SalaryStrategy {
    @Override
    public double calculateSalary(double baseSalary, double hoursWorked) {
        return baseSalary;
    }
}

// Implementation for Hourly Salary
class HourlySalaryStrategy implements SalaryStrategy {
    @Override
    public double calculateSalary(double baseSalary, double hoursWorked) {
        return baseSalary * hoursWorked;
    }
}

// Refactored SalaryCalculator class
public class SalaryCalculator {
    private SalaryStrategy strategy;

    public SalaryCalculator(SalaryStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateSalary(double baseSalary, double hoursWorked) {
        return strategy.calculateSalary(baseSalary, hoursWorked);
    }

    public static void main(String[] args) {
        SalaryCalculator fixedSalaryCalculator = new SalaryCalculator(new FixedSalaryStrategy());
        double fixedSalary = fixedSalaryCalculator.calculateSalary(5000, 0);
        System.out.println("Fixed Salary: " + fixedSalary);
        
        SalaryCalculator hourlySalaryCalculator = new SalaryCalculator(new HourlySalaryStrategy());
        double hourlySalary = hourlySalaryCalculator.calculateSalary(20, 160);
        System.out.println("Hourly Salary: " + hourlySalary);

    }
}
