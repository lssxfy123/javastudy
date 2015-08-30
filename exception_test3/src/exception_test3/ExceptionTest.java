package exception_test3;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		
		do {
			try {
				System.out.println("Enter an integer : ");
				int number = input.nextInt();
				
				System.out.println("The number entered is " + number);
				continueInput = false;
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Try again. (Incorrect input:an integer is required)");
				
				input.nextLine();  // 忽略之前的错误输入
				
			}
		} while (continueInput);
		
		input.close();
	}

}
