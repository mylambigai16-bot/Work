package thisKeyWord;

public class Employee {
	int emp_id;
	String emp_name;
	int emp_salary;
	Employee(){
		this(1,"Myl",1000);  
	}
	Employee (int emp_id, String emp_name, int emp_salary) {
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_salary=emp_salary;
		System.out.println("ID:"+emp_id+" Name:"+this.emp_name+" salary:"+emp_salary);
	}

	public static void main(String[] args) {
		Employee m=new Employee();
		
	}

}
class HRDepartment {
	void processEmployee(Employee e) {
		System.out.println("Process employee: "+e.emp_name+e.emp_salary);
	}
}
