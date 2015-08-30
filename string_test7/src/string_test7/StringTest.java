package string_test7;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Welcome");
		stringBuilder.append(" ");
		stringBuilder.append("to");
		stringBuilder.append(" ");
		stringBuilder.append("Java");
		System.out.println(stringBuilder);
		
		stringBuilder.append(true);
		System.out.println(stringBuilder);  // Welcome to Javatrue
		
		stringBuilder.append(6.5);
		System.out.println(stringBuilder);  // Welcome to Javatrue6.5
		
		StringBuilder stringBuilder2 = new StringBuilder("Welcome to Java");
		
		// ɾ���ַ����±��8-11���ַ�
		System.out.println(stringBuilder2.delete(8, 11));
		
		// ɾ���ַ����±�Ϊ5���ַ�
		System.out.println(stringBuilder2.deleteCharAt(5));
		
		// ��ת
		System.out.println(stringBuilder2.reverse());
		
		// �滻����HTML�滻�ַ����±��0-3���ַ���
		// ע���2������λ�ò�����Ҫ-1���ο�����ԭ��
		System.out.println(stringBuilder2.replace(0, 4, "HTML"));
		
		// ����ָ��λ�õ��ַ�
		stringBuilder2.setCharAt(0, 'W');
		System.out.println(stringBuilder2);
		
		String string = stringBuilder2.toString();
		System.out.println(string);
		
		StringBuilder stringBuilder3 = new StringBuilder("Java HTML");
		System.out.println("length is " + stringBuilder3.length());  // 9
		System.out.println("capacity is " + stringBuilder3.capacity());  // 25
		stringBuilder3.trimToSize();
		System.out.println("capacity is " + stringBuilder3.capacity());  // 9
	}

}
