package array_test3;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] numbers = {2.4, 3.5, 4.6, 7.8};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		char [] chars = {'a', 'b', 'c'};
		System.out.println(chars);
		
		for (char ch:chars) { // for-eachÑ­»·
			System.out.println(ch);
		}
		
		for (double u : numbers) {  // for-eachÑ­»·
			System.out.println(u);
		}
		
		int [] array = {1, 2, 4, 5};
		int [] x = {1, 2};
		array = x;
		System.out.println("array length = " + array.length);  // 2

	}

}
