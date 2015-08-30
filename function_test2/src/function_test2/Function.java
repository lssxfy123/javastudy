package function_test2;

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
	
	// 函数重载
	public static double max(double a, double b) {
		double result = 0;
		
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
		float c = (float)2.3;  // 必须使用显示强制转换，否则无法将double赋给float
		float d = (float)6.5;
		double e = 4.5;
		double f = 4.8;
		
		System.out.println("The maximum between " + a 
				+ " and " + b + " is " + max(a, b));
		
		System.out.println("The maximum between " + c 
				+ " and " + d + " is " + max(c, d));
		
		System.out.println("The maximum between " + e 
				+ " and " + f + " is " + max(e, f));

	}

}
