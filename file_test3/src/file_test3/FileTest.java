package file_test3;

import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class FileTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		JFileChooser fileChooser = new JFileChooser();
		if (fileChooser.showOpenDialog(null) 
				== JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			Scanner input = new Scanner(file);
			while (input.hasNext()) {
				System.out.println(input.nextLine());
			}
			
			input.close();
		}
		else {
			System.out.println("No file selected");
		}
				
	}

}
