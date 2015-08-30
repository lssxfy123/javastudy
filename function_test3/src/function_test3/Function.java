package function_test3;

public class Function {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int kNumberOfChars = 175;  // 定义常量
		final int kCharsPerLine = 25;
		
		for (int i = 0; i < kNumberOfChars; i++) {
			char ch = RandomCharacter.GetRandomLowerCaseLetter();
			
			if ((i + 1) % kCharsPerLine == 0) {
				System.out.println(ch);
			} else {
				System.out.print(ch);
			}
			
		}

	}

}
