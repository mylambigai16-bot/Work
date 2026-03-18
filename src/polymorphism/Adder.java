package polymorphism;

public class Adder {
	static int add(int a,int b) {
		return a+b;
	}
	static double add(double a,double b) {
		return a+b;
	}

	public static void main(String[] args) {
		System.out.println("Add int: "+add(1, 2));
		System.out.println("Add double: "+add(1.5, 2.5));
	}

} 
