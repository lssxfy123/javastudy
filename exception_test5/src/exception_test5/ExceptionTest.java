package exception_test5;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CircleWithException c1 = new CircleWithException(5);
			CircleWithException c2 = new CircleWithException(-5);
			CircleWithException c3 = new CircleWithException(10);
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		System.out.println("Number of objects created " 
		+ CircleWithException.getNumberOfObjects());  // 1，创建c2抛出异常，只有c1对象被创建
	}

}
