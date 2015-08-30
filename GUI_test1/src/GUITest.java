import javax.swing.JButton;
// import javax.swing.JComponent;
import javax.swing.JFrame;


public class GUITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("MyFrameWithCompoent");
		
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		JButton buttonOk = new JButton("OK");
		frame.add(buttonOk);
	}

}
