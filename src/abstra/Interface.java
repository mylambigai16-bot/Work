package abstra;

interface Shape1{
	double default_value = 1;

	double Area();

	double Perimeter();

	default String display() {
		return "something";
	}
}

	class Circle1 implements Shape1 {
		private double radius;

		public Circle1(double rad) {
			this.radius = rad;
		}

		public Circle1() {
			this.radius = default_value;
		}
		
		public double Area() {
			return Math.PI*radius*radius;
		}

		public double Perimeter() {
			return 2 * Math.PI * radius;
		}

	public String display() {
		return "Circle radius "+radius;
	}
	}

	class Rectangular1 implements Shape1{
		private double len;
		private double br;

		public Rectangular1(double len, double br) {
			this.len = len;
			this.br = br;
		}

		public Rectangular1() {
			this.len = default_value;
			this.br = default_value;
		}

		public double Area() {
			return len * br;
		}

		public double Perimeter() {
			return 2 * (len + br);
		}
		public String display() {
			return "Rectangular length:"+len+" width:"+br;
		}
	}

public class Interface {

	public static void main(String[] args) {
		
		Circle1 cir = new Circle1(5);
	
		cir.Area();
        cir.Perimeter();
        System.out.println(cir.display());
		
	}

}
