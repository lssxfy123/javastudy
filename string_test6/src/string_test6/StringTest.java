package string_test6;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ַ���Charcater��Ϊchar���͵İ�װ��
		Character character = new Character('a');
		System.out.println(character.equals('a'));  // true
		System.out.println(character.compareTo(new Character('b')));  // -1���ֵ���ľ���
		System.out.println(character.compareTo(new Character('c')));  // -2
		System.out.println(Character.toUpperCase('a'));  // ��д�ַ�
		System.out.println(Character.toLowerCase('A'));  // Сд�ַ�
	}

}
