package polymorphism;

class Vehicle {
	void run(){
		System.out.println("Vehivle is running");
	}
}
class Truck extends Vehicle{
	void run() {
		System.out.println("Truck i runing");
	}
}
class Overrriden{
	public static void main(String[] args) {
		Vehicle x=new Vehicle();
		x.run();
		Vehicle x1=new Truck();
		x1.run();

	}

}
