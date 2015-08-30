package object_test2;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		circle.setId(1).setRadius(2.0);
	}

}

class Circle {
	private double radius;
	private int id;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle() {
		// 使用this调用另一个构造方法，在Java中提倡这么做
		// 这条语句必须出现在其他语句之前
		this(1.0);
	}
	
	public Circle setRadius(double radius) {
		this.radius = radius;
		return this;
	}
	
	public Circle setId(int id) {
		this.id = id;
		return this;
	}
	
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}
}
