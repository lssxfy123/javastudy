package array_test1;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] numbers = new double[10];  // 定义一维数组
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter a new number : ");
			numbers[i] = input.nextDouble();		
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		input.close();
	}

}
