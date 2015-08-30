package class_test3;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(2.5);
		
		System.out.println("Number of objects is " + Circle.getNumberOfObjects());
	}

}

class Circle {
	Circle() {
		radius_ = 1.0;
		++numberOfObjects_;
		// TODO Auto-generated constructor stub
	}
	
	Circle(double radius) {
		++numberOfObjects_;
		radius_ = radius;
	}
	
	double getArea() {
		return radius_ * radius_ * Math.PI;
	}
	
	static int getNumberOfObjects() {
		return numberOfObjects_;
	}
	
    double radius_;
    static int numberOfObjects_ = 0;
}
