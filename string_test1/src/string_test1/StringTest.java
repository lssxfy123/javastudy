package string_test1;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] charArray = {'a', 'b', 'c'};
		charTest(charArray);
		System.out.println(charArray);  // pbc
		
		char [] charArray1 = {'a', 'b', 'c'};
		String string = new String(charArray1);
		charTest1(string);
		System.out.println(string);  // abc
		
		// Interger���String�������ͬ
		// �ڲ��������У��βεĸı䲻Ӱ��ʵ��
		Integer integer = new Integer(7);
		// integer = 9;
		System.out.println(integer);  // 7
	}
	
	public static void charTest(char [] charArray) {
		charArray[0] = 'p';
	}
	
	public static void charTest1(String string) {
		string.replace('a', 'p');
	}
	
	public static void integerTest(Integer integer) {
		integer = 5;  // ���������޸�Integer�б����intֵ
	}

}
