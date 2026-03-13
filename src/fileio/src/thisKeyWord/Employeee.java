package thisKeyWord;

class Employee{
	int empId;
	String empName;
	double empSalary;
	
	//1. using 'this' to refer the instance variable
	Employee(int empId, String empName, double empSalary){
		this.empId =empId;
		this.empName =empName;
		this.empSalary=empSalary;
		System.out.println("Employee records created successfully!\n");
	}
	
	//2.Using 'this()' to call another constructor(constructor chaining)
	Employee(){
		this(100, "sowndariys", 30000.00);
		System.out.println("Default constructor called and initialized with default data");
	}
	
	//3. Using this to call another method in the same class
	void registerEmployee() {
		System.out.println("Register Employee...");
		this.displayDetails();//calls another method
	}
	
	void displayDetails() {
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Salary: "+empSalary);
	}
	
	
	//4. Using 'this' to pass the current object as an argument
	void sendForProcessing() {
		HRDepartment hr= new HRDepartment();
		hr.processEmployee(this);//Pass current object 
	}
	
	//5. using 'this' to return current object(method chaining)
	Employee updateSalary(double hikePercentage) {
		this.empSalary=empSalary+(empSalary * hikePercentage/100);
		return this;//Allows chaining
	}
	
	Employee updateName(String newName) {
		this.empName=newName;
		return this;//Allows chaining
	}
}

class HRDepartment {
	void processEmployee(Employee e) {
		System.out.println("HR Department Processing Employee...");
		System.out.println("Process Employee: "+e.empName+" with salary"+e.empSalary);
	}
}


