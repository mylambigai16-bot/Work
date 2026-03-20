package abstra;

abstract class Shape {
	void draw() {
		System.out.println("Drawing");
	}

	abstract void area();

	abstract void perimeter();
}

class Rectangular extends Shape {
	private int len;
	private int br;

	Rectangular(int len, int br) {
		this.len = len;
		this.br = br;
	}

	void area() {
		System.out.println("Area of rectangle: " + (len * br));
	}

	void perimeter() {
		System.out.println("Perimeter of the tectangle: " + (2 * (len + br)));
	}
}

	class Square extends Shape {
		private int side;

		Square(int side) {
			this.side = side;
		}

		void area() {
			System.out.println("Are of Square: " + (side * side));
		}

		void perimeter() {
			System.out.println("Perimeter of the square: " + (4 * side));
		}
	}

	class Circle extends Shape {
		private double radius;
		private double pi = 3.14;

		Circle(double radius) {
			this.radius = radius;
		}

		void area() {
			System.out.println("Are of circle: " + (pi * radius * radius));
		}

		void perimeter() {
			System.out.println("perimeter of the circle: " + (2 * pi * radius));
		}

	}


public class Display {

	public static void main(String[] args) {
		
		Shape s;

		s = new Rectangular(3, 5);
		s.area();
		s.perimeter();

		s = new Square(2);
		s.area();
		s.perimeter();

		s = new Circle(2);
		s.area();
		s.perimeter();
		s.draw(); 
	}

}
