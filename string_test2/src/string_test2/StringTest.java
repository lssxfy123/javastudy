package string_test2;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "Welcome to Java";
		String string2 = new String("Welcome to Java");
		char [] charArray = {'W', 'e', 'l', 'c', 'o', 'm', 'e', ' ', 't', 'o', ' ', 'J', 'a', 'v', 'a'};
		String string3 = new String(charArray);
		
		System.out.println(string1);  // Welcome to Java
		System.out.println(string2);  // Welcome to Java
		System.out.println(string3);  // Welcome to Java
		
		String string4 = "Java";
		string4 = "HTML";
		System.out.println(string4);  // HTML
		
		// �޶��ַ���
		String s1 = "Java";
		String s2 = new String("Java");
		String s3 = "Java";
		
		// s1��s2���ַ�����ֵ��ͬ������ָ��Ķ���ͬ
		System.out.println("s1 == s2 is " + (s1 == s2));  // false
		
		// Java�о�����ͬ�ַ������е��ַ���ֱ����ָ��ͬһ������
		// ����s1����s3
		System.out.println("s1 == s3 is " + (s1 == s3));  // true
	}

}
