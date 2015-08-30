package stringtest;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 在C++中，定义一个字符指针，无法进行下面的操作
		// 因为不能将指针相加
		String message = "Welcome " + "to " + "Java";
		
		// 在C++中，定义一个字符指针，可以进行下面的操作，但
		// 结果为将指针移动了2次后的字符串
		// char* str = "Chapter" + 2;  // 输出为：apter
		String s = "Chapter" + 2;
		String s1 = "Supplement" + 'B';
		
		System.out.println(message);
		System.out.println(s);
		System.out.println(s1);
	}

}
