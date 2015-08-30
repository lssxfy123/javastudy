package exception_test4;

// import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
	}
	
	public static void method1() {
		try {
			method2();
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("method1: " + e.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void method2() {
		try {
			method3();
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("method2: " + e.getMessage());
		}
	}
	
	public static void method3() {
		throw new ArithmeticException("throw arithmetic exception");
	}
	
//	public static void p1() {
//		try {
//			p2();
//		} catch (IOException e) {
//			// TODO: handle exception
//		}
//	}
//	
//	public static void p2() throws IOException {
//		
//	}

}
