package genrics;

class Demo<T>{
	private T t;
	public void set(T t) {
		this.t=t;
	}
	public T get() {
		return t;
	}
}
public class Genrics {

	public static void main(String[] args) {
		Demo<Integer> integer=new Demo<>();
		integer.set(25);
		System.out.println(integer.get());
		
		Demo<String> string=new Demo<>();
		string.set("Myl");
		System.out.println(string.get());

	}

}
