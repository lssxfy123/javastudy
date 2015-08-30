package string_test5;

import java.text.DecimalFormat;

import org.omg.CORBA.portable.ValueBase;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ַ���ת��
		String string = "Welcome to Java";
		System.out.println(string.toLowerCase());  // ת��ΪСд
		System.out.println(string.toUpperCase());  // ת��Ϊ��д
		
		// �滻ָ��λ�õ��ַ���
		string = replaceIndex(string, "s", 3);
		System.out.println(string);
		
		// ������ʽ
		String s = "a+b$#c".replaceAll("[$+#]", "NNN");  // ƥ���滻$��+��#
		System.out.println(s);  // aNNNbNNNNNNc
		
		// �����ַ�����ĳ���ַ����Ӵ���λ��
		System.out.println("Welcome to Java".indexOf("come"));  // 3���Ӵ���ʼ�ַ���λ��
		
		// �����ַ�����ĳһλ��֮���һ�γ���ָ���ַ���λ��
		System.out.println("Welcome to Java".indexOf('o', 5));  // 9
		
		// �����ַ������һ�γ���ָ���ַ�����λ��
		System.out.println("Welcome to Java".lastIndexOf("Java"));  // 9
		
		// �����ַ���ĳһλ��֮ǰ������ָ���ַ�����λ��
		System.out.println("Welcome to Java".lastIndexOf("Java", 5));  // -1����ʾû��
		
		// �ַ������ַ��������ת��
		char [] charArray = "Java".toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i] + ", ");
		}
		System.out.println();
		
		char [] dst = {'J', 'A', 'V', 'A', '1', '3', '0', '1'};
		
		// ���ַ���CS3720�±��2-6���Ӵ����Ƶ�����dst���±��4��ʼ��λ��
		"CS3720".getChars(2, 6, dst, 4);
		System.out.println(dst);
		
		// �������鴴���ַ���
		String string2 = new String(new char[]{'J', 'a', 'v', 'a'});
		String string3 = String.valueOf(new char[]{'J', 'a', 'v', 'a'});
		System.out.println(string2);
		System.out.println(string3);
		
		// �ַ��������ֵ�ת��
		String string4 = String.valueOf("5.44");
		System.out.println(string4);
		
		double d = Double.parseDouble("5.44");
		
		System.out.println("The decimal value for hex AB8C is "
		+ hexToDecimal("AB8C".toUpperCase()));
	}
	
	// �滻ָ��λ�õ��ַ�
	public static String replaceIndex(String src, String replacement, int index) {
		String result;
		if (index >= src.length()) {
			return src;
		}
		
		result = src.substring(0, index) + replacement + src.substring(index + 1);
		return result;
	}
	
	// ʮ������ת��Ϊʮ����
	// ����Ҫע��ʮ�������ַ���
	// ��˳��������ƽʱ����
	// ʮ�����ƴ�С��˳�����෴��
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
