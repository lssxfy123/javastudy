package wrap_class_test4;

public class WrapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rational r1 = new Rational(4, 2);
		Rational r2 = new Rational(2, 3);
		
		System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
		System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
		System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
		System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
		System.out.println(r2 + " is " + r2.doubleValue());
	}

}
