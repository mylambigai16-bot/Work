package handsOn_8_ExceptionHandling;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.Scanner;

// Custom exception for invalid employee code
class InvalidEmpNumberException extends Exception {
    public InvalidEmpNumberException(String message) {
        super(message);
    }
}

// Custom exception for invalid date of joining
class InvalidDateOfJoinException extends Exception {
    public InvalidDateOfJoinException(String message) {
        super(message);
    }
}

// Employee class
class Employee {
    private int empCode;
    private String name;
    private LocalDate dob;
    private LocalDate dateOfJoin;

    public Employee(int empCode, String name, LocalDate dob, LocalDate dateOfJoin)
            throws InvalidEmpNumberException, InvalidDateOfJoinException {

        // Validate employee code
        if (empCode <= 0) {
            throw new InvalidEmpNumberException("Employee code must be a positive integer.");
        }
        this.empCode = empCode;

        // Validate date of joining after DOB
        if (dob.isAfter(dateOfJoin)) {
            throw new InvalidDateOfJoinException("Date of birth cannot be after date of appointment.");
        }
        this.name = name;
        this.dob = dob;
        this.dateOfJoin = dateOfJoin;
    }

    // Method to calculate years of experience
    public int getExperience() {
        return Period.between(dateOfJoin, LocalDate.now()).getYears();
    }

    // Display employee details
    public void display() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Employee Code: " + empCode);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dob.format(formatter));
        System.out.println("Date of Appointment: " + dateOfJoin.format(formatter));
        System.out.println("Years of Experience: " + getExperience());
        System.out.println("----------------------------------------");
    }
}

// Main class
public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            System.out.print("Enter Employee Code: ");
            int code = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Date of Birth (dd-MM-yyyy): ");
            LocalDate dob = LocalDate.parse(sc.nextLine(), formatter);

            System.out.print("Enter Date of Appointment (dd-MM-yyyy): ");
            LocalDate doj = LocalDate.parse(sc.nextLine(), formatter);

            // Create employee object
            Employee emp = new Employee(code, name, dob, doj);

            // Display details
            emp.display();

        } catch (InvalidEmpNumberException | InvalidDateOfJoinException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please check the format.");
        } finally {
            sc.close();
        }
    }
}
