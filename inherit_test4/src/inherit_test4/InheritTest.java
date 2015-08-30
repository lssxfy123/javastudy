package inherit_test4;

public class InheritTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object circle1 = new Circle();
		Object circle2 = new Circle();
		
//		// 这里返回的结果为false，原因是其未调用Circle
//		// 自定义的equals方法，而是调用了Object类中的
//		// equals方法，其比较的是两个变量是否指向同一个
//		// 对象。
//		// 尽管circle1对象的声明类型为父类，实际类型为
//		// 子类类型，但其并未发生动态绑定，原因是Circle
//		// 类中的equals方法并未覆盖父类Object的equals方法
//		// 它们的形参类型不同，所以其构成了方法的重载
//		System.out.println(circle1.equals(circle2));
		
		System.out.println(circle1.equals(circle2));
		
	}

}
