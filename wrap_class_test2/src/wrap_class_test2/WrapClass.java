package wrap_class_test2;

public class WrapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = new Integer[3];
		intArray[0] = new Integer(3);
		intArray[1] = new Integer(2);
		intArray[2] = new Integer(8);
		
		sort(intArray);
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}
	
	public static void sort(Comparable[] list) {
		Comparable currentMin;
		
		for (int i = 0; i < list.length - 1; i++) {
			currentMin = list[i];
			int currentMinIndex = i;
			
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin.compareTo(list[j]) > 0) {
					currentMin = list[j];
					currentMinIndex = j;				
				}
			}
			
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}

}
