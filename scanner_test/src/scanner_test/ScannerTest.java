package scanner_test;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double k = input.nextDouble();
		String string = input.nextLine();
		
		input.close();
		
		System.out.println("n = " + n);
		System.out.println("k = " + k);
		System.out.println("string = " + string);
	}

}
