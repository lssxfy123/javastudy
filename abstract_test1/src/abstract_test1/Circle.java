package abstract_test1;

public class Circle extends GeometricObject {  // 类的继承
	private double radius;
	
	public Circle(double radius, String color, boolean filled) {
		// TODO Auto-generated constructor stub
		// 这里必须显示的通过super关键字来调用
		// 父类的构造函数，原因是父类没有定义
		// 无参构造函数，这点类似C++
		super(color, filled);  // 必须放在最前面
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadus(double radius) {
		this.radius = radius;
	}
	
	// 子类如果不为抽象类，必须实现抽象父类中的所有抽象方法
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
}

