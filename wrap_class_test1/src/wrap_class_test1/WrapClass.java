package wrap_class_test1;

public class WrapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer integer = new Integer(5);
		integer = new Integer("5");
		integer = 5;
		// integer = new Integer("3.2");  // ����û���⣬��������׳����ָ�ʽ�쳣
		
		Integer integer2 = 6;
		
		System.out.println(integer + integer2);

	}
	
}
