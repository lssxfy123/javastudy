package class_test8;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �����޷�����Inner����
		// ԭ����InnerΪ�ڲ���
		// main����Ϊ��̬����
		// Inner��Ĺ��캯������
		// ClassTest����˵Ϊ��ʵ������
		// Inner inner = new Inner();
		
		// �������������ַ�ʽ������Inner����
		Inner inner = new ClassTest().new Inner();
		
		// Ҳ���Խ��ڲ��ඨ��Ϊstatic
		Inner1 inner1 = new Inner1();
	}
	
	class Inner {
		public Inner() {
			// TODO Auto-generated constructor stub
		}
	}
	
	static class Inner1 {
		public Inner1() {
			// TODO Auto-generated constructor stub
		}
	}

}
