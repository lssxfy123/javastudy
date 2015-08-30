package inherit_test3;

public class InheritTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object = new GeometricObject();
		System.out.println(object.toString());  // 调用GeometricObject中的toString方法
		
		if (object instanceof GeometricObject) {
			GeometricObject geometric = (GeometricObject)object;
			System.out.println(geometric.toString());
		}
		
		m(new GraduateStudent());  // Student
		m(new Student());  // Student
		m(new Person());  // Person
		m(new Object());  // java.lang.Object@19e0bfd
		
	}
	
	public static void m(Object x) {
		System.out.println(x.toString());
	}

}

class GraduateStudent extends Student {
	
}

class Student extends Person {
	public String toString() {
		return "Student";
	}
}

class Person extends Object {
	public String toString() {
		return "Person";
	}
}
