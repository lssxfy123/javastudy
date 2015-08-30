package exception_test1;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int m = 0;
		
		try {
			int result = quotient(n, m);
			System.out.println(n + " / " + m + " is " + result);
		} catch (ArithmeticException e) {  // 处理异常
			// TODO: handle exception
			System.out.println("Exception : an integer " + 
			"can`t be divided by zero");
			System.out.println("Exception message: " + e.getMessage());
		}
		
		System.out.println("Execution continues ...");

	}
	
	public  static int quotient(int number1, int number2) {
		if (number2 == 0) {
			throw new ArithmeticException("Divisor can`t be zero");  // 抛出异常
		}
		return number1 / number2;
	}

}
