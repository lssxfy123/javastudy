package file_test2;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

// import javax.print.attribute.standard.OutputDeviceAssigned;

public class FileTest {

	public static void main(String[] args) throws Exception {  //������Ҫ�����׳��쳣
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		
		// ����ļ��Ѵ��ڣ���������ļ��ĵ�ǰ����
		PrintWriter output = new PrintWriter(file);
		
		output.print("���� ");
		output.println("90");
		output.print("��ѧ ");
		output.println("95");
		output.print("Ӣ�� ");
		output.println("98");
		
		output.close();  // ������øú���
		
		Scanner input = new Scanner(file);  // ����ļ������ڻ��׳��쳣
		
		while (input.hasNext()) {
			System.out.println(input.next() + " " + input.nextInt());
		}
		
		input.close();
	}

}
