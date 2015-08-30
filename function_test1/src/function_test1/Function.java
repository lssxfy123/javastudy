package function_test1;

public class Function {

	public static int max(int a, int b) {
		int result = 0;
		
		if (a >= b) {
			result = a;
		}
		else {
			result = b;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2;
		int b = 3;
//		float a = 2.3;  // error:max函数无法接收float型变量，不同于C++
//		float b = 2.4;
		
		System.out.println("The maximum between " + a 
				+ " and " + b + " is " + max(a, b));
	}

}
