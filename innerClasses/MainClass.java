package innerClasses;



class OuterClass {
	int age=18;
	public void checkAge() {
		System.out.println("In checkAge() Method call");
	}
	class InnerClass{
		public void show() {
			System.out.println("In show() Method call in inner class");
		}
	}

}
class MainClass{
	public static void main(String[] args) {
		OuterClass out=new OuterClass();
		System.out.println("Outer class Age: "+out.age);
		out.checkAge();
		OuterClass.InnerClass in=out.new InnerClass();
		in.show();
	}
	
}
