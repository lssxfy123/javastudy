package class_test6;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		System.out.println("The area of circle of radius " 
		+ circle.getRadius() + " is " + circle.getArea());
		
		circle.setRadius(5.4);
		
		System.out.println("The area of circle of radius " 
		+ circle.getRadius() + " is " + circle.getArea());
		
		System.out.println("The number of objects created is " 
		+ Circle.getNumberOfObjects());
		
		// 类对象作为形参，传递的为对象的引用
		// 在方法中修改circle的radius_，会影响
		// 到实参的radius_
		modifyRadius(circle);
		System.out.println("The area of circle of radius " 
		+ circle.getRadius() + " is " + circle.getArea());
		
	}
	
	// 类对象作为形参
	public static void modifyRadius(Circle circle) {
		circle.setRadius(circle.getRadius() + 1);
	}
}
