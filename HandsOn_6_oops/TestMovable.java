package HandsOn_6_oops;

interface Movable {
	void moveUp();

	void moveDown();

	void moveLeft();

	void moveRight();
}

class MovablePoint implements Movable {
	int x;
	int y;
	int xSpeed;
	int ySpeed;

	// Constructor
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public void moveUp() {
		y += ySpeed;
	}

	@Override
	public void moveDown() {
		y -= ySpeed;
	}

	@Override
	public void moveLeft() {
		x -= xSpeed;
	}

	@Override
	public void moveRight() {
		x += xSpeed;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + "), speed=(" + xSpeed + "," + ySpeed + ")";
	}
}

class MovableCircle implements Movable {
	private int radius;
	private MovablePoint center;

	// Constructor
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		this.center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}

	@Override
	public void moveUp() {
		center.moveUp();
	}

	@Override
	public void moveDown() {
		center.moveDown();
	}

	@Override
	public void moveLeft() {
		center.moveLeft();
	}

	@Override
	public void moveRight() {
		center.moveRight();
	}

	@Override
	public String toString() {
		return "Center: " + center.toString() + ", Radius: " + radius;
	}
}

public class TestMovable {
	public static void main(String[] args) {

		// Test MovablePoint
		MovablePoint p = new MovablePoint(0, 0, 2, 3);
		System.out.println("Before Move Point: " + p);

		p.moveUp();
		p.moveRight();

		System.out.println("After Move Point: " + p);

		// Test MovableCircle
		MovableCircle c = new MovableCircle(5, 5, 1, 1, 10);
		System.out.println("\nBefore Move Circle: " + c);

		c.moveDown();
		c.moveLeft();

		System.out.println("After Move Circle: " + c);
	}
}