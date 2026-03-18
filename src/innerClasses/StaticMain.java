package innerClasses;

class Person{
	int age=21;
	static int weight=45;
	static class Gender{
		void nonStaticDisplay() {
			System.out.println("In non static Dispaly method");
			System.out.println("Weight valuse: "+weight);
		}
		static void staticDisplay() {
			System.out.println("In static Dispaly method");
			System.out.println("Weight value: "+weight);
		}
	}
	Gender gender=new Gender();
}

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		person.gender.nonStaticDisplay();
		person.gender.staticDisplay();
	}

}
