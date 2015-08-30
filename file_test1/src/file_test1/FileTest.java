package file_test1;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("../image/个人照片.jpg");
		System.out.println("Does it exist? " + file.exists()); // true
		System.out.println("The file has " + file.length() + " bytes");  // 2333986 bytes
		System.out.println("Can it be read? " + file.canRead());  // true
		System.out.println("Can it be written? " + file.canWrite());  // true
		System.out.println("Is it a directory? " + file.isDirectory());  // false
		System.out.println("Is it a file? " + file.isFile());  // true
		System.out.println("Is it absolute? " + file.isAbsolute());  // false
		System.out.println("Is it hidden? " + file.isHidden());  // false
		
		// D:\study\JavaProject\file_test1\..\image\个人照片.jpg
		System.out.println("Absolute path is " + file.getAbsolutePath());
		
		// 2011-6-10 11:53:05
		System.out.println("Last modified on " + DateFormat.getDateTimeInstance()
				.format(new Date(file.lastModified())).toString());
	}

}
