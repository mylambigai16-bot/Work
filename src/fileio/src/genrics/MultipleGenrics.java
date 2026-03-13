package genrics;

class Test<T,U,R>{
	T a1;
	U a2;
	R a3;
	Test(T a1,U a2,R a3){
		this.a1=a1;
		this.a2=a2;
		this.a3=a3;
	}
	public void  display() {
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}
}
public class MultipleGenrics {

	public static void main(String[] args) {
		Test<String,Integer,Double> m=new Test<>("Myl",21,2.1);
		m.display();
	}

}
