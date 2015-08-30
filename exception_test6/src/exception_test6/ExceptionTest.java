package exception_test6;

import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter output = null;
		
		try {
			output = new PrintWriter("test.txt");
			output.println("Welcome to java");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			if (output != null) {
				output.close();
			}
		}
		
		System.out.println("End of program");
	}

}
