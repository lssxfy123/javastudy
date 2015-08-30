package interface_test2;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House house1 = new House(1, 175.5);
		System.out.println("house 1 area is " + house1.getArea());
		System.out.println("house 1 built date is " + house1.getBuiltDate());
		
		try {
			House house2 = (House)house1.clone();
			System.out.println("house 2 area is " + house2.getArea());
			System.out.println("house 2 built date is " + house2.getBuiltDate());
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
		}
		
	}

}
