package file_test2;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

// import javax.print.attribute.standard.OutputDeviceAssigned;

public class FileTest {

	public static void main(String[] args) throws Exception {  //这里需要加上抛出异常
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		
		// 如果文件已存在，会废弃掉文件的当前内容
		PrintWriter output = new PrintWriter(file);
		
		output.print("语文 ");
		output.println("90");
		output.print("数学 ");
		output.println("95");
		output.print("英语 ");
		output.println("98");
		
		output.close();  // 必须调用该函数
		
		Scanner input = new Scanner(file);  // 如果文件不存在会抛出异常
		
		while (input.hasNext()) {
			System.out.println(input.next() + " " + input.nextInt());
		}
		
		input.close();
	}

}
