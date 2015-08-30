package leapyear;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year : ");
		int year = input.nextInt();
		input.close();
		
		boolean is_leap_year = (((year % 4) == 0) && ((year % 100) != 0))
				               || ((year % 400) == 0);
		
		if (is_leap_year) {
			System.out.println(year + " is a leap year");
		}
		else {
			System.out.println(year + " is not a leap year");
		}

	}

}
