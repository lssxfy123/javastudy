package array_test6;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] list = {1, 2, 3};
		int [] reverse_list = reverse(list);
		for (int n:reverse_list) {
			System.out.println(n);
		}

	}
	
	public static int[] reverse(int [] list) {
		int [] result = new int[list.length];
		
		for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
			result[i] = list[j];		
		}
		return result;
		
	}

}
