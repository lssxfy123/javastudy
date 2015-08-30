package array_test7;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] list = {1.2, 4.5, -4.3, -9.2, 3.1};
		for (double u:list) {
			System.out.print(u);
			System.out.print(" ");
		}
		
		SelectSort.selectSort(list);
		
		System.out.println();
		for (double u:list) {
			System.out.print(u);
			System.out.print(" ");
		}
	}

}
