package multi_array_test1;

public class MultiArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix;  // 声明一个二维数组
		matrix = new int[5][5];
		int [] x = {1, 2};
		matrix[0] = x;
		System.out.println(matrix[0][1]);
		System.out.println("matrix[0] length = " + matrix[0].length);  // 2，matrix[0]与x为同一数组的引用
		
		// Java中，多维数组初始化需要如下赋值
		// 而在C++中，可以有两种赋值方式：
	    // int c[2][3] = {{1, 2, 3,}, {4, 5, 6}};
	    // int c[2][3] = {1, 2, 3, 4, 5, 6};  // 在C++中，二维数组可以这样赋值
		int [][] array = {{1, 2, 3}, {4, 5, 6}};

		System.out.println("array length = " + array.length); // 2
		System.out.println("array[0] length = " + array[0].length);  // 3
		System.out.println("array[1] length = " + array[1].length);  // 3
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		// 锯齿数组
		int [][] triangleArray = {{1, 2, 3, 4, 5}, {1,2 ,3 ,4}, {1, 2, 3}};
		System.out.println("triangleArray length = " + triangleArray.length); // 3
		System.out.println("triangleArray[0] length = " + triangleArray[0].length);  // 5
		System.out.println("triangleArray[1] length = " + triangleArray[1].length);  // 4
		System.out.println("triangleArray[2] length = " + triangleArray[2].length);  // 3
		
		int [][] triangleArray1 = new int[3][];
		triangleArray1[0] = new int[5];
		triangleArray1[1] = new int[4];
		triangleArray1[2] = new int[3];
		
	}

}
