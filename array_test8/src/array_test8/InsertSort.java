package array_test8;

// ������������
 class InsertSort {
	public static void insertSort(double [] list) {
		for (int i = 1; i < list.length; i++) {
			double currentElement = list[i];
			
			int j;
			
			// �ӵ�i-1��ʼ����������list[i]�������һλ
			for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
				list[j + 1] = list[j];
			}
			
			// ��list[i]���뵽������
			list[j + 1] = currentElement;
		}
	}

}
