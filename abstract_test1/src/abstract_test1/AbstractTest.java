package abstract_test1;

public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GeometricObject object = new Circle(5.0, "red", false);
		displayGeometricObject(object);

	}
	
	// 在抽象类中定义抽象方法的好处，抽象类变量作为形参
	// 如果没有抽象方法，则无法调用其子类中的覆盖方法
	public static void displayGeometricObject(GeometricObject object) {
		System.out.println("The area is " + object.getArea());
		System.out.println("The perimeter is " + object.getPerimeter());
	}
	
}
