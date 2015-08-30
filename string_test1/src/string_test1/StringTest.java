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
		
		// Interger类和String类情况相同
		// 在参数传递中，形参的改变不影响实参
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
		integer = 5;  // 可以这样修改Integer中保存的int值
	}

}
