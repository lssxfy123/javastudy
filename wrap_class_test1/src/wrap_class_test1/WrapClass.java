package wrap_class_test1;

public class WrapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer integer = new Integer(5);
		integer = new Integer("5");
		integer = 5;
		// integer = new Integer("3.2");  // 编译没问题，但允许会抛出数字格式异常
		
		Integer integer2 = 6;
		
		System.out.println(integer + integer2);

	}
	
}
