package array_test9;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1, 2, 3};
		func(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void func(int [] array) {
		array = new int[4];  // ������C++�е�ָ�룬�����main������ʵ�ι���Ӱ��
	}

}
