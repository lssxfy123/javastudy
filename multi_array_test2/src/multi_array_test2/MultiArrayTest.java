package multi_array_test2;

import java.util.Scanner;

public class MultiArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array = new int[4][4];
		int sum = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a 4-by-4 matrix row by row");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextInt();
				sum += array[i][j];
			}		
		}
		
		input.close();
		System.out.println("Sum of the array is " + sum);
	}

}
