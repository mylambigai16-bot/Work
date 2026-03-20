package Exercise;

class Person {
	String name;
	String address;
	
    Person(String name,String address){
    	this.name=name;
    	this.address=address;
		
	}
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Person [name=" + name + ", address=" + address + "]";
	}
		
}
class Student extends Person{
	String program;
	int year;
	double fee;
	
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFee() {
		return fee;
	}
    public void setFee(double fee) {
		this.fee = fee;
	}

	Student(String name,String address,String pro,int yr,double fees){
		super(name,address);
		program=pro;
		yr=year;
		fee=fees;
	}
	
	@Override
	public String toString() {
		return "Student [program=" + program + ", year=" + year + ", fee=" + fee + "]";
	}
}
 class Staff extends Person{
	String school;
	double pay;
	
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	
	Staff(String name,String address,String school,double pay){
		super(name,address);
		this.school=school;
		this.pay=pay;
	}
	@Override
	public String toString() {
		return "Staff [school=" + school + ", pay=" + pay + "]";
	}
	public static void main(String[] args) {
		Staff m=new Staff("Myl","Add","SSV",100.0);
		System.out.println(m);

	    Student s = new Student("John","Chennai","ECE",2024,50000);
	    System.out.println(s);
	}

}
