package guiinput;

import javax.swing.JOptionPane;

public class GUIInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String annual_interest_rate_string = JOptionPane.showInputDialog("Enter an input:");
		// System.out.println(annual_interest_rate_string.length());
		if (annual_interest_rate_string.length() == 0)
		{
			return;
		}
		
		double annual_interest_rate = 0;
		
		try
		{
			annual_interest_rate = Double
					.parseDouble(annual_interest_rate_string);
		}
		catch (NumberFormatException e)
		{
			System.out.println("input is not number");
			return;
		}
		
		double month_interest_rate = annual_interest_rate / 1200;
		JOptionPane.showMessageDialog(null, month_interest_rate, "Êä³öÎª£º", 
				JOptionPane.INFORMATION_MESSAGE);
		// System.out.println(month_interest_rate);
		
	}

}
