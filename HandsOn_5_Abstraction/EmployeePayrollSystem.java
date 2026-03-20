//abstraction;
package HandsOn_5_Abstraction;

import java.util.ArrayList;
import java.util.List;

// Base class: Employee
class Employee {
    protected String empId;
    protected String empName;
    protected double baseSalary;

    public Employee(String empId, String empName, double baseSalary) {
        this.empId = empId;
        this.empName = empName;
        this.baseSalary = baseSalary;
    }

    // Getters
    public String getEmpId() { return empId; }
    public String getEmpName() { return empName; }
    public double getBaseSalary() { return baseSalary; }

    // Polymorphic method to calculate salary
    public double calculateSalary() {
        return baseSalary; // default implementation
    }

    @Override
    public String toString() {
        return "Employee ID: " + empId +
               ", Name: " + empName +
               ", Base Salary: Rs." + baseSalary +
               ", Final Salary: Rs." + calculateSalary();
    }
}

// Derived class: PermanentEmployee
class PermanentEmployee extends Employee {
    private double bonus;

    public PermanentEmployee(String empId, String empName, double baseSalary, double bonus) {
        super(empId, empName, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

// Derived class: ContractEmployee
class ContractEmployee extends Employee {
    private double taxRate;        // e.g., 0.10 for 10%
    private double serviceCharge;  // fixed deduction

    public ContractEmployee(String empId, String empName, double baseSalary, double taxRate, double serviceCharge) {
        super(empId, empName, baseSalary);
        this.taxRate = taxRate;
        this.serviceCharge = serviceCharge;
    }

    @Override
    public double calculateSalary() {
        return baseSalary - (baseSalary * taxRate) - serviceCharge;
    }
}

// Derived class: Intern
class Intern extends Employee {
    private double stipend;

    public Intern(String empId, String empName, double stipend) {
        super(empId, empName, 0); // base salary not used
        this.stipend = stipend;
    }

    @Override
    public double calculateSalary() {
        return stipend;
    }
}

// Main class
public class EmployeePayrollSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Creating various types of employees
        employees.add(new PermanentEmployee("PE001", "Alice", 50000, 5000));
        employees.add(new ContractEmployee("CE001", "Bob", 30000, 0.10, 1000));
        employees.add(new Intern("IN001", "Charlie", 15000));
        employees.add(new PermanentEmployee("PE002", "David", 60000, 8000));
        employees.add(new ContractEmployee("CE002", "Eva", 25000, 0.08, 500));

        // Displaying employee details with computed salary
        System.out.println("----- Employee Payroll -----");
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
    }
}

