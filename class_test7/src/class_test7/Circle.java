package class_test7;

public class Circle {
	public Circle() {
		++numberOfObjects_;
		radius_ = 1.0;
	}
	
	public Circle(double radius) {
		++numberOfObjects_;
		radius_ = radius;
	}
	
	public double getRadius() {
		return radius_;
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects_;
	}
	
	public double getArea() {
		return radius_ * radius_ * Math.PI;
	}
	
	public void setRadius(double radius) {
		radius_ = radius;
	}
	
	private double radius_;
	private static int numberOfObjects_;

}
