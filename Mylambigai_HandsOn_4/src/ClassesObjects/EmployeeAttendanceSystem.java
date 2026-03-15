package ClassesObjects;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// Attendance class handles attendance record for one employee
class Attendance {
    private int empId;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;
    private boolean isCheckedIn;
    private boolean isCheckedOut;

    // Constructor linking attendance to employee
    public Attendance(int empId) {
        this.empId = empId;
        this.isCheckedIn = false;
        this.isCheckedOut = false;
    }

    // Mark check-in if not already checked in
    public void markCheckIn() {
        if (isCheckedIn) {
            System.out.println("Check-in already done for today.");
        } else {
            checkInTime = LocalTime.now();
            isCheckedIn = true;
            System.out.println("Check-in successful at " + checkInTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        }
    }

    // Mark check-out if check-in done and not already checked out
    public void markCheckOut() {
        if (!isCheckedIn) {
            System.out.println("Cannot check out before checking in.");
        } else if (isCheckedOut) {
            System.out.println("Check-out already done for today.");
        } else {
            checkOutTime = LocalTime.now();
            isCheckedOut = true;
            System.out.println("Check-out successful at " + checkOutTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        }
    }

    // Display attendance details
    public void getAttendanceDetails(String empName) {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Check-in Time: " + (checkInTime != null ? checkInTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")) : "Not checked in"));
        System.out.println("Check-out Time: " + (checkOutTime != null ? checkOutTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")) : "Not checked out"));
        System.out.println("-----------------------------------");
    }
}

// Employee class represents an employee
class Employee {
    private int empId;
    private String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    // Employee marks check-in using Attendance object
    public void markCheckIn(Attendance attendance) {
        attendance.markCheckIn();
    }

    // Employee marks check-out using Attendance object
    public void markCheckOut(Attendance attendance) {
        attendance.markCheckOut();
    }

    // Getters
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
}

// Main class to demonstrate functionality
public class EmployeeAttendanceSystem {
    public static void main(String[] args) {
        // Create employees
        Employee emp1 = new Employee(101, "Alice");
        Employee emp2 = new Employee(102, "Bob");

        // Create attendance records
        Attendance attendance1 = new Attendance(emp1.getEmpId());
        Attendance attendance2 = new Attendance(emp2.getEmpId());

        // Mark attendance
        emp1.markCheckIn(attendance1);
        emp2.markCheckIn(attendance2);

        // Trying duplicate check-in
        emp1.markCheckIn(attendance1);

        // Check-out
        emp1.markCheckOut(attendance1);
        emp2.markCheckOut(attendance2);

        // Trying invalid check-out
        emp1.markCheckOut(attendance1);

        // Display attendance summaries
        System.out.println("\nAttendance Summary:");
        attendance1.getAttendanceDetails(emp1.getEmpName());
        attendance2.getAttendanceDetails(emp2.getEmpName());
    }
}
