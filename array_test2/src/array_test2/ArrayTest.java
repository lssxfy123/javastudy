package array_test2;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �����Ĭ��ֵ
		int [] array_int = new int [3];
		double [] array_double = new double[3];
		char [] array_char = new char[3];
		boolean [] array_boolean = new boolean[3];
		
		System.out.println("int������Ĭ��ֵ��");
		for (int i = 0; i < array_int.length; i++) {
			System.out.println(array_int[i]);
		}
		
		System.out.println("double������Ĭ��ֵ��");
		for (int i = 0; i < array_double.length; i++) {
			System.out.println(array_double[i]);
		}
		
		System.out.println("char������Ĭ��ֵ��");
		for (int i = 0; i < array_char.length; i++) {
			System.out.println(array_char[i]);
		}
		
		System.out.println("boolean������Ĭ��ֵ��");
		for (int i = 0; i < array_boolean.length; i++) {
			System.out.println(array_boolean[i]);
		}
 
	}

}
