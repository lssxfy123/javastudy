package class_test8;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 这里无法创建Inner对象
		// 原因是Inner为内部类
		// main函数为静态函数
		// Inner类的构造函数对于
		// ClassTest类来说为其实例函数
		// Inner inner = new Inner();
		
		// 可以用下面这种方式来创建Inner对象
		Inner inner = new ClassTest().new Inner();
		
		// 也可以将内部类定义为static
		Inner1 inner1 = new Inner1();
	}
	
	class Inner {
		public Inner() {
			// TODO Auto-generated constructor stub
		}
	}
	
	static class Inner1 {
		public Inner1() {
			// TODO Auto-generated constructor stub
		}
	}

}
