package function_test3;

public class RandomCharacter {
	// �������ַ�ch1��ch2֮�������ַ�
	public static char GetRandomCharacter(char ch1, char ch2) {
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));		
	}
	
	public static char GetRandomLowerCaseLetter() {
		return GetRandomCharacter('a', 'z');
	}
	
	public static char GetRandomUpperCaseLetter() {
		return GetRandomCharacter('A', 'Z');
	}
}
