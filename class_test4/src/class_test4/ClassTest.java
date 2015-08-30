package class_test4;

import class_test5.*;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 可以定义一个Selectsort对象，但无法调用其构造函数
		// 原因是包class_test5中Selectsort类的构造函数没有
		// 使用public可见性修饰符，只能在包class_test5中访问
		// 如果去掉类SelectSort前的public修饰符，则此处无法
		// 定义SelectSort
		SelectSort selectSort;
	}

}

