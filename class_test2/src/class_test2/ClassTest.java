package class_test2;
import javax.swing.*;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JButton buttonOK = new JButton("OK");
		JButton buttonCancel = new JButton("Cancel");
		JLabel labelName = new JLabel("Enter your name");
		JTextField textFieldName = new JTextField("Type Name Here");
		JCheckBox checkBoxBold = new JCheckBox("Bold");
		JCheckBox checkBoxItalic = new JCheckBox("Italic");
		JRadioButton radioButtonRed = new JRadioButton("Red");
		JRadioButton radioButtonYellow = new JRadioButton("Yellow");
		
		JPanel panel = new JPanel();
		panel.add(buttonOK);
		panel.add(buttonCancel);
		panel.add(labelName);
		panel.add(textFieldName);
		panel.add(checkBoxBold);
		panel.add(checkBoxItalic);
		panel.add(radioButtonRed);
		panel.add(radioButtonYellow);
		
		JFrame frame = new JFrame();
		frame.add(panel);
		frame.setTitle("Window 1");
		frame.setSize(400, 150);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
