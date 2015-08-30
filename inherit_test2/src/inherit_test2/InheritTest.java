package inherit_test2;

public class InheritTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A b = new B();
		b.p(10);  // B::p
		b.p(10.0);  // B::p
		
//		B b = new B();
//		b.p(10);  // B::p
//		b.p(10.0);  // A::p
	}

}

class A {
	public void p(double i) {
		System.out.println("A::p");
	}
}

class B extends A {
	public void p(double i) {
		System.out.println("B::p");
	}
}

//class A {
//	public void p(double i) {
//		System.out.println("A::p");
//	}
//}
//
//class B extends A {
//	public void p(int i) {
//		System.out.println("B::p");
//	}
//}
