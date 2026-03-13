package innerClasses;

class OuterClass1{
	int value=10;
	public void outerClassMethod() {
		System.out.println("Outer class method");
		class InnerClass{
			public void InnerClassMethod() {
				System.out.println("Inner class Method");
				System.out.println("Value in outer class: "+value);
			}
			
		}
		InnerClass inner=new InnerClass();
		inner.InnerClassMethod();
	}
}

public class MethodLocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass1 out=new OuterClass1();
		out.outerClassMethod();
	}

}
