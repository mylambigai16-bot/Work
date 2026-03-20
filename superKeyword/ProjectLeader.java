package superKeyword;

public class ProjectLeader {
	String name="Myl";
	int empId=3;
	void display() {
		System.out.println("Project lead name: "+name);
		System.out.println("Project leader Id: "+empId);
	}
}
class Manager extends ProjectLeader{
	String  name="Mylan";
	int id=5;
	public static void main(String[] args) {
		
	}

}
