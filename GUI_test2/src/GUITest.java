import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class GUITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("FlowLayout");
		frame.setSize(400, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JButton buttonOK = new JButton("OK");
		JTextField textField = new JTextField(8);
		JLabel label = new JLabel("MI");
		JTextField textField2 = new JTextField(1);
		JLabel label2 = new JLabel("Last Name");
		JTextField textField3 = new JTextField(8);
		
		frame.add(buttonOK);
		frame.add(textField);
		frame.add(label);
		frame.add(textField2);
		frame.add(label2);
		frame.add(textField3);
		
		frame.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 20));
		
		frame.setVisible(true);
	}

}
