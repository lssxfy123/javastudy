package inherit_test5;

public class GeometricObject {
	String name;
}

class Circle extends GeometricObject{
	public void print() {
		// 同一包中的类可以访问默认修饰符的其他类的成员
		name = "Circle";
		System.out.println(name);
	}
}
