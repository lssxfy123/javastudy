package exception_test2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		
		try {
			Scanner input = new Scanner(file);
			System.out.println("file " + file.getName() + " exist");
			
			input.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("file " + file.getName() + " not exist");
		}
		
		System.out.println("Execution continues...");
	}

}
