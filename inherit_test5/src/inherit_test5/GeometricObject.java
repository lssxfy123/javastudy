package inherit_test5;

public class GeometricObject {
	String name;
}

class Circle extends GeometricObject{
	public void print() {
		// ͬһ���е�����Է���Ĭ�����η���������ĳ�Ա
		name = "Circle";
		System.out.println(name);
	}
}
