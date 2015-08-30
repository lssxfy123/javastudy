package class_test1;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 使用new操作符是调用构造函数
		// 与数组类似，下面的语句执行了两个操作
		// 1. new Circle()创建一个类对象
		// 2. 将类对象的引用赋给变量circle
		Circle circle = new Circle(23.5);
		System.out.println("The area of the circle of radius "
		+ circle.radius_ + " is " + circle.getArea());
		
		Circle circle1 = new Circle();
		System.out.println("The area of the circle1 of radius "
		+ circle1.radius_ + " is " + circle1.getArea());
		
		// 匿名对象
		System.out.println("Area is " + new Circle(5).getArea());
		
		Rectangle rectangle = new Rectangle(2.5, 5.6);
		System.out.println("The area of the rectangle of width "
				+ rectangle.width_ + " and height " + rectangle.height_ 
				+ " is " + rectangle.getArea());
	}
	
}

class Circle {
	Circle() {
		// radius_ = 1.0;
		// TODO Auto-generated constructor stub
	}
	
	Circle(double radius) {
		radius_ = radius;
	}
	
	double getArea() {
		return radius_ * radius_ * Math.PI;
	}
	
    double radius_ = 4.5;
}

class Rectangle {
	Rectangle() {
		// TODO Auto-generated constructor stub
		width_ = 1.0;
		height_ = 1.0;
	}
	
	Rectangle(double width, double height) {
		width_ = width;
		height_ = height;
	}
	
	double getArea() {
		return width_ * height_;
	}
	
	double width_;
	double height_;
}
