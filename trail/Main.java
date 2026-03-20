package trail;

class Base {
	public Base() {
		System.out.print("Base");
	}
}

public class Main extends Base {
     public Main(){
         this("Java");
         System.out.print("Derived");
}

 public Main(String s) {
	  System.out.print(s);
}

public static void main(String[]args){
      new Main();
}
}