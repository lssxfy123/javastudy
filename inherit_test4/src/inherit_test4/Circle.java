package inherit_test4;

public class Circle {
	private double radius;
	
	public boolean equals(Object o) {

		if (o instanceof Circle) {
			return this.radius == ((Circle)o).radius;
		}
		else {
			return false;
		}
	}
	
//	public boolean equals(Circle circle) {
//
//		return this.radius == circle.radius;
//	}
}
