package thisKeyWord;

public class Employeee {

    int empid;
    String empName;
    double empSalary;

    Employeee(int empid, String empName, double empSalary) {
        this.empid = empid;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    Employeee() {
        this(56, "Myl", 50000);
        System.out.println("Employee created Successfully");
    }

    void registerEmployee() {
        System.out.println("Registering Employee");
        this.displayDetails();
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empSalary);
    }

    // pass current object
    void sendForProcessing() {
        HRDepartment hr = new HRDepartment();
        hr.processEmployee(this);
    }

    // method chaining
    Employeee updateSalary(double hikePercentage) {
        this.empSalary = empSalary + (empSalary * hikePercentage / 100);
        return this;
    }

    Employeee updateName(String newName) {
        this.empName = newName;
        return this;
    }

    class HRDepartment {
        void processEmployee(Employeee e) {
            System.out.println("HR Department Processing Employee..");
            System.out.println("Processed Employee: " + e.empName + " with salary " + e.empSalary);
        }
    }

    public static void main(String[] args) {

        Employeee obj = new Employeee();

        obj.displayDetails();

        // method chaining
        obj.updateSalary(10).updateName("Mylu").displayDetails();

        // passing current object
        obj.sendForProcessing();
    }
}
