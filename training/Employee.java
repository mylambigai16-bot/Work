 package training;

public class Employee {
	int emp_id;
	String emp_name;
	int emp_salary;
	
	Employee(int emp_id,String emp_name,int emp_salary ){
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_salary=emp_salary;
	}

	public static void main(String[] args) {
		Employee m=new Employee(1,"Myl",1000);

	}

}
