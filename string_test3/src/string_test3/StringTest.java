package string_test3;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Java");
		String s2 = "Java";
		String s3 = "C++";
		
		System.out.println(s1.equals(s2));  // true
		System.out.println(s1.equals(s3));  // false
		
		System.out.println(s1.compareTo(s2));  // 0
		System.out.println(s1.compareTo(s3));  // 7
	}

}
