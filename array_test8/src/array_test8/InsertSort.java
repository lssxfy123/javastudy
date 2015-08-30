package array_test8;

// 插入排序：升序
 class InsertSort {
	public static void insertSort(double [] list) {
		for (int i = 1; i < list.length; i++) {
			double currentElement = list[i];
			
			int j;
			
			// 从第i-1开始，如果其大于list[i]，则后移一位
			for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
				list[j + 1] = list[j];
			}
			
			// 将list[i]插入到序列中
			list[j + 1] = currentElement;
		}
	}

}
