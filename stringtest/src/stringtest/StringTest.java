package stringtest;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��C++�У�����һ���ַ�ָ�룬�޷���������Ĳ���
		// ��Ϊ���ܽ�ָ�����
		String message = "Welcome " + "to " + "Java";
		
		// ��C++�У�����һ���ַ�ָ�룬���Խ�������Ĳ�������
		// ���Ϊ��ָ���ƶ���2�κ���ַ���
		// char* str = "Chapter" + 2;  // ���Ϊ��apter
		String s = "Chapter" + 2;
		String s1 = "Supplement" + 'B';
		
		System.out.println(message);
		System.out.println(s);
		System.out.println(s1);
	}

}
