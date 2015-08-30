package exception_test5;

public class CircleWithException {
	private double radius;
	private static int numberOfObjects = 0;
	
	public CircleWithException() {
		// TODO Auto-generated constructor stub
		this(1.0);
	}
	
	public CircleWithException(double radius) {
		setRadius(radius);
		numberOfObjects++;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		if (radius >= 0) {
			this.radius = radius;
		} else {
			throw new IllegalArgumentException("Radius can`t be negative");
		}
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	public double findArea() {
		return radius * radius * Math.PI;
	}
}
