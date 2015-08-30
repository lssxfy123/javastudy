package computearea;

import java.util.Scanner;

public class ComputeArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius;
		double area;
		
		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();
		area = radius * radius * 3.14159;
		input.close();
		
		
		System.out.println("The area for circle of radius " + radius + " is " + area);
		System.out.println(0xFFFF);
	}

}
