package array_test4;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 1.2;
		func1(d);
		System.out.println(d);  // d = 1.2，采用值传递，传递的为实参的副本
		
		double [] numbers = {1.2, 2.3, 3.4};
		func2(numbers);
		System.out.println(numbers[0]);  // numbers[0] = 5.6，同样采用的值传递，类似C++中的指针传递

	}
	
	public static void func1(double d) {
		d = 5.6;	
	}

	public static void func2(double [] d) {
		d[0] = 5.6;	
	}
}
