package string_test4;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Java";
		System.out.println("string length is " + string.length());  // 4
		
		string = string + " and " + "HTML";
		System.out.println(string);  // Java and HTML
		
		// 允许使用字符串直接量调用方法
		System.out.println("Welcome to Java".charAt(0));  // W
		
	}

}
