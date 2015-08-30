package class_test7;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle [] circleArray = new Circle[5];
		
		for (int i = 0; i < circleArray.length; i++) {
			circleArray[i] = new Circle(Math.random() * 100);
		}
		
		printCircleArray(circleArray);
	}
	
	public static void printCircleArray(Circle [] circleArray) {
		System.out.printf("%-30s%-15s\n", "Radius", "Area");
		for (int i = 0; i < circleArray.length; i++) {
			System.out.printf("%-30f%-15f\n", circleArray[i].getRadius()
					,circleArray[i].getArea());
		}
	}

}
