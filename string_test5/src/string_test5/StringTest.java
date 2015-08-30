package string_test5;

import java.text.DecimalFormat;

import org.omg.CORBA.portable.ValueBase;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 字符串转换
		String string = "Welcome to Java";
		System.out.println(string.toLowerCase());  // 转换为小写
		System.out.println(string.toUpperCase());  // 转换为大写
		
		// 替换指定位置的字符串
		string = replaceIndex(string, "s", 3);
		System.out.println(string);
		
		// 正则表达式
		String s = "a+b$#c".replaceAll("[$+#]", "NNN");  // 匹配替换$、+、#
		System.out.println(s);  // aNNNbNNNNNNc
		
		// 返回字符串中某个字符或子串的位置
		System.out.println("Welcome to Java".indexOf("come"));  // 3，子串起始字符的位置
		
		// 返回字符串从某一位置之后第一次出现指定字符的位置
		System.out.println("Welcome to Java".indexOf('o', 5));  // 9
		
		// 返回字符串最后一次出现指定字符串的位置
		System.out.println("Welcome to Java".lastIndexOf("Java"));  // 9
		
		// 返回字符串某一位置之前最后出现指定字符串的位置
		System.out.println("Welcome to Java".lastIndexOf("Java", 5));  // -1，表示没有
		
		// 字符串与字符串数组的转换
		char [] charArray = "Java".toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i] + ", ");
		}
		System.out.println();
		
		char [] dst = {'J', 'A', 'V', 'A', '1', '3', '0', '1'};
		
		// 将字符串CS3720下标从2-6的子串复制到数组dst中下标从4开始的位置
		"CS3720".getChars(2, 6, dst, 4);
		System.out.println(dst);
		
		// 利用数组创建字符串
		String string2 = new String(new char[]{'J', 'a', 'v', 'a'});
		String string3 = String.valueOf(new char[]{'J', 'a', 'v', 'a'});
		System.out.println(string2);
		System.out.println(string3);
		
		// 字符串与数字的转换
		String string4 = String.valueOf("5.44");
		System.out.println(string4);
		
		double d = Double.parseDouble("5.44");
		
		System.out.println("The decimal value for hex AB8C is "
		+ hexToDecimal("AB8C".toUpperCase()));
	}
	
	// 替换指定位置的字符
	public static String replaceIndex(String src, String replacement, int index) {
		String result;
		if (index >= src.length()) {
			return src;
		}
		
		result = src.substring(0, index) + replacement + src.substring(index + 1);
		return result;
	}
	
	// 十六进制转换为十进制
	// 这里要注意十六进制字符串
	// 的顺序与我们平时计算
	// 十六进制大小的顺序是相反的
	public static int hexToDecimal(String hex) {
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) {
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}
	
	public static int hexCharToDecimal(char ch) {
		if (ch >= 'A' && ch <= 'Z') {
			return 10 + ch - 'A';
		} else {
			return ch - '0';
		}
	}

}
