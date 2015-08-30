package string_test6;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 字符类Charcater，为char类型的包装类
		Character character = new Character('a');
		System.out.println(character.equals('a'));  // true
		System.out.println(character.compareTo(new Character('b')));  // -1，字典序的距离
		System.out.println(character.compareTo(new Character('c')));  // -2
		System.out.println(Character.toUpperCase('a'));  // 大写字符
		System.out.println(Character.toLowerCase('A'));  // 小写字符
	}

}
